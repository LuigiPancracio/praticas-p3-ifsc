package ex11;

import java.util.Scanner;

public class PessoaMainB {

	public static void main(String[] args) {
		
		Scanner leitura = new Scanner (System.in);
		
		Pessoa [] dado = new Pessoa [3];
		
		int i;
		
		for(i=0; i < 3; i++) {
		Pessoa dado1 = new Pessoa();
		dado1.nome = leitura.nextLine();
		dado1.cpf = leitura.nextLine();
		dado1.data = leitura.nextLine();
		dado[i] = dado1;
		}
		
		for ( i = 0; i < 3; i++) {
			System.err.println("O Seu nome é " + dado[i].nome + " Seu cpf é " + dado[i].cpf + " E nasceu em " + dado[i].data );
		}
	}
}