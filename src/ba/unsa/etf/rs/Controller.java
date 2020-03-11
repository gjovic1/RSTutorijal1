package ba.unsa.etf.rs;

import javafx.event.ActionEvent;
import javafx.scene.control.Button;
import javafx.scene.control.Label;

public class Controller {
    public Button btnChg;
    public Label labelica;
    public void Submit(ActionEvent actionEvent) {
    }

    public void changeText(ActionEvent actionEvent) {
        labelica.setText("Hello World");
    }
}
