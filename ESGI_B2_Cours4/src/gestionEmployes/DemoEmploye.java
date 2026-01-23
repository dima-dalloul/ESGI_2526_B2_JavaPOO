package gestionEmployes;

public class DemoEmploye {
    public static void main(String[] args) {
        Salaire salaire1 = new Salaire("Tania", "tania@compagnie.org", 0600000000, 50);
        Salaire salaire2 = new Salaire("Jérôme", "jerome@compagnie.org", 0600000000, 50);

        salaire1.verifierEmails();

        salaire2.setHeuresTravaillees(20);
        salaire1.setHeuresTravaillees(30);

        System.out.println(salaire1.getNom() +  " a gagné " + salaire1.calculerSalaire() + " euros pour " + salaire1.getHeuresTravaillees() + " heures travaillées.");
        System.out.println(salaire2.getNom() + " a gagné " + salaire2.calculerSalaire() + " euros pour " + salaire2.getHeuresTravaillees() + " heures travaillées.");

    }
}
