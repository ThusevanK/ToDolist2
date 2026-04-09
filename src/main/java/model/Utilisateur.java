package model;

public class Utilisateur {
    private String nom;
    private String prenom;
    private String email;
    private String mdp;
    private int id;
    private String role;
    public Utilisateur(String nom, String prenom, String email, String mdp, int id, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.id = id;
        this.role = role;
    }
    public Utilisateur(String nom, String prenom, String email, String mdp, String role) {
        this.nom = nom;
        this.prenom = prenom;
        this.email = email;
        this.mdp = mdp;
        this.role = role;
    }
    public Utilisateur(String email, String mdp) {
        this.email = email;
        this.mdp = mdp;
    }

    public String getNom() {
        return nom;
    }
    public String getPrenom() {
        return prenom;
    }
    public String getEmail() {
        return email;
    }
    public String getMdp() {
        return mdp;
    }
    public int getId() {
        return id;
    }
    public void setNom(String nom) {
        this.nom = nom;
    }
    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }
    public void setEmail(String email) {
        this.email = email;
    }
    public void setMdp(String mdp) {
        this.mdp = mdp;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String getRole() {
        return role;
    }
    public void setRole(String role) {
        this.role = role;
    }
    @Override
    public String toString() {
        return "id = " + id +  ", nom = " + nom + ", prenom = " + prenom + ", email = " + email + ", mdp = " + mdp;
    }

}
