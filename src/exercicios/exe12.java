package exercicios;
import java.util.*;

public class exe12 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia três números e mostre o maior deles.
		 * 
		 * */
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro numero: ");
		int n1 = scanner.nextInt();
		
		System.out.printf("Informe o segundo numero: ");
		int n2 = scanner.nextInt();
		
		System.out.printf("Informe o terceiro numero: ");
		int n3 = scanner.nextInt();
		
		if (n1 > n2 && n1 > n3) {
			System.out.println("O maior numero é: " + n1);
		} else if (n2 > n3 && n2 > n1) {
			System.out.println("O maior numero é: " + n2);
		} else {
			System.out.println("O maior numero é: " + n3);			
		}
		
		scanner.close();				
	}

}
