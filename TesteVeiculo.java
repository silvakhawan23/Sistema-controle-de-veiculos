package br.com.kfveiculos;

public class TesteVeiculo {
	
	static Veiculo[] listaVeiculo = new Veiculo[10];
	public static void main(String[] args) {
		while (true) {
			menu();
		}
	}
	
	public static void menu() {
		int opcao = Teclado.lerInteiro(" 1-Cadastrar\n 2-Alterar\n 3-Excluir\n 4-Consultar\n 5-Sair");
		switch (opcao) {
		case 1:
			cadastrar();
			break;
		case 2:
			alterar();
			break;
		case 3:
			excluir();
			break;
		case 4:
			consultar();
			break;
		case 5:
			System.out.println("Logout");
			System.exit(0);
			break;
		}
	}
	
	public static void cadastrar() {
		Veiculo carro = null;
		Veiculo moto = null;
		String marca = Teclado.lerString("Marca:");
		String modelo = Teclado.lerString("Modelo:");
		int ano = Teclado.lerInteiro("Ano:");
		Double preco = Teclado.lerDouble("Preco:");
		int tipoVeiculo = Teclado.lerInteiro("Tipo de veiculo: 1- Carro 2-Moto");
		
		if (tipoVeiculo == 1) {
			int numeroDePortas = Teclado.lerInteiro("Numero de portas:");
			String tipoDeCombustivel = Teclado.lerString("Tipo de combustivel:");
	
			carro = new Carro(marca,modelo,ano,preco,numeroDePortas,tipoDeCombustivel);
		} else {
			int cilindradas = Teclado.lerInteiro("Cilindradas:");
			
			moto = new Moto(marca,modelo,ano,preco,cilindradas);
		}
		
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] == null) {
				listaVeiculo[i] = carro == null ? moto : carro;
				System.out.println("Veiculo cadastrado com sucesso!");
				break;
				
			}
		}
	}
	
	public static void alterar() {
		String modelo = Teclado.lerString("Informe o modelo:");
		
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] != null && listaVeiculo[i].getModelo().equals(modelo)) {
				String marca = Teclado.lerString("Nova marca:");
				int ano = Teclado.lerInteiro("Novo ano:");
				Double preco = Teclado.lerDouble("Novo preco:");
				
				if(listaVeiculo[i] instanceof Carro) {
					int numeroDePortas = Teclado.lerInteiro("Novo numeroDePortas:");
					String tipoDeCombustivel = Teclado.lerString("Novo tipoDeCombustivel:");
					listaVeiculo[i] = new Carro(marca,modelo,ano,preco,numeroDePortas,tipoDeCombustivel);
				} else {
					//Moto
					int cilindradas = Teclado.lerInteiro("Nova cilindradas:");
					listaVeiculo[i] = new Moto(marca,modelo,ano,preco,cilindradas);
				}
			}
		}
	}
	
	public static void excluir() {
		String modelo = Teclado.lerString("Informe o modelo:");
		
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] != null && listaVeiculo[i].getModelo().equals(modelo)) {
				listaVeiculo[i] = null;
				System.out.println("Veiculo excluido com sucesso!");
				break;
				
			}
		}
	}
	
	public static void consultar() {
		for (int i = 0; i < listaVeiculo.length; i++) {
			if(listaVeiculo[i] != null) {
				System.out.println(listaVeiculo[i].exibirDetalhes());
			}
		}
	}
}
