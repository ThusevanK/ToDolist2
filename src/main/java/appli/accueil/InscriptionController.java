package appli.accueil;

import appli.StartApplication;
import javafx.fxml.FXML;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import java.io.IOException;

public class InscriptionController {
    @FXML
    private TextField nomField;
    @FXML
    private TextField prenomField;
    @FXML
    private TextField emailField;
    @FXML
    private PasswordField passwordField;
    @FXML
    private PasswordField confirmPasswordField;
    private Label errorLabel;

    @FXML
    protected void onInscriptionClick(){
        String nom = nomField.getText();
        String prenom = prenomField.getText();
        String email = emailField.getText();
        String mdp = passwordField.getText();
        String confirm= confirmPasswordField.getText();
        if (nom.isEmpty() || prenom.isEmpty() || email.isEmpty() || mdp.isEmpty() || confirm.isEmpty()){
            afficherErreur("Tout les champs sont obligatoires");
            return;
        }
        if (!mdp.equals(confirm)){
            afficherErreur("Les mdp ne correspondent pas");
            return;
        }
        if(email.equals(LoginController.emailValide)){
            afficherErreur("L'email est déja utilier");
            return;
        }
        errorLabel.setText("");
        System.out.println("Inscrit");
        System.out.println("Nom: " + nom);
        System.out.println("Prenom: " + prenom);
        System.out.println("Email: " + email);
    }
    @FXML
    protected void onRetourClick() throws IOException{
        StartApplication.changeScene("accueil/Login");
    }
    private void afficherErreur(String message){
        errorLabel.setText(message);
    }
}