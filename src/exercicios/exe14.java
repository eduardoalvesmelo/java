package exercicios;
import java.util.*;

public class exe14 {

	public static void main(String[] args) {
		/*
		 * Faça um programa que pergunte o preço de três produtos e informe qual produto 
		 * você deve comprar, sabendo que a decisão é sempre pelo mais barato.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o valor do primeiro produto: ");
		double p1 = scanner.nextDouble();

		System.out.printf("Informe o valor do segundo produto: ");
		double p2 = scanner.nextDouble();

		System.out.printf("Informe o valor do terceiro produto: ");
		double p3 = scanner.nextDouble();
		
		double menor = 0;
		
		if (p1 < p2 && p1 < p3) {
			menor = p1;			
		} else if (p2 < p3 && p2 < p1) {
			menor = p2;
		} else {
			menor = p3;
		}
		
		System.out.println("Valor dos produtos informados: ");
		System.out.println("P1: " + p1);
		System.out.println("P2: " + p2);
		System.out.println("P3: " + p3);
		System.out.println("Valor do produto comprado: " + menor);
	}

}
