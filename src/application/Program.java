package application;

import entities.*;

import java.util.Scanner;
import java.util.SortedMap;

public class Program {
    public static void main(String[] args) {

        Item[] itens = new Item[5];

        // Inicializando objetos variados
        itens[0] = new RoupaPMG("Camisa", 10, 5, 20, 5, 3);
        itens[1] = new RoupaTamanhoUnico("Saia", 15, 5, 20);
        itens[2] = new Acessorio("Cinto", 8, 3, 15);
        itens[3] = new Acessorio("Pulseira", 12, 6, 18);
        itens[4] = new RoupaPMG("Saída de praia", 20, 8, 25, 6,  4);

        Scanner scanner = new Scanner(System.in);
        int escolha;

        do {
            System.out.println("------------------------------------------");
            System.out.println(" 0 – Camisa\n" +
                    "1 – Saia\n" +
                    "2 – Cinto\n" +
                    "3 – Pulseira\n" +
                    "4 – Saída de praia\n" +
                    "5 – Sair do sistema");
            System.out.println("------------------------------------------");

            System.out.print("Escolha uma opção: ");
            escolha = scanner.nextInt();

            if (escolha >= 0 && escolha < itens.length) {
                // Executar a venda e reposição de estoque
                itens[escolha].venda();
                itens[escolha].reposicaoEstoque();
            } else if (escolha != itens.length) {
                System.out.println("Opção inválida. Tente novamente.");
            }

        } while (escolha != itens.length);

    }
}
