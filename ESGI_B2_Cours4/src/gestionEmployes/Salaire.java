package gestionEmployes;

public class Salaire extends Employe{
    private double salaireHoraire;
    private int heuresTravaillees;

    public Salaire(String nom, String adresseEmail, int numero, double salaireHoraire) {
        super(nom, adresseEmail, numero);
        this.salaireHoraire = salaireHoraire;
        this.heuresTravaillees = 0;
    }

    public void ajouterHeures(int heures) {
        this.heuresTravaillees += heures;
    }

    public double calculerSalaire() {
        return salaireHoraire * heuresTravaillees;
    }


    public int getHeuresTravaillees() {
        return heuresTravaillees;
    }

    public void setHeuresTravaillees(int heuresTravaillees) {
        this.heuresTravaillees = heuresTravaillees;
    }

    public double getSalaireHoraire() {
        return salaireHoraire;
    }

    public void setSalaireHoraire(double salaireHoraire) {
        if(salaireHoraire >= 0.0)
            this.salaireHoraire = salaireHoraire;
    }
}
