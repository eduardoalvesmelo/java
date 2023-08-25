package exercicios;
import java.util.*;

public class exe04 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que pergunte quanto você ganha por hora e o número de horas trabalhadas 
		 * no mês. Calcule e mostre o total do seu salário no referido mês, sabendo-se que são descontados 
		 * 11% para o Imposto de Renda, 8% para o INSS e 5% para o sindicato, faça um programa que nos dê:
		 * salário bruto. 
		 * quanto pagou ao INSS. 
		 * quanto pagou ao sindicato.
		 * o salário líquido.
		 * calcule os descontos e o salário líquido, conforme a tabela abaixo:
		 * + Salário Bruto : R$
		 * - IR (11%) : R$
		 * - INSS (8%) : R$
		 * - Sindicato ( 5%) : R$
		 * = Salário Liquido : R$
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe o valor da hora: ");
		double valorHora = scanner.nextDouble();
		
		System.out.printf("Informe a quantidade de dias trabalhados: ");
		double diasTrabalhados = scanner.nextDouble();
		
		double horasTrabalhadas = diasTrabalhados * 8;
		double salarioBruto = horasTrabalhadas * valorHora;
		double valorIR = salarioBruto * 0.11;
		double valorINSS = salarioBruto * 0.08;
		double valorSIND = salarioBruto * 0.05;
		double valorDescontos = valorINSS - valorIR - valorSIND;
		double salarioLiquido = salarioBruto - valorDescontos;
		
		System.out.printf("\n+ Salário Bruto : R$ %.2f", salarioBruto);
		System.out.printf("\n- IR 11%% : R$ %.2f", valorIR);
		System.out.printf("\n- INSS 8%% : R$ %.2f", valorINSS);
		System.out.printf("\n- Sindicato 5%% : R$ %.2f", valorSIND);
		System.out.printf("\n- Total descontos : R$ %.2f", valorDescontos * -1);
		System.out.printf("\n= Salário Liquido : R$ %.2f", salarioLiquido);
		scanner.close();
		

	}

}
