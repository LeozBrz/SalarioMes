package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import entidade.Departamento;
import entidade.HorasContrato;
import entidade.Trabalhador;
import entidades.enums.NivelTrabalhador;

public class Programa {

	public static void main(String[] args) throws ParseException {
	Locale.setDefault(Locale.US);
	Scanner sc = new Scanner(System.in);

	SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
	System.out.print("INSIRA O NOME DO DEPARTAMENTO: ");
	String dep = sc.nextLine(); 
	System.out.printf("\nDADOS DO TRABALHADOR\n");
	System.out.print("NOME: ");
	String nome = sc.nextLine();
	System.out.print("NIVEL (JUNIOR, NIVEL_MEDIO OU ESPECIALISTA): ");
	String nivel = sc.nextLine();
	System.out.print("BASE SALARIAL: ");
	double baseSal = sc.nextDouble();
	Trabalhador trab = new Trabalhador(nome,NivelTrabalhador.valueOf(nivel), baseSal, new Departamento(dep));
	
	System.out.print("QUANTIDADE DE CONTRATOS: ");	
	int contratos = sc.nextInt();
	for(int i=0; i<contratos; i++) {
	System.out.printf("\nINSIRA O CONTRATO #%d\n", i+1);
	System.out.print("DATA: (DD/MM/AAAA): ");
	Date dataCont = sdf.parse(sc.next());
	System.out.print("VALOR POR HORA: ");
	Double valHora = sc.nextDouble();
	System.out.print("DURAÇÃO(HORAS): ");
	int horas = sc.nextInt();
	HorasContrato horaCont = new HorasContrato(dataCont, valHora, horas);
	trab.addContrato(horaCont);
	}
	System.out.println();
	System.out.print("ENTRE COM O MES E ANO PARA CALCULAR A RENDA(MM/AAAA): ");
	String mesAno = sc.next();
	int mes = Integer.parseInt(mesAno.substring(0,2));
	int ano = Integer.parseInt(mesAno.substring(3));
	System.out.println("Nome: " + trab.getNome());
	System.out.println("Departamento: " + trab.getDepartamento().getNome());
	System.out.println("Renda em " + mesAno + ": " + String.format("%.2f" , trab.renda(ano, mes)));
	
	sc.close();
	}

}
