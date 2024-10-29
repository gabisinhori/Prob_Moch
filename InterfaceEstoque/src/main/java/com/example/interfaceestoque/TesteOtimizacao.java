package com.example.interfaceestoque;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import java.util.ArrayList;


public class TesteOtimizacao extends Application {

    private TableView<Produto> table = new TableView<>();
    private ObservableList<Produto> produtosData = FXCollections.observableArrayList();

    private Estoque estoque = new Estoque(50);
    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Sistema de Otimização de Estoque");


        GridPane grid = new GridPane();
        grid.setPadding(new Insets(10, 10, 10, 10));
        grid.setVgap(10);
        grid.setHgap(10);


        TextField nomeInput = new TextField();
        nomeInput.setPromptText("Nome do Produto");
        TextField valorInput = new TextField();
        valorInput.setPromptText("Valor");
        TextField pesoInput = new TextField();
        pesoInput.setPromptText("Peso");
        TextField qntInput = new TextField();
        qntInput.setPromptText("Quantidade");

        Button addButton = new Button("Adicionar Produto");
        addButton.setOnAction(e -> {
            String nome = nomeInput.getText();
            double valor = Double.parseDouble(valorInput.getText());
            int peso = Integer.parseInt(pesoInput.getText());
            int qnt = Integer.parseInt(qntInput.getText());

            Produto produto = new Produto(nome, valor, peso, qnt);
            produtosData.add(produto);
            estoque.addEstoque(produto);
            nomeInput.clear();
            valorInput.clear();
            pesoInput.clear();
            qntInput.clear();
        });

        TableColumn<Produto, String> nomeColumn = new TableColumn<>("Nome");
        nomeColumn.setCellValueFactory(cellData -> cellData.getValue().nomeProperty());

        TableColumn<Produto, Double> valorColumn = new TableColumn<>("Valor");
        valorColumn.setCellValueFactory(cellData -> cellData.getValue().valorProperty().asObject());

        TableColumn<Produto, Integer> pesoColumn = new TableColumn<>("Peso");
        pesoColumn.setCellValueFactory(cellData -> cellData.getValue().pesoProperty().asObject());

        TableColumn<Produto, Integer> qntColumn = new TableColumn<>("Quantidade");
        qntColumn.setCellValueFactory(cellData -> cellData.getValue().qntProperty().asObject());

        table.setItems(produtosData);
        table.getColumns().addAll(nomeColumn, valorColumn, pesoColumn, qntColumn);


        Button otimizarButton = new Button("Otimizar Estoque");
        otimizarButton.setOnAction(e -> {
            estoque.otimizarEstoque(new ArrayList<>(produtosData));
            Alert alert = new Alert(Alert.AlertType.INFORMATION);
            alert.setTitle("Otimização Completa");
            alert.setHeaderText(null);
            alert.setContentText(estoque.toString());
            alert.showAndWait();
        });

        VBox vbox = new VBox();
        vbox.getChildren().addAll(table, nomeInput, valorInput, pesoInput, qntInput, addButton, otimizarButton);

        Scene scene = new Scene(vbox, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}
