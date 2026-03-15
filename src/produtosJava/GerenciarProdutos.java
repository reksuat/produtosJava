package produtosJava;

import java.util.ArrayList;
import java.util.Scanner;

public class GerenciarProdutos {
	Scanner sc = new Scanner(System.in);
	
	ArrayList<Produto> listaProdutos = new ArrayList<>();
	ArrayList<Produto> listaPedido = new ArrayList<>();
	public void adicionar(Produto p) {
		listaProdutos.add(p);
		System.out.println("Produto cadastrado!");
	}
	public void listarProduto() {
		if(listaProdutos.isEmpty()) { 
			System.out.println("Sem estoque, redirecionando para o cadastro!");
			
			System.out.print("Nome: ");
	        String n = sc.nextLine();
	        System.out.print("Preço: ");
	        double v = sc.nextDouble();
	        System.out.print("Quantidade: ");
	        int q = sc.nextInt();
	        sc.nextLine();
	        
			Produto p = new Produto(n, v, q);
			
			listaProdutos.add(p);
			System.out.println("Produto cadastrado!");
		}
			System.out.println("\n ===LOJA===");
			for (Produto p : listaProdutos) {
				System.out.println("Produto: "+p.getNome()+" - R$"+p.getValor()+" - Quantidade: "+p.getQuantidade());
			}
		}
	
	public Produto buscar(String nome) {
		for(Produto p : listaProdutos) {
			if (p.getNome().contains(nome)) {
			        System.out.println("Produto: " + p.getNome() + " | R$ " + p.getValor());
			        return p;
			    }
			}
		return null;
	}
	public void remover(String nome) {
	    boolean removido = listaProdutos.removeIf(p -> p.getNome().equalsIgnoreCase(nome));
	    
	    if (removido) {
	        System.out.println("Produto removido com sucesso!");
	    } else {
	        System.out.println("Produto não encontrado.");
	    }
	}
	
	public void adicionarPedido(String nome) {
	    Produto p = buscar(nome);
	    if (p != null) {
	        listaPedido.add(p);
	        System.out.println(p.getNome() + " adicionado ao seu pedido!");
	    } else {
	        System.out.println("Produto não encontrado para o pedido.");
	    }
	}
	public void listarPedido() {
		if(listaPedido.isEmpty()) { 
			System.out.println("Você ainda não fez nenhum pedido!");	
	}
		else {
			System.out.println("\n===SEU PEDIDO===");
			for(Produto p: listaPedido) {
				System.out.println("- " + p.getNome() + " | R$ " + p.getValor());
			}
		}
	}
}
