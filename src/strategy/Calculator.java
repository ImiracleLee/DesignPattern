package strategy;
/**
 * Created by Imiracle Lee on 2017/9/5.
 */

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class Calculator extends Application {
    double result = 0;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        TextField priceText = new TextField();
        TextField numberText = new TextField();
        TextArea resultArea = new TextArea();
        ComboBox comboBox = new ComboBox();
        Button okBtn = getOKButton(priceText, numberText, resultArea);
        Button resetBtn = getResetButton(priceText, numberText, resultArea);

        VBox root = new VBox();
        root.getChildren().add(priceText);
        root.getChildren().add(numberText);
        root.getChildren().add(comboBox);
        root.getChildren().add(okBtn);
        root.getChildren().add(resetBtn);
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
