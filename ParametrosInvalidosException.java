package DesafioControleFluxo;

// Definição da classe de exceção personalizada
class ParametrosInvalidosException extends Exception {
    public ParametrosInvalidosException(String mensagem) {
        super(mensagem); // Chama o construtor da classe Exception com a mensagem
    }
}

