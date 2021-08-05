package Application;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.*;
import javafx.scene.input.KeyEvent;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Numbersystem implements Initializable {


    public TextField decimalText;
    public TextField binaryText;
    public TextField octalText;
    public TextField hexaText;
    public Button calculate;
    public Button menu;
    public AnchorPane numPane;
    public Button reset;

    @Override
    public void initialize(URL location, ResourceBundle resources) {


    }


    public void menuAction() {

    }

    public void decAction() {
        int dec;
        try{
            String decimal = decimalText.getText();
            dec = Integer.parseInt(decimal);
            binaryText.setText(Integer.toBinaryString(dec));
            octalText.setText(Integer.toOctalString(dec));
            hexaText.setText(Integer.toHexString(dec).toUpperCase());
        }
        catch (NumberFormatException nfe){
            decimalText.setText("Invalid input");
            octalText.setText("Invalid input");
            hexaText.setText("Invalid input");
            binaryText.setText("Inavlid input");
        }

    }

    public void binAction() {
        try {
            String binary = binaryText.getText();
            int bin = Integer.parseInt(binary, 2);
            String decimal =Integer.toString(bin);
            decimalText.setText(decimal);
            octalText.setText(Integer.toOctalString(Integer.parseInt(decimal)));
            hexaText.setText(Integer.toHexString(Integer.parseInt(decimal)).toUpperCase());


        }
        catch (NumberFormatException nfe){
            decimalText.setText("Invalid input");
            octalText.setText("Invalid input");
            hexaText.setText("Invalid input");
            binaryText.setText("Inavlid input");
        }
    }

    public void octAction() {
        try {
            String binary = octalText.getText();
            int oct = Integer.parseInt(binary, 8);
            String decimal =Integer.toString(oct);
            decimalText.setText(decimal);
            binaryText.setText(Integer.toBinaryString(Integer.parseInt(decimal)));
            hexaText.setText(Integer.toHexString(Integer.parseInt(decimal)).toUpperCase());


        }
        catch (NumberFormatException nfe){
            decimalText.setText("Invalid input");
            octalText.setText("Invalid input");
            hexaText.setText("Invalid input");
            binaryText.setText("Inavlid input");
        }
    }

    public void hexaAction() {
        try {
            String binary = hexaText.getText();
            int hex = Integer.parseInt(binary.toLowerCase(), 16);
            String decimal =Integer.toString(hex);
            decimalText.setText(decimal);
            octalText.setText(Integer.toOctalString(Integer.parseInt(decimal)));
            binaryText.setText(Integer.toBinaryString(Integer.parseInt(decimal)));


        }
        catch (NumberFormatException nfe){
            decimalText.setText("Invalid input");
            octalText.setText("Invalid input");
            hexaText.setText("Invalid input");
            binaryText.setText("Inavlid input");
        }
    }

    public void calAction(ActionEvent actionEvent) {
        if(binaryText.getText().equals("") && octalText.getText().equals("") && hexaText.getText().equals(""))
        {
            decAction();
        }
        if(decimalText.getText().equals("") && octalText.getText().equals("") && hexaText.getText().equals(""))
        {
            binAction();
        }
        if(decimalText.getText().equals("") && binaryText.getText().equals("") && hexaText.getText().equals(""))
        {
            octAction();
        }
        if(decimalText.getText().equals("") && binaryText.getText().equals("") && octalText.getText().equals(""))
        {
            hexaAction();
        }





    }

    public void homeAction(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane =FXMLLoader.load(getClass().getResource("login.fxml"));
        numPane.getChildren().setAll(anchorPane);
    }

    public void resetAction(ActionEvent actionEvent) {
        binaryText.setDisable(false);
        octalText.setDisable(false);
        hexaText.setDisable(false);
        decimalText.setDisable(false);
        String s="";
        binaryText.setText(s);
        octalText.setText(s);
        decimalText.setText(s);
        hexaText.setText(s);
    }

    public void keyDec(KeyEvent keyEvent) {
        binaryText.setDisable(true);
        octalText.setDisable(true);
        hexaText.setDisable(true);
    }

    public void keyBin(KeyEvent keyEvent) {
        decimalText.setDisable(true);
        octalText.setDisable(true);
        hexaText.setDisable(true);

    }

    public void keyOct(KeyEvent keyEvent) {
        decimalText.setDisable(true);
        binaryText.setDisable(true);
        hexaText.setDisable(true);

    }

    public void keyHex(KeyEvent keyEvent) {
        decimalText.setDisable(true);
        binaryText.setDisable(true);
        octalText.setDisable(true);
    }
}
