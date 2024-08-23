# Sistema-controle-de-veiculos

Tema: Sistema de Gestão de Veículos

Você deve desenvolver um sistema simples de gestão de veículos utilizando os conceitos de orientação a objetos em Java. O sistema deve permitir o cadastro de diferentes tipos de veículos, cada um com suas características específicas.

Requisitos:
Classe Abstrata: Crie uma classe abstrata Veiculo com os seguintes atributos:
marca: String
modelo: String
ano: int
preco: double
A classe Veiculo deve ter métodos abstratos para:
calcularValorDeRevenda(): que calculará o valor de revenda do veículo (implementação a ser definida nas subclasses).
exibirDetalhes(): que exibirá os detalhes do veículo.

Subclasses:

Crie duas subclasses de Veiculo:

Carro: deve ter atributos específicos como numeroDePortas (int) e tipoDeCombustivel (String). O valor de revenda do carro será 70% do preço original menos 2% por cada ano de uso.
Moto: deve ter atributos específicos como cilindradas (int). O valor de revenda da moto será 60% do preço original menos 3% por cada ano de uso.
Interface:

Crie uma interface Imposto com um método calcularImposto(). Este método deverá retornar o valor do imposto a ser pago, calculado como 10% do valor de revenda.
Implementação de Interface:

As classes Carro e Moto devem implementar a interface Imposto e definir a lógica para o cálculo do imposto.

O sistema deverá solicitar ao usuário o tipo de veículo a ser cadastrado (Carro ou Moto), e depois solicitar as informações pertinentes ao tipo selecionado. Ao final, o sistema deverá exibir os detalhes do veículo, o valor de revenda e o imposto calculado.
