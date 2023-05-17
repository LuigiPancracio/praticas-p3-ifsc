	package ifsc;

	import java.util.ArrayList;

	public class MainProduto {

		public static void main(String[] args) {


			Produto a = new Produto();
			Produto b = new Produto();
			Produto c = new Produto();


	a.setNome("Café Especial Melitta");
	a.setCodBarras ((long) 145679);
	a.setFornecedor("Distribuirdora Melitta");
	a.setPreço(25.90);


	b.setNome("Café Extraforte Melitta");
	b.setCodBarras ((long) 145680);
	b.setFornecedor("Distribuirdora Melitta");
	b.setPreço(15.90);


	c.setNome("Café Tradicional Melitta");
	c.setCodBarras ((long) 145681);
	c.setFornecedor("Distribuirdora Melitta");
	c.setPreço(15.90);

	ArrayList<Produto> Café = new ArrayList<Produto>();

	Café.add(a);
	Café.add(b);
	Café.add(c);

	int i = Café.size();
	for (int n = 0; n < i; n++) {

		System.out.println(Café.get(n).getNome());
		System.out.println(Café.get(n).getCodBarras());
		System.out.println(Café.get(n).getFornecedor());
		System.out.println(Café.get(n).getPreço());

		}

	}

}