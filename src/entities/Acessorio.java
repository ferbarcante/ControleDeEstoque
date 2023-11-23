package entities;

import java.util.Scanner;

public class Acessorio extends Peca implements Item{

    @Override
    public void venda() {
        Scanner scan = new Scanner(System.in);
        int quantidadeVendida = scan.nextInt();

        if(quantidadeVendida>0 && quantidadeVendida <= getQtd()){
            System.out.println("Venda concluida");
            setQtd(getQtd() - quantidadeVendida);
        } else {
            System.out.println("Quantidade inválida");
        }
    }

    public Acessorio(String descricao, int qtd, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, qtd, estoqueMinimo, estoqueMaximo);
    }
}
