package exercicios;
import java.util.*;

public class exe07 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça dois números e imprima o maior deles.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o primeiro numero: ");
		int n1 = scanner.nextInt();
		
		System.out.printf("Informe o segundo numero: ");
		int n2 = scanner.nextInt();
		
		if(n1 > n2) {
			System.out.printf("O maior numero é: " + n1 + " e o segundo é: " + n2);
		} else {
			System.out.printf("O maior numero é: " + n2 + " e o segundo é: " + n1);			
		}
		
		scanner.close();

	}

}
