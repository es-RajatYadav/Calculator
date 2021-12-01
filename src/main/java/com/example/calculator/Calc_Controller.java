package com.example.calculator;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import org.controlsfx.control.action.Action;

import java.util.ArrayList;

public class Calc_Controller {
    ArrayList<Integer> AdditionExpArray = new ArrayList<>();
    ArrayList<Integer> SubtractionExpArray = new ArrayList<>();
    double Res = 0;

    @FXML
    private Label Calc_EvalPreview;

    @FXML
    private TextField Calc_InputArea;

    @FXML
    private Button Calc_AdditionBtn;

    @FXML
    private Button Calc_EvaluateBtn;

    @FXML
    private Button Calc_SubtractionBtn;



    @FXML
    public void onArithmeticButtonClick(ActionEvent e){
        double AddRes = 0;
        if(e.getSource().equals(Calc_AdditionBtn)){
            System.out.println(Integer.parseInt(Calc_InputArea.getText()));
            AdditionExpArray.add(Integer.parseInt(Calc_InputArea.getText()));
            Calc_InputArea.clear();
            System.out.println(AdditionExpArray);
            for(int i = 0; i < AdditionExpArray.size(); i++){
                AddRes = AddRes + AdditionExpArray.get(i);
            }
            System.out.println(AddRes);
            Res = AddRes;
        }
        else if(e.getSource().equals(Calc_SubtractionBtn)){
            System.out.println(Integer.parseInt(Calc_InputArea.getText()));
            SubtractionExpArray.add(Integer.parseInt(Calc_InputArea.getText()));
            Calc_InputArea.clear();
            System.out.println(SubtractionExpArray);
            System.out.println(Res);
            for(int i = 0; i < SubtractionExpArray.size(); i++){
                Res = Res - SubtractionExpArray.get(i);
            }
            System.out.println(Res);
        }
        else if(e.getSource().equals(Calc_EvaluateBtn)){
            Calc_EvalPreview.setText("Result : " + String.valueOf(Res));
        }
    }
}
