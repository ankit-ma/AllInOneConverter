package Application;

import javafx.event.ActionEvent;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;

public class Login implements Initializable {
    public AnchorPane pane;
    public Button bttn;
    public Button bttn1;
    public Button bttn11;
    public Button bttn2;
    public Button tempBtn;
    public Button mesurebtn;

    @Override
    public void initialize(URL location, ResourceBundle resources) {

    }

    public void loadTwo(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("calculator.fxml"));
        pane.getChildren().setAll(anchorPane);
    }

    public void loadTemp(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("Temperature.fxml"));
        pane.getChildren().setAll(anchorPane);
    }

    public void loadMesure(ActionEvent actionEvent) throws IOException {
        AnchorPane anchorPane = FXMLLoader.load(getClass().getResource("Numbersystem.fxml"));
        pane.getChildren().setAll(anchorPane);
    }
}
