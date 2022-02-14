package aplicacao;

import java.util.Locale;
import java.util.Scanner;

import entidade.Departamento;
import entidade.Trabalhador;

public class Programa {

	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	Locale.setDefault(Locale.US);
	
	System.out.print("INSIRA O NOME DO DEPARTAMENTO: ");
	String dep = sc.nextLine(); 
	Departamento departamento = new Departamento(dep);
	
	System.out.printf("\nDADOS DO TRABALHADOR\n");
	System.out.print("NOME: ");
	String nome = sc.nextLine();
	System.out.print("NIVEL: ");
	int nivel = sc.nextInt();
	System.out.print("BASE SALARIAL: ");
	double baseSal = sc.nextDouble();
	System.out.print("QUANTIDADE DE CONTRATOS: ");	
	int contratos = sc.nextInt();
	
	Trabalhador trab = new Trabalhador(nome,nivel,baseSal);
	
	System.out.printf("\nINSIRA O CONTRATO #1\n");
	System.out.print("DATA: (DD/MM/AAAA): ");
	String data = sc.next();
	System.out.print("VALOR POR HORA: ");
	Double valHora = sc.nextDouble();
	System.out.print("DURAÇÃO(HORAS): ");
	int horas = sc.nextInt();
	
	sc.close();
	}

}
