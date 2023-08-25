package exercicios;
import java.util.*;

public class exe05 {

	public static void main(String[] args) {
		/*
		 * Faça um programa para uma loja de tintas. O programa deverá pedir o 
		 * tamanho em metros quadrados da área a ser pintada. Considere que a 
		 * cobertura da tinta é de 1 litro para cada 3 metros quadrados e que a 
		 * tinta é vendida em latas de 18 litros, que custam R$ 80,00. Informe ao 
		 * usuário a quantidades de latas de tinta a serem compradas e o preço total.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o tamanho da area em m² a ser pintada: ");
		double area = scanner.nextDouble();
		
		double qtdLatas = area / 54;
		double valorTotal = qtdLatas * 80;
		
		 System.out.printf("\nQtde. Laras: %.2f",qtdLatas);
		 System.out.printf("\nValor total: %.2f",valorTotal);
		
		scanner.close();
		
		

	}

}
