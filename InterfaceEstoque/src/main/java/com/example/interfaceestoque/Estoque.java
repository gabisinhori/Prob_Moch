package com.example.interfaceestoque;
import java.util.ArrayList;
import java.util.List;

public class Estoque {
    private int capMax=10;
    private int capUtil=0;
    private List<Produto> produtos;

    public Estoque(int capMax) {
        this.capMax = capMax;
        this.produtos = new ArrayList<>();
    }

    public int getCapMax() {
        return capMax;
    }

    public void setCapMax(int capMax) {
        this.capMax = capMax;
    }
    public void addEstoque(Produto produto){
        if(produto.calcTotal()<=capRest()){
            this.produtos.add(produto);
            capUtil+=produto.calcTotal();
        }else{
            System.out.println("Estoque Cheio\n");
        }

    }
    public int capRest(){
        return capMax-capUtil;
    }
    public void otimizarEstoque(List<Produto> todosProdutos) {
        todosProdutos.sort((p1, p2) -> Double.compare(p2.getValorPorPeso(), p1.getValorPorPeso()));

        for (Produto produto : todosProdutos) {
            if (produto.calcTotal() <= capRest()) {
                addEstoque(produto);
            } else {
                System.out.println("Produto " + produto.getNome() + " não cabe no estoque (capacidade insuficiente).");
            }
        }
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for(Produto produto:produtos){
            sb.append(produto).append("\n");
        }
        return sb.toString();
    }
}
