package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Temperature implements Initializable {
    public AnchorPane tempPane;
    public TextField farh;
    public TextField cel;
    public TextField kelvin;
    public ImageView imgae;
    public Button calculate;
    public Button reset;
    public Button mainMenu;
    double f,c,k;
    @Override
    public void initialize(URL location, ResourceBundle resources) {
        Image img = new Image(getClass().getResourceAsStream("/Application/white.png"));
        imgae.setImage(img);
    }

    public void farhText() {
        String tem = farh.getText();
        cel.setText(Double.toString(farToCel(Double.parseDouble(tem))));
        kelvin.setText(Double.toString(farToKel(Double.parseDouble(tem))));
    }

    public void celText() {
        String tem = cel.getText();
        farh.setText(Double.toString(celToFar(Double.parseDouble(tem))));
        kelvin.setText(Double.toString(celToKel(Double.parseDouble(tem))));
    }

    public void kelvintext() {
        String tem = kelvin.getText();
        cel.setText(Double.toString(ketToCel(Double.parseDouble(tem))));
        farh.setText(Double.toString(kelToFarh(Double.parseDouble(tem))));
    }

    public void calculateBtn(ActionEvent actionEvent) {
        //farhText();
        if(cel.getText().equals("") && kelvin.getText().equals(""))
            farhText();
        else if(farh.getText().equals("") && cel.getText().equals(""))
            kelvintext();
        else if(farh.getText().equals("") && kelvin.getText().equals(""))
            celText();
        else {
            farh.setText("Give only one input at a time");
            cel.setText("Give only one input at a time");
            kelvin.setText("Give only one input at a time");
        }
        if(Double.parseDouble(cel.getText()) >= 5.0 && Double.parseDouble(cel.getText()) <= 35.0)
        {
            Image img = new Image(getClass().getResourceAsStream("/Application/warm.png"));
            imgae.setImage(img);
        }
        if(Double.parseDouble(cel.getText()) > 35.0)
        {
            Image img = new Image(getClass().getResourceAsStream("/Application/Hot.png"));
            imgae.setImage(img);
        }
        if(Double.parseDouble(cel.getText()) < 5.0)
        {
            Image img = new Image(getClass().getResourceAsStream("/Application/cold.png"));
            imgae.setImage(img);
        }

    }
    public double celToFar(double c){
        return (9.0/5.0)*c + 32.0;
    }
    public double farToCel(double f){
        return (f - 32.0)*(5.0/9.0);
    }
    public double celToKel(double c){
        return c + 273.15;
    }
    public double farToKel(double f){
        return (f-32.0)*(5.0/9.0)+273.15;
    }
    public double ketToCel(double k){
        return k - 273.15;
    }
    public double kelToFarh(double k){
        return (k-273.15)*(9/5)+32;
    }

    public void resetBtn(ActionEvent actionEvent) {
        farh.setText("");
        cel.setText("");
        kelvin.setText("");
    }

    public void mainMenuBtn(ActionEvent actionEvent) throws IOException {
        AnchorPane pane = FXMLLoader.load(getClass().getResource("login.fxml"));
        tempPane.getChildren().setAll(pane);
    }
}
