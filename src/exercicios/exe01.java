package exercicios;
import java.util.*;

class exe01 {

	public static void main(String[] args) {
		/*
		 * Tendo como dados de entrada a altura de uma pessoa, construa 
		 * um algoritmo que calcule seu peso ideal, usando a seguinte fórmula: (72.7*altura) - 58
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe a altura: ");
		double altura = scanner.nextDouble();
		
		double pesoIdeal = (72.7 * altura) - 58;
		
		System.out.printf("\nAltura: %.2f", altura);
		System.out.printf("\nPeso ideal: %.2f", pesoIdeal);
		
		scanner.close();
	}

}
