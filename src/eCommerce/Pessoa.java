package eCommerce;

import java.util.Scanner;
import java.util.ArrayList;

public abstract class Pessoa {

	Scanner scan = new Scanner(System.in);
	
	private int i;
	private String nome;
	private String telefone;
	private ArrayList<String> endereco;
	private String enderecoPrioritario;
	
	public Pessoa(String nome, String telefone, ArrayList<String> endereco) {
		this.nome = nome;
		this.telefone = telefone;
		this.endereco = endereco;
	}
	
	public Pessoa() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getTelefone() {
		return telefone;
	}
	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}
	public ArrayList<String> getEndereco() {
		return endereco;
	}
	
	public void setEndereço() {
		String linha = scan.nextLine();
		while(linha != null) {
			this.endereco.add(linha);
		}
		scan.close();
	}
	
	public String escolhaEnderecoPrioritario(Pessoa pessoa) {
		System.out.println("Por favor, escolha um endereço prioritário: ");
			for(i = 0; i < pessoa.getEndereco().size(); i++) {
				System.out.println("Posição i: " + pessoa.getEndereco().get(i));
			}
		i = scan.nextInt();
		enderecoPrioritario = pessoa.getEndereco().get(i);
		
		return enderecoPrioritario;
	}

	public String getEnderecoPrioritario() {
		return enderecoPrioritario;
	}	
}