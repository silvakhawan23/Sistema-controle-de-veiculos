package br.com.kfveiculos;

public class Carro extends Veiculo implements Imposto {

	int numeroDePortas;
	String tipoDeCombustivel;
	
	
	public Double calcularImposto() {
		return calcularValorDeRevenda()*0.1;
	}
	
	public int getNumeroDePortas() {
		return numeroDePortas;
	}

	public void setNumeroDePortas(int numeroDePortas) {
		this.numeroDePortas = numeroDePortas;
	}

	public String getTipoDeCombustivel() {
		return tipoDeCombustivel;
	}

	public void setTipoDeCombustivel(String tipoDeCombustivel) {
		this.tipoDeCombustivel = tipoDeCombustivel;
	}

	public Carro(String marca, String modelo, int ano, Double preco, int numeroDePortas, String tipoDeCombustivel) {
		super(marca, modelo, ano, preco);
		this.numeroDePortas = numeroDePortas;
		this.tipoDeCombustivel = tipoDeCombustivel;
	}
	public String exibirDetalhes() {
		return "Carro [marca=" + super.marca + ",modelo=" + super.modelo + ",ano=" + super.ano + ",preco=" + super.preco + ",numeroDePortas="+ this.numeroDePortas + ",tipoDeCombustivel="+this.tipoDeCombustivel + "]";
	}
	
	public double calcularValorDeRevenda() {
		return (super.preco*0.7) - super.ano*0.02;
	}
}
