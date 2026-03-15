package produtosJava;

import java.util.Scanner;

public class main {
	public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	GerenciarProdutos loja = new GerenciarProdutos();
	
	loja.adicionar(new Produto("Teclado", 200.00, 10));
    loja.adicionar(new Produto("Mouse", 120.00, 15));
    loja.adicionar(new Produto("Computador", 1800.00, 5));
    loja.adicionar(new Produto("Headset", 90.00, 20));
    loja.listarProduto();
    
	int opcao=0;
	
	while(opcao!=0) {
		System.out.println("\n ===MENU===");
		System.out.println("1- Add produtos");
		System.out.println("2- Listar Produtos");
		System.out.println("3- Adicionar pedido");
		System.out.println("4- Listar pedido");
		System.out.println("0-Sair");
		
		switch (opcao) {
		case 1: 
			break;
		case 2:
			break;
		case 3: 
			break;
		case 4:
			break;
		case 0:
			System.out.println("FIM");
			break;
		}
	}
	}

}
