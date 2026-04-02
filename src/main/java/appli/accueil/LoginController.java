package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginController {
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    protected static String emailValide ="thusevan@gmail.com";
    protected String mdpValide ="thusevan";
    @FXML
    protected void onConnexionClick(){
        String email = emailField.getText();
        String mdp = passwordField.getText();
        if(email.equals(emailValide) && mdp.equals(mdpValide) ){
            System.out.println("connexion reussie");
            errorLabel.setText("");
        }else{
            errorLabel.setText("mdp ou/et mail qui est incorrect");
        }
    }
    @FXML
    protected void onInscriptionClick() throws IOException {
        StartApplication.changeScene("accueil/Inscription");
    }
    @FXML
    protected void onMotDePasse(){
        System.out.println("Mdp oublier");
    }
}
