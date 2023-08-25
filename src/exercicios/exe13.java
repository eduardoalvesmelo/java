package exercicios;
import java.util.*;

public class exe13 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que leia três números e mostre o maior e o menor deles.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro numero: ");
		int n1 = scanner.nextInt();
		
		System.out.printf("Informe o segundo numero: ");
		int n2 = scanner.nextInt();
		
		System.out.printf("Informe o terceiro numero: ");
		int n3 = scanner.nextInt();
		
		int maior = 0;
		int menor = 0;
		
		if (n1 > n2 && n1 > n2 ) {
			maior = n1;
			if (n2 > n3) {
				menor = n3;				
			} else {
				menor = n2;
			}
		} else if (n2 > n3 && n2 > n1 ) {
			maior = n2;
			if (n3 > n1) {
				menor = n1;				
			} else {
				menor = n3;		
			}
		} else {
			maior = n3;
			menor = n1;
		}
		System.out.println("O Maior numero: " + maior + " e Menor numero: " + menor);
		scanner.close();

	}

}
