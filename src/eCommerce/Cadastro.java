package eCommerce;

import java.util.Scanner;

public class Cadastro {
	
	private Produto produto;
	private Cliente cliente;
	private Fornecedor fornecedor;
	
	Scanner scan = new Scanner(System.in);
		
	public void cadastrarProduto() {
		produto = new Produto();
		System.out.println("Cadastre o produto inserindo os seguintes dados: ");
		System.out.println("Nome do produto: ");
		produto.setNome(scan.nextLine());
		System.out.println("Descrição do produto: ");
		produto.setDescricao(scan.nextLine());
		System.out.println("Tipo do produto: ");
		produto.setTipoProduto(scan.nextLine());
		System.out.println("Cor do produto: ");
		produto.setCor(scan.nextLine());
		System.out.println("Característica do produto: ");
		produto.setCaracteristica(scan.nextLine());
		System.out.println("Valor do custo unitário: ");
		produto.setValorCustoUnitario(scan.nextDouble());
		System.out.println("Valor do percentual do lucro de venda: ");
		produto.setPercentualLucroVenda(scan.nextDouble());
		
		System.out.println("Produto cadastrado no sistema!");		
	}
	
	public void cadastrarCliente() {
		cliente = new Cliente();
		System.out.println("Cadastre o cliente inserindo os seguintes dados: ");
		System.out.println("Nome do cliente: ");
		cliente.setNome(scan.nextLine());
		System.out.println("CPF do cliente: ");
		cliente.setCpf(scan.nextLine());
		System.out.println("Telefone do cliente: ");
		cliente.setTelefone(scan.nextLine());
		System.out.println("Endereços do cliente: ");
		cliente.setEndereço();
		cliente.escolhaEnderecoPrioritario(cliente);
		cliente.desejaReceberMsgPromo();
	}
	
	public void cadastrarFornecedor() {
		fornecedor = new Fornecedor();
		System.out.println("Cadastre o fornecedor inserindo os seguintes dados: ");
		System.out.println("Nome do fornecedor: ");
		fornecedor.setNome(scan.nextLine());
		System.out.println("CNPJ do fornecedor: ");
		fornecedor.setCnpj(scan.nextLine());
		System.out.println("E-mail do fornecedor: ");
		fornecedor.setEmail(scan.nextLine());
		System.out.println("Telefone do fornecedor: ");
		fornecedor.setTelefone(scan.nextLine());
		System.out.println("Endereços do fornecedor: ");
		fornecedor.setEndereço();
		fornecedor.escolhaEnderecoPrioritario(fornecedor);
		System.out.println("Tipos de produto vendidos pelo fornecedor: ");
		fornecedor.setTipoProduto();
	}
}