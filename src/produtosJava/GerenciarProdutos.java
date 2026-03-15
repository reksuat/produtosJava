package produtosJava;

import java.util.ArrayList;

public class GerenciarProdutos {
	
	ArrayList<Produto> listaProdutos = new ArrayList<>();
	
	public void adicionar(Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto adicionado!");
	}
	public void listarProduto() {
		if(listaProdutos.isEmpty()) { 
			System.out.println("Sem estoque!");
		}
		else {
			System.out.println("\n ===LOJA===");
			for (Produto p : listaProdutos) {
				System.out.println("Produto: "+p.getNome()+" - R$"+p.getValor()+" - Quantidade: "+p.getQuantidade());
			}
		}
	}
}
