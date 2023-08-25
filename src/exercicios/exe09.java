package exercicios;
import java.util.*;

public class exe09 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é "F" ou "M". 
		 * Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o sexo da pessoa (M - F): ");
		char sexo = scanner.next().charAt(0);
		
		if (sexo == 'M') {
			System.out.println("M - Masculino");
		} else if( sexo == 'F') {
			System.out.println("F - Feminino");			
		} else {
			System.out.println("Sexo Inválido");				
		}
		scanner.close();
		
		

	}

}
