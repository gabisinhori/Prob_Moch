//Sistema de Otimização de Estoque (Problema da Mochila)
//Sumário Executivo: A otimização do espaço de estoque é essencial para empresas que gerenciam grandes volumes de produtos. Este projeto utiliza o problema da mochila para alocar produtos de maneira eficiente, maximizando o uso do espaço de armazenamento. A interface gráfica facilita o controle visual do estoque, enquanto o banco de dados armazena informações sobre produtos e capacidade de armazenamento. Essa solução ajuda empresas a economizarem espaço e reduzirem custos com armazenamento.
//Descrição: Sistema para otimização de espaço de armazenamento, utilizando o problema da mochila para alocar produtos de forma eficiente no estoque.
//Requisitos Funcionais:
//Permitir o cadastro de produtos e capacidade de armazenamento.
//Aplicar o algoritmo da mochila para maximizar o uso do espaço disponível.
//Interface gráfica para visualização da distribuição de produtos no estoque.
//Integração com banco de dados para gerenciar o estoque.
//Relatório de otimização com sugestões para melhor distribuição dos produtos.

package Prob_Estoque;
import java.util.ArrayList;
import java.util.List;
public class TesteOtimizacao {
    public static void main(String[] args) {
        Produto p1 = new Produto("Produto A", 10, 5, 2);
        Produto p2 = new Produto("Produto B", 20, 10, 1);
        Produto p3 = new Produto("Produto C", 15, 8, 3);
        Produto p4 = new Produto("Produto D", 12, 3,4);
        Produto p5 = new Produto("Produto E", 5, 1, 10);
        Produto p6 = new Produto("Produto F", 9.99, 4, 3);
        Produto p7 = new Produto("Produto G", 15.99, 7, 5);
        Produto p8 = new Produto("Produto H", 12, 6, 4);
        Produto p9 = new Produto("Produto I", 18, 5, 6);
        Produto p10= new Produto("Produto J", 17, 3, 4);

        List<Produto> todosProdutos = new ArrayList<>();
        todosProdutos.add(p1);
        todosProdutos.add(p2);
        todosProdutos.add(p3);
        todosProdutos.add(p4);
        todosProdutos.add(p5);
        todosProdutos.add(p6);
        todosProdutos.add(p7);
        todosProdutos.add(p8);
        todosProdutos.add(p9);
        todosProdutos.add(p10);

        Estoque estoque = new Estoque(50); // Capacidade de 50
        estoque.otimizarEstoque(todosProdutos);

        System.out.println("Estoque Otimizado:");
        System.out.println(estoque);
    }
}
