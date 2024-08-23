package br.com.kfveiculos;
public abstract class Veiculo {
	String marca;
	String modelo;
	int ano;
	Double preco;
	
	public String getMarca() {
		return marca;
	}

	public void setMarca(String marca) {
		this.marca = marca;
	}

	public String getModelo() {
		return modelo;
	}

	public void setModelo(String modelo) {
		this.modelo = modelo;
	}

	public int getAno() {
		return ano;
	}

	public void setAno(int ano) {
		this.ano = ano;
	}

	public Double getPreco() {
		return preco;
	}

	public void setPreco(Double preco) {
		this.preco = preco;
	}
	
	public Veiculo(String marca, String modelo, int ano, Double preco) {
		super();
		this.marca = marca;
		this.modelo = modelo;
		this.ano = ano;
		this.preco = preco;
	}
	
	public abstract double calcularValorDeRevenda();
	public abstract String exibirDetalhes();
}