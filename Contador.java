package DesafioControleFluxo;

import java.util.Scanner;

public class Contador {
public static void main(String[] args) {

    Scanner leitura = new Scanner(System.in);

    System.out.println("Digite o primeiro parâmetro:");
    int parametroUm = leitura.nextInt();

    System.out.println("Digite o segundo parâmetro:");
    int parametroDois = leitura.nextInt();

    try {
        // Chamando o método de contagem
        contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException e) {
        // Captura e exibe a mensagem de erro caso os parâmetros sejam inválidos
        System.out.println("O segundo parâmetro deve ser maior que o primeiro");
    }

    leitura.close(); // Fechar Scanner para evitar vazamento de recursos
}

static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    // Validação: o segundo parâmetro deve ser maior que o primeiro
    if (parametroUm > parametroDois) {
        throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm; // Determina quantas vezes o loop rodará

    // Loop para imprimir os números de 1 até a contagem
    for (int i = 1; i <= contagem; i++) {
        System.out.printf("Imprimindo o número %d\n", i);
    }
}
    
}

