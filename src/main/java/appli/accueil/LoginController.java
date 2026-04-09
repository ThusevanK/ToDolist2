package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class LoginController {
    public static String emailValide;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private Label errorLabel;
    @FXML
    protected void onConnexionClick(){
        String email = emailField.getText();
        String mdp = passwordField.getText();
        if(email.isEmpty() || mdp.isEmpty() ){
            errorLabel.setText("\"Veuillez remplir tous les champs obligatoire\"");
        }else if(email.equals("mail123@gmail.com") && mdp.equals("Azerty1234")){
            errorLabel.setText("connexion reussi");
        }else{
            errorLabel.setText("Les informations sont incompletes");
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
