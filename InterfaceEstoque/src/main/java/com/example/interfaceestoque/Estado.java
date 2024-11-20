package com.example.interfaceestoque;

import java.util.List;

public class Estado {
        private List<Produto> produtos;
        private int pesoTotal;
        private double valorTotal;

        public Estado(List<Produto> produtos, int pesoTotal, double valorTotal) {
            this.produtos = produtos;
            this.pesoTotal = pesoTotal;
            this.valorTotal = valorTotal;
        }

        public List<Produto> getProdutos() {
            return produtos;
        }

        public int getPesoTotal() {
            return pesoTotal;
        }

        public double getValorTotal() {
            return valorTotal;
        }

        public double getF() {
            return valorTotal;
        }

        @Override
        public boolean equals(Object obj) {
            if (this == obj) return true;
            if (!(obj instanceof com.example.interfaceestoque.Estado)) return false;
            com.example.interfaceestoque.Estado other = (com.example.interfaceestoque.Estado) obj;
            return produtos.equals(other.produtos);
        }

        @Override
        public int hashCode() {
            return produtos.hashCode();
        }
    }
