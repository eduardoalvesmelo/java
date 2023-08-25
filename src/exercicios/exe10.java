package exercicios;
import java.util.*;

public class exe10 {

	public static void main(String[] args) {
		/*
		 * Faça um Programa que verifique se uma letra digitada é vogal ou consoante.
		 * 
		 * */
		
		Scanner scanner = new Scanner(System.in);
		
		System.out.printf("Informe uma letra: ");
		char letra = scanner.next().toLowerCase().charAt(0);
		
		if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
			System.out.println("A letra informada é uma vogal");
		} else {
			System.out.println("A letra informada é uma consoante");			
		}
		
		scanner.close();			

	}

}
