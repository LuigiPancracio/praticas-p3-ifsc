package ex9;

public class PessoaMainA {
	
	public static void main(String[] args) {
	
		Pessoa p = new Pessoa();
		p.nome = "Luigi";
		p.cpf = 10141917l;
		p.nasc = "05/01/2006";
		
		Pessoa p1 = new Pessoa();
		p1.nome = "Bernardo";
		p1.cpf = 1054001l;
		p1.nasc = "26/01/2006";
		
		Pessoa p2 = new Pessoa();
		p2.nome = "Gustavo";
		p2.cpf = 102413l;
		p2.nasc = "21/10/2005";
		
		System.out.println(" O nome da pessoa é " + p.nome + " seu cpf é " + p.cpf + " e nasceu em " + p.nasc);
		System.out.println(" O nome da pessoa é " + p1.nome + " seu cpf é " + p1.cpf + " e nasceu em " + p1.nasc);
		System.out.println(" O nome da pessoa é " + p2.nome + " seu cpf é " + p2.cpf + " e nasceu em " + p2.nasc);
	}
}
