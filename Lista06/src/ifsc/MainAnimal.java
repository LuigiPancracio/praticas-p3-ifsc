package ifsc;

public class MainAnimal {
	
	public static void main(String[] args) {
		
		Cachorro bixo1 = new Cachorro();
		
		bixo1.setNome("Bruce Lee");
		bixo1.setRaca("Akita Inu");
		bixo1.setComprimento((float)0.90 );
		bixo1.setNumerodepatas(4);
		bixo1.setCor("Beje");
		bixo1.setEcossistema("Casa do Luigi");
		
		Gato bixo2 = new Gato();
		
		bixo2.setNome("Gatito");
		bixo2.setRaca("Siames");
		bixo2.setComprimento((float)0.40 );
		bixo2.setNumerodepatas(4);
		bixo2.setCor("Branco");
		bixo2.setEcossistema("Casa");
		
		System.out.println(bixo1.getNome());
		System.out.println(bixo1.getRaca());
		System.out.println(bixo1.getComprimento());
		System.out.println(bixo1.getNumerodepatas());
		System.out.println(bixo1.getCor());
		System.out.println(bixo1.getEcossistema());
		
		bixo1.late();
		
		System.out.println(bixo2.getNome());
		System.out.println(bixo2.getRaca());
		System.out.println(bixo2.getComprimento());
		System.out.println(bixo2.getNumerodepatas());
		System.out.println(bixo2.getCor());
		System.out.println(bixo2.getEcossistema());
		
		bixo2.mia();
		
	}

}
