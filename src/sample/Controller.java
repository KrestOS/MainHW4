package sample;

import javafx.fxml.FXML;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;

import java.awt.*;

public class Controller {

    @FXML
    public TextArea textArea;
    @FXML
    public TextField textField;

    public void onTextField(){
       doSend();
    }

    public void onClickBtn(){
        doSend();
    }

    public void doSend(){
        if (textField.getText().length() != 0){

            textArea.appendText(textField.getText() + "\n");

        }
        textField.requestFocus();
        textField.clear();
    }
}
