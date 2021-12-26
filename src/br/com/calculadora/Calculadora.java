package br.com.calculadora;

import java.util.Scanner;

public class Calculadora {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		double a, b;
		
		System.out.println("Digite o primeiro valor: ");
		a = scan.nextInt();
		System.out.println("Digite o segundo valor: ");
		b = scan.nextInt();
		
		/* ^2 L */
		double soma = soma(a,b); 
		double subtrai = subtrai(a,b);
    	double divide = divide(a,b);
		double multiplica = multiplica(a,b);
		
		System.out.println("O resultado de " + (a) + " + " + (b) + " é igual a " + (soma));
		System.out.println("O resultado de " + (a) + " - " + (b) + " é igual a " + (subtrai));
		System.out.println("O resultado de " + (a) + " / " + (b) + " é igual a " + (divide));
		System.out.println("O resultado de " + (a) + " * " + (b) + " é igual a " + (multiplica));
	
		scan.close();
	}
	
	public static double soma(double a, double b) {
		return a + b;
	}
	
	public static double subtrai(double a, double b) {
		return a - b;
	}
	
	public static double divide(double a, double b) {
		return a / b;
	}
	
	public static double multiplica(double a, double b) {
		return a * b;
	}
	
	
}
