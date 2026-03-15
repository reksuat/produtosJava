package produtosJava;

import java.util.ArrayList;
import java.util.Iterator;

public class GerenciarProdutos {
	
	ArrayList<Produto> listaProdutos = new ArrayList<>();
	ArrayList<Produto> listaPedido = new ArrayList<>();
	public void adicionar(Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto cadastrado!");
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
	public Produto buscar(String nome) {
		for(Produto p : listaProdutos) {
			if (p.getNome().contains(nome)) {
				return p;
			}
		}
		return null;
	}
}
