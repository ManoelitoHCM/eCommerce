package eCommerce;

import java.util.Scanner;

public class Estoque {
	
	Scanner scan = new Scanner(System.in);
	
	Estoque estoque = new Estoque();
	
	private int movimentacaoEstoque;
		
	public void adquirirProduto(Produto produto, int movimentacaoEstoque) {
		produto.setQtdEstoque(produto.getQtdEstoque(), movimentacaoEstoque);
		System.out.println("Produto adquirido, novo estoque é igual a: "+ produto.getQtdEstoque());
	}
	
	public void venderProduto(Produto produto, int movimentacaoEstoque) {
		if(produto.getQtdEstoque() < movimentacaoEstoque) {
			System.out.println("O produto não está em quantidade suficiente para realizar o pedido. A quantidade disponível do produto é: "+ produto.getQtdEstoque());
		} else {
			produto.setQtdEstoque(produto.getQtdEstoque(), -movimentacaoEstoque);
		}
	}
	
	public void verificarEstoque(Produto produto) {
		//valor mínimo de estoque escolhido arbitrariamente
		if(produto.getQtdEstoque() < 20) {
			System.out.println("O produto "+ produto.getNome() +" está prestes a acabar em seu estoque, favor fazer novo pedido junto ao fornecedor.");
		} else if(produto.getQtdEstoque() < 0) {
			System.out.println("O produto "+ produto.getNome() +" está em falta. Deseja realizar um chamado junto ao fornecedor? Responda com \"Sim\" ou \"Não\".");

			String opcao = scan.nextLine();
			switch (opcao) {
				case "Sim": System.out.println("Novo pedido efetuado."); 
				estoque.adquirirProduto(produto, movimentacaoEstoque);
				break;
			
				case "Não": System.out.println("Opção registrada.");
				break;
				
				default: System.out.println("Favor inserir opção válida.");
			}
		}
	}
	
	public int getMovimentacaoEstoque() {
		return movimentacaoEstoque;
	}

	public void setMovimentacaoEstoque(int movimentacaoEstoque) {
		this.movimentacaoEstoque = movimentacaoEstoque;
	}
}