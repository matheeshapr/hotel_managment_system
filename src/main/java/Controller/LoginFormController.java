package Controller;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

import java.io.IOException;

public class LoginFormController {

    @FXML
    private Button btnsingin;

    @FXML
    private Button btnsingup;

    @FXML
    private PasswordField password;

    @FXML
    private Label txtpassword;

    @FXML
    private Label txtusername;

    @FXML
    private TextField username;

    @FXML
    Stage stage = new Stage();
    public void loginonaction(ActionEvent event) {
        try {
            stage.setScene(new Scene(FXMLLoader.load(getClass().getResource("/view/dashboard.fxml"))));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
        stage.show();
    }

    @FXML
    void singonaction(ActionEvent event) {

    }

}
