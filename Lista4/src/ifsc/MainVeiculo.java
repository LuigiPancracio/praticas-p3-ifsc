package ifsc;

public class MainVeiculo {

	public static void main(String[] args) {
		
		veiculo VeiculoA = new veiculo ();
		
		VeiculoA.setNome("Lancer");
		VeiculoA.setCor("Branca");
		VeiculoA.setAno(2019);
		
		System.out.println(" O veiculo é um "+ VeiculoA.getNome() + " de cor: " + VeiculoA.getCor()+ " modelo: "+ VeiculoA.getAno());
		
	}
}
