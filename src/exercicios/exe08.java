package exercicios;
import java.util.*;

public class exe08 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que peça um valor e mostre na tela se o valor é positivo ou negativo.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe um numero: ");
		int n = scanner.nextInt();
		
		System.out.println("\nNumero informado: " + n);
		if (n > 0) {
			System.out.println("\nO numero é positivo!!!");
		}	else {
			System.out.println("\nO numero é negativo!!!");			
		}
		
		scanner.close();
	}

}
