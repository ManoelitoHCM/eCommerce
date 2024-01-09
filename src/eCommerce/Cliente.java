package eCommerce;

import java.util.ArrayList;

public class Cliente extends Pessoa {
	private int i;
	private String cpf;
	private boolean desejaMsgPromo;
		
	public Cliente(String nome, String telefone, ArrayList<String> endereco, String cpf, boolean desejaMsgPromo) {
		super(nome, telefone, endereco);
		this.cpf = cpf;
		this.desejaMsgPromo = desejaReceberMsgPromo();
	}
	
	public Cliente() {}
	
	public boolean desejaReceberMsgPromo() {
		System.out.println("Por favor, escolha se deseja receber mensagens promocionais com \"Sim\" ou \"Não\": ");
		String opcao = scan.nextLine();
		if(opcao == "Sim") {
			desejaMsgPromo = true;
		} else {
			desejaMsgPromo = false;
		}
		return desejaMsgPromo;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public boolean getDesejaMsgPromo() {
		return desejaMsgPromo;
	}
}