package entities;

public class RoupaTamanhoUnico extends Peca implements Item{
    public RoupaTamanhoUnico(String descricao, int qtd, int estoqueMinimo, int estoqueMaximo) {
        super(descricao, qtd, estoqueMinimo, estoqueMaximo);
    }

    @Override
    public void venda() {
        setQtd(getQtd()-1);
    }
}
