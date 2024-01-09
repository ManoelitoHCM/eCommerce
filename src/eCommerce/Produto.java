package eCommerce;

public class Produto {
	private String nome;
	private String descricao;
	private String tipoProduto;
	private String cor;
	private String caracteristica;
	private double valorCustoUnitario;
	private double percentualLucroVenda;
	private int qtdEstoque;
	
	public Produto(String nome, String descricao, String tipoProduto, String cor, String caracteristica,
			double valorCustoUnitario, double percentualLucroVenda) {
		this.nome = nome;
		this.descricao = descricao;
		this.tipoProduto = tipoProduto;
		this.cor = cor;
		this.caracteristica = caracteristica;
		this.valorCustoUnitario = valorCustoUnitario;
		this.percentualLucroVenda = percentualLucroVenda;
	}
	
	public Produto() {}
	
	public String getNome() {
		return nome;
	}
	public void setNome(String nome) {
		this.nome = nome;
	}
	public String getDescricao() {
		return descricao;
	}
	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}
	public String getTipoProduto() {
		return tipoProduto;
	}
	public void setTipoProduto(String tipoProduto) {
		this.tipoProduto = tipoProduto;
	}
	public String getCor() {
		return cor;
	}
	public void setCor(String cor) {
		this.cor = cor;
	}
	public String getCaracteristica() {
		return caracteristica;
	}
	public void setCaracteristica(String caracteristica) {
		this.caracteristica = caracteristica;
	}
	public double getValorCustoUnitario() {
		return valorCustoUnitario;
	}
	public void setValorCustoUnitario(double valorCustoUnitario) {
		this.valorCustoUnitario = valorCustoUnitario;
	}
	public double getPercentualLucroVenda() {
		return percentualLucroVenda;
	}
	public void setPercentualLucroVenda(double percentualLucroVenda) {
		this.percentualLucroVenda = percentualLucroVenda;
	}
	public int getQtdEstoque() {
		return qtdEstoque;
	}
	public void setQtdEstoque(int qtdEstoque, int movimentacaoEstoque) {
		this.qtdEstoque = qtdEstoque + movimentacaoEstoque;
	}
}