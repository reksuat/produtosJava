package produtosJava;

import java.util.ArrayList;

public class GerenciarProdutos {
	
	ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public void adicionar(Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto adicionado!");
	}
}
