package ex10;

import java.util.Scanner;

public class ex10 {

	public static void main(String[] args) {
		
		Animal animal = new Animal();
		
		animal.nomeCientifico = "Canis lupus ";
		animal.familia = "Canídeos";
		animal.reino = "Animalia";
		
		String[] vetorNomePop = new String[5];
		
		vetorNomePop[0] = "Cusco";
		vetorNomePop[1] = "Guaipeca";
		vetorNomePop[2] = "Jaguara";
		vetorNomePop[3] = "Pangaré";
		vetorNomePop[4] = "Bruce";
	
		animal.nomesPopulares = vetorNomePop;
		
		System.out.println("nome cientifico = " + animal.nomeCientifico);
		System.out.println("Familia = " + animal.familia);
		System.out.println("Reino = " + animal.reino);
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Os nomes populares são: " + animal.nomesPopulares[i]);
		}
		}
	}
