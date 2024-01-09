package eCommerce;

import java.util.ArrayList;

public class Fornecedor extends Pessoa {
	
	private String email;
	private String cnpj;
	private ArrayList<String> tipoProduto;
	
	public Fornecedor(String nome, String telefone, ArrayList<String> endereco) {
		super(nome, telefone, endereco);
		this.email = email;
		this.cnpj = cnpj;
		this.tipoProduto = tipoProduto;
	}
	
	public Fornecedor() {}

	public void setTipoProduto() {
		String linha = scan.nextLine();
		while(linha != null) {
			tipoProduto.add(linha);
		}
		scan.close();
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getCnpj() {
		return cnpj;
	}

	public void setCnpj(String cnpj) {
		this.cnpj = cnpj;
	}
}