package gestionEmployes;

public abstract class Employe {
    private String nom;
    private String adresseEmail;
    private int numero;

    public Employe(String nom, String adresseEmail, int numero) {
        System.out.println("Constructeur Employe appelé");
        this.nom = nom;
        this.adresseEmail = adresseEmail;
        this.numero = numero;
    }

    public void verifierEmails() {
        System.out.println("Vérification des emails pour l'employé " + nom + " à l'adresse " + adresseEmail);
    }

    public String toString() {
        return "Employé numéro " + numero + ": " + nom + ", Email: " + adresseEmail;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getAdresseEmail() {
        return adresseEmail;
    }

    public void setAdresseEmail(String adresseEmail) {
        this.adresseEmail = adresseEmail;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public abstract double calculerSalaire();
}
