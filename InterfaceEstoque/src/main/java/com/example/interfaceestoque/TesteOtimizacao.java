package com.example.interfaceestoque;
import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.fxml.FXMLLoader;
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


    @Override
    public void start(Stage primaryStage) {
        try{
            FXMLLoader loader = new FXMLLoader(getClass().getResource("/com/example/interfaceestoque/InterfaceTeste.fxml"));
            Scene scene = new Scene(loader.load());
            primaryStage.setTitle("Sistema de Otimização de Estoque");
            primaryStage.setScene(scene);
            primaryStage.show();
        }catch(Exception e){
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        launch(args);
    }

}
