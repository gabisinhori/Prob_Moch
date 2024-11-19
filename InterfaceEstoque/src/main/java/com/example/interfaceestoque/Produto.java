package com.example.interfaceestoque;
import javafx.beans.property.SimpleDoubleProperty;
import javafx.beans.property.SimpleIntegerProperty;
import javafx.beans.property.SimpleStringProperty;

public class Produto{
    private SimpleStringProperty nome;
    private SimpleDoubleProperty valor;
    private SimpleIntegerProperty peso;
    private SimpleIntegerProperty qnt;

    public Produto(String nome,double valor,int peso,int qnt){
        this.nome = new SimpleStringProperty(nome);
        this.valor = new SimpleDoubleProperty(valor);
        this.peso = new SimpleIntegerProperty(peso);
        this.qnt = new SimpleIntegerProperty(qnt);
    }

    public String getNome(){
        return nome.get();
    }

    public SimpleStringProperty nomeProperty(){
        return nome;
    }
    public double getValor(){
        return valor.get();
    }
    public double getValorPorPeso(){
        return getValor()/getPeso();
    }

    public SimpleDoubleProperty valorProperty(){
        return valor;
    }

    public int getPeso(){
        return peso.get();
    }

    public SimpleIntegerProperty pesoProperty(){
        return peso;
    }

    public int getQnt(){
        return qnt.get();
    }

    public SimpleIntegerProperty qntProperty(){
        return qnt;
    }

    public void setNome(String nome) {
        this.nome.set(nome);
    }

    public void setValor(double valor) {
        this.valor.set(valor);
    }

    public void setPeso(int peso) {
        this.peso.set(peso);
    }

    public void setQnt(int qnt) {
        this.qnt.set(qnt);
    }

    public int calcTotal(){
        return getPeso()*getQnt();
    }
    @Override
    public String toString() {
        return "Nome: "+ getNome() + "\n"+
                "R$: "+ getValor() + "\n"+
                "Peso: "+ getPeso() + "\n"+
                "Quantidade: "+ getQnt() + "\n";
    }
}
