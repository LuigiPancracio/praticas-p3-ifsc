package ifsc;

import java.util.Scanner;

public class HelloWorld {

	public static void main(String[] args) {
		// Viabiliza a leitura de dados//
		Scanner leitura = new Scanner(System.in);
		
		System.out.println("Nome:");
		
		// Faz a leitura e guarda o conteudo em uma variavel//
		String nome = leitura.nextLine();
		
		System.out.println("Idade:");
		String idadeStr = leitura.nextLine();
		
		Double idade = Double.valueOf(idadeStr);
		
		System.out.println(nome + " tem " + idade);
		

	}

}
