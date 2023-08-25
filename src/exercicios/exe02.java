package exercicios;
import java.util.*;

public class exe02 {

	public static void main(String[] args) {
		/*
		 * Tendo como dado de entrada a altura (h) de uma pessoa, construa um 
		 * algoritmo que calcule seu peso ideal, utilizando as seguintes fórmulas:
		 * Para homens: (72.7*h) - 58
		 * Para mulheres: (62.1*h) - 44.7
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.println("Informe a altura");
		double altura = scanner.nextDouble();
		
		double pesoIdealHomem = (72.7*altura) - 58;
		double pesoIdealMulher = (62.1*altura) - 44.7;
		
		System.out.printf("\nAltura informada: %.2f", altura);
		System.out.printf("\nPeso ideal para homens: %.2f", pesoIdealHomem);
		System.out.printf("\nPeso ideal para mulheres: %.2f", pesoIdealMulher);
		
		scanner.close();
		
		
	}
}
