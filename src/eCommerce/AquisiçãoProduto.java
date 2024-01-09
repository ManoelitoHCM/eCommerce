package eCommerce;

import java.util.Scanner;

public class AquisiçãoProduto {
	
	Scanner scan = new Scanner(System.in);
	
	Produto produto;
	Fornecedor fornecedor;

	private int tempoEntrega;
	private String cidadeOrigem;
	private String dataCompra;
	private int qtdCompra;
	
	public void novaCompra(Produto produto, Estoque estoque, Fornecedor fornecedor) {
		System.out.println("Uma nova aquisição do produto "+ produto.getNome() +" está sendo realizada. Insira o tipo do produto escolhido: ");
		produto.setTipoProduto(scan.nextLine());
		System.out.println("Insira quantidade, valor unitário de cada produto, data da compra e nome do fornecedor, nesta ordem: ");
		qtdCompra = scan.nextInt();
		estoque.adquirirProduto(produto, qtdCompra);
		produto.setValorCustoUnitario(scan.nextDouble());
		dataCompra = scan.nextLine();
		fornecedor.setNome(scan.nextLine());
	}
	
	public int getTempoEntrega() {
		return tempoEntrega;
	}
	public void setTempoEntrega(int tempoEntrega) {
		this.tempoEntrega = tempoEntrega;
	}
	public String getCidadeOrigem() {
		return cidadeOrigem;
	}
	public void setCidadeOrigem(String cidadeOrigem) {
		this.cidadeOrigem = cidadeOrigem;
	}

	public String getDataCompra() {
		return dataCompra;
	}
	public void setDataCompra(String dataCompra) {
		this.dataCompra = dataCompra;
	}
}
