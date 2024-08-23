package br.com.kfveiculos;
public class Moto extends Veiculo implements Imposto {

	int cilindradas;
	
	public String exibirDetalhes() {
		return "Moto [marca=" + super.marca + ",modelo=" + super.modelo + ",ano=" + super.ano + ",preco=" + super.preco + ",cilindradas="+ this.cilindradas + "]";
	}
	
	public Double calcularImposto() {
		return calcularValorDeRevenda()*0.1;
	}
	
	public Moto(String marca, String modelo, int ano, Double preco, int cilindradas) {
		super(marca, modelo, ano, preco);
		this.cilindradas = cilindradas;
	}
	
	public int getCilindradas() {
		return cilindradas;
	}

	public void setCilindradas(int cilindradas) {
		this.cilindradas = cilindradas;
	}

	public double calcularValorDeRevenda() {
		return (super.preco*0.6) - super.ano*0.03;
	}
}
