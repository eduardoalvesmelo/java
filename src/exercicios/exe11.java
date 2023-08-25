package exercicios;
import java.util.*;

public class exe11 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para a leitura de duas notas parciais de um aluno. 
		 * O programa deve calcular a média alcançada por aluno e apresentar:
		 * A mensagem "Aprovado", se a média alcançada for maior ou igual a sete;
		 * A mensagem "Reprovado", se a média for menor do que sete;
		 * A mensagem "Aprovado com Distinção", se a média for igual a dez.
		 *  
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a primeira nota: ");
		double nota1 = scanner.nextDouble();
		
		System.out.println("Informe a segunda nota: ");
		double nota2 = scanner.nextDouble();
		
		double media = (nota1 + nota2) / 2;
		
		if (media >= 7 && media <= 9.9) {
			System.out.println("Aluno aprovado com média: " + media);
		} else if (media < 7) {
			System.out.println("Aluno reprovado com média: " + media);			
		} else {
			System.out.println("Aluno aprovado com distinção com média: " + media);			
		}
		
		scanner.close();

	}

}
