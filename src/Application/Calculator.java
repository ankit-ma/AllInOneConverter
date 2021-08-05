package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Calculator implements Initializable {
    public TextField screen;
    public Button nine;
    public Button eight;
    public Button seven;
    public Button one;
    public Button two;
    public Button three;
    public Button six;
    public Button five;
    public Button four;
    public Button zero;
    public Button equal;
    public Button plus;
    public Button mul;
    public Button minus;
    public Button div;
    public Button reset;
    public Button mainMenu;
    public AnchorPane calPane;
    String equation="";


    @Override
    public void initialize(URL location, ResourceBundle resources) {
            screen.setEditable(false);
    }

    public void screenText(ActionEvent actionEvent) {
    }

    public void nineBtn(ActionEvent actionEvent) {
        //equation.concat("9");
        screen.appendText("9");
    }

    public void eightBtn(ActionEvent actionEvent) {
        //equation.concat("8");
        screen.appendText("8");
    }

    public void sevenBtn(ActionEvent actionEvent) {
        screen.appendText("7");
    }

    public void oneBtn(ActionEvent actionEvent) {
        screen.appendText("1");
    }

    public void twoBtn(ActionEvent actionEvent) {
        screen.appendText("2");
    }

    public void threeBtn(ActionEvent actionEvent) {
        screen.appendText("3");
    }

    public void sixBtn(ActionEvent actionEvent) {
        screen.appendText("6");
    }

    public void fiveBtn(ActionEvent actionEvent) {
        screen.appendText("5");
    }

    public void fourBtn(ActionEvent actionEvent) {
        screen.appendText("4");
    }

    public void zeroBtn(ActionEvent actionEvent) {
        screen.appendText("0");
    }

    public void equalBtn(ActionEvent actionEvent) {
        equation = screen.getText().toString();
        InfixEvaluation i = new InfixEvaluation();
       int result = i.evaluate(equation);
       screen.setText(Integer.toString(result));
    }

    public void plusBtn(ActionEvent actionEvent) {
        screen.appendText("+");
    }

    public void mulBtn(ActionEvent actionEvent) {
        screen.appendText("*");
    }

    public void minusbtn(ActionEvent actionEvent) {
        screen.appendText("-");
    }

    public void divBtn(ActionEvent actionEvent) {
        screen.appendText("/");
    }

    public void resetBtn(ActionEvent actionEvent) {
        screen.setText("");
    }

    public void mainMenuBtn(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("login.fxml"));
        calPane.getChildren().setAll(pane);
    }
}
