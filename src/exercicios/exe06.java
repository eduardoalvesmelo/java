package exercicios;
import java.util.*;

public class exe06 {

	public static void main(String[] args) {
	/*
	 * Faça um Programa para uma loja de tintas. O programa deverá pedir o 
	 * tamanho em metros quadrados da área a ser pintada. Considere que a cobertura da tinta é de 1 litro para 
	 * cada 6 metros quadrados e que a tinta é vendida em latas de 18 litros, que custam R$ 80,00 
	 * ou em galões de 3,6 litros, que custam R$ 25,00.
	 * Informe ao usuário as quantidades de tinta a serem compradas e os respectivos preços em 3 situações:
	 * comprar apenas latas de 18 litros;
	 * comprar apenas galões de 3,6 litros;
	 * misturar latas e galões, de forma que o desperdício de tinta seja menor. Acrescente 10% de folga e 
	 * sempre arredonde os valores para cima, isto é, considere latas cheias.
	 * 
	 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o tamanho da area em m² a ser pintada: ");
		double area = scanner.nextDouble();		
		double lataGrandeAreaPintada = 108;
		double lataPequenaAreaPintada = 21.6;		
		double qtdLatasG = Math.ceil(area / lataGrandeAreaPintada);
		double qtdLatasP = Math.ceil(area / lataPequenaAreaPintada);		
		double valorLatasG = qtdLatasG * 80;
		double valorLatasP = qtdLatasP * 25;
		
		System.out.printf("\nQtde. Latas grandes: %.2f",qtdLatasG);
		System.out.printf("\nValor latas grandes: %.2f",valorLatasG);
		System.out.printf("\nArea pintada: %.2f",lataGrandeAreaPintada * qtdLatasG);
		
		System.out.printf("\n\nQtde. Latas pequenas: %.2f",qtdLatasP);
		System.out.printf("\nValor latas pequenas: %.2f",valorLatasP);
		System.out.printf("\nArea pintada: %.2f",lataPequenaAreaPintada * qtdLatasP);
		 
		scanner.close();

	}

}
