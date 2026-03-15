package produtosJava;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	GerenciarProdutos loja = new GerenciarProdutos();
	
	
//	loja.adicionar(new Produto("Teclado", 200.00, 10));
//    loja.adicionar(new Produto("Mouse", 120.00, 15));
//    loja.adicionar(new Produto("Computador", 1800.00, 5));
//    loja.adicionarPedido("Teclado");
//    loja.adicionarPedido("Computador");
//    loja.listarProduto();
//    loja.listarPedido();
//    System.out.println("Pesquise o produto: ");
//	String nome = sc.nextLine();
//	loja.buscar(nome);
//	loja.remover("Teclado");
//	loja.listarProduto();
    
    
	int opcao=0;
	while(opcao!=0) {
		System.out.println("\n ===MENU===");
		System.out.println("1- Add produtos");
		System.out.println("2- Listar Produtos");
		System.out.println("3- Adicionar pedido");
		System.out.println("4- Listar pedido");
		System.out.println("0-Sair");
		opcao = sc.nextInt();
	    sc.nextLine();
		switch (opcao) {
		case 1: 
			System.out.println("Nome: ");
			String n = sc.nextLine();
			System.out.println("Preço: ");
			double v = sc.nextDouble();
			System.out.println("Quantidade: ");
			int q = sc.nextInt();
			loja.adicionar(new Produto(n, v, q));
			break;
		case 2:
			loja.listarProduto();
			break;
		case 3: 
			System.out.println("Pesquise o produto: ");
			String nome = sc.nextLine();
			loja.adicionarPedido(nome);
			break;
		case 4:
			loja.listarPedido();
			break;
		case 0:
			System.out.println("FIM");
			break;
		}
	}
	sc.close();
}
}
