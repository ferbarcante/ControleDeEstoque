package entities;

public abstract class Peca {

    private String descricao;
    private int qtd;
    private int estoqueMinimo;
    private int estoqueMaximo;

    public Peca(String descricao, int qtd, int estoqueMinimo, int estoqueMaximo) {
        this.descricao = descricao;
        this.qtd = qtd;
        this.estoqueMaximo = estoqueMaximo;
        this.estoqueMinimo = estoqueMinimo;
    }

    public abstract void venda();

    public void reposicaoEstoque(){
        if(qtd<estoqueMinimo){
            qtd = estoqueMaximo;
        }
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public int getEstoqueMinimo() {
        return estoqueMinimo;
    }

    public void setEstoqueMinimo(int estoqueMinimo) {
        this.estoqueMinimo = estoqueMinimo;
    }

    public int getQtd() {
        return qtd;
    }

    public void setQtd(int qtd) {
        this.qtd = qtd;
    }

    public int getEstoqueMaximo() {
        return estoqueMaximo;
    }

    public void setEstoqueMaximo(int estoqueMaximo) {
        this.estoqueMaximo = estoqueMaximo;
    }
}

