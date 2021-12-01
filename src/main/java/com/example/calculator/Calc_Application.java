package com.example.calculator;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

import java.io.IOException;

public class Calc_Application extends Application {

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader CalcFxmlLoader = new FXMLLoader(Calc_Application.class.getResource("Calc.fxml"));
        Scene CalcScene = new Scene(CalcFxmlLoader.load(), 300, 500);
        stage.setTitle("Calculator (Beta)");
        stage.setScene(CalcScene);
        stage.show();
    }
    
    public static void main(){ launch(); }
}
