package com.imiracle.strategy;
/**
 * Created by Imiracle Lee on 2017/9/5.
 */

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    double result = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        Label priceLabel = new Label("Price");
        TextField priceText = new TextField();
        Label numberLabel = new Label("Number");
        TextField numberText = new TextField();
        TextArea resultArea = new TextArea();
        ComboBox comboBox = new ComboBox();
        ObservableList<String> data = FXCollections.observableArrayList();
        data.add("s1");
        comboBox.setItems(data);
        comboBox.setValue(data.get(0));
        Button okBtn = getOKButton(priceText, numberText, resultArea);
        Button resetBtn = getResetButton(priceText, numberText, resultArea);
        priceLabel.setPrefWidth(80);
        numberLabel.setPrefWidth(80);
        comboBox.setPrefWidth(80);
        okBtn.setPrefWidth(80);
        resetBtn.setPrefWidth(80);

        VBox root = new VBox();
        HBox line1 = new HBox();
        HBox line2 = new HBox();
        HBox line3 = new HBox();
        line1.getChildren().add(priceLabel);
        line1.getChildren().add(priceText);
        root.getChildren().add(line1);
        line2.getChildren().add(numberLabel);
        line2.getChildren().add(numberText);
        root.getChildren().add(line2);
        line3.getChildren().add(comboBox);
        line3.getChildren().add(okBtn);
        line3.getChildren().add(resetBtn);
        root.getChildren().add(line3);
        root.getChildren().add(resultArea);

        primaryStage.setScene(new Scene(root, 300, 250));
        primaryStage.setTitle("Calculator");
        primaryStage.show();
    }

    private Button getResetButton(TextField priceText, TextField numberText, TextArea resultArea) {
        Button resetBtn = new Button();
        resetBtn.setText("RESET");
        resetBtn.setOnAction((event) -> {
            result = 0;
            priceText.setText("");
            numberText.setText("");
            resultArea.setText("");
        });
        return resetBtn;
    }

    private Button getOKButton(TextField priceText, TextField numberText, TextArea resultArea) {
        Button okBtn = new Button();
        okBtn.setText("OK");
        okBtn.setOnAction((event) -> {
            try {
                CashCotext cashCotext = new CashCotext("normal");
                result += cashCotext.getResult(Double.valueOf(priceText.getText()) * Double.valueOf(numberText.getText()));
                resultArea.appendText("Price : " + priceText.getText() + " Number : " + numberText.getText() + " Total : " + result + "\n");
            } catch (Exception e) {
                resultArea.setText("Input Error!");
                result = 0;
            }
        });
        return okBtn;
    }
}
