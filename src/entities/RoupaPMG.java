package entities;

import java.util.Scanner;

public class RoupaPMG implements Item{

    private String descricao;
    private int quantidadeP;
    private int quantidadeM;
    private int quantidadeG;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public RoupaPMG(String descricao, int quantidadeG, int quantidadeM, int quantidadeP, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.quantidadeM = quantidadeM;
        this.estoqueMinimo = estoqueMinimo;
        this.quantidadeG = quantidadeG;
        this.quantidadeP = quantidadeP;
        this.estoqueMaximo = estoqueMaximo;
    }

    public void venda(){
        Scanner scan = new Scanner(System.in);

        System.out.println("Digite o tamanho do item");
        String tamanho = scan.next();

        if(tamanho.equalsIgnoreCase("M")){
            quantidadeM--;
        } else if (tamanho.equalsIgnoreCase("G")){
            quantidadeG--;
        } else if (tamanho.equalsIgnoreCase("P")){
            quantidadeP--;
        }

    }

    public void reposicaoEstoque(){
        if(quantidadeP < estoqueMinimo){
            quantidadeP = estoqueMaximo;
        } else if (quantidadeG < estoqueMinimo){
            quantidadeG = estoqueMaximo;
        } else if (quantidadeM < estoqueMinimo){
            quantidadeM = estoqueMaximo;
        }
    }
}
