import java.util.Random;

public class Employe {
    // Attributs
    private String nom;
    private int age;
    private int salaire;
    private String poste;
    private int note; // Dédicace Florian
    private int sympathie; // Dédicace Florian

    // Constructeurs
    /**
     * Premier constructeur sans paramètres, donc valeurs par défaut
     */
    public Employe(){
        this.nom = "Jane";
        this.age = 23;
        this.salaire = 4500;
        this.poste = "Ingénieure";
        this.note = noteOuSympathieAleatoire();
        this.sympathie = noteOuSympathieAleatoire();

    }

    /**
     * Premier constructeur avec paramètres, donc valeurs fournies par l'appelant
     */
    public Employe(String nom, int age, int salaire, String poste){
        this.nom = nom;
        this.age = age;
        this.salaire = salaire;
        this.poste = poste;
        this.note = noteOuSympathieAleatoire();
        this.sympathie = noteOuSympathieAleatoire();
    }

    // Méthodes
    public String getPoste() {
        return poste;
    }

    public void setPoste(String poste) {
        this.poste = poste;
    }

    public int getSalaire() {
        return salaire;
    }

    public void setSalaire(int salaire) {
        this.salaire = salaire;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public int getSympathie() {
        return sympathie;
    }

    public void setSympathie(int sympathie) {
        this.sympathie = sympathie;
    }

    public int getNote() {
        return note;
    }

    public void setNote(int note) {
        this.note = note;
    }

    public int noteOuSympathieAleatoire(){
        // Dédicace Florian & Guillaume
        // Dima coupe la poire en deux pour faire plaisir à tout le monde
        Random aleatoire = new Random();
        return aleatoire.nextInt(11);
    }

    public void afficheEmploye(){
        System.out.println(this.nom + " travaille ici, a " + age + " ans et est payé " + salaire + " euros par jour et est " + poste + ". Sympathie : " + sympathie + ", Note : " + note);
    }

    public void blamerEmploye(){
        System.out.println(this.nom + " a trop dormi (?) et n'est pas venu au travail pendant 15 jours et a fait couler la boîte (snif)");
        System.out.println("il/elle reçoit un blâme officiel ><' ");
    }

    public void feliciterEmploye(){
        System.out.println(this.nom + " a fait gagner un gros contrat juteux pour la boîte et nous sommes aux ANGES !!! Donc il/elle reçoit une augmentation :-).");
        salaire++;
        System.out.println("Nouveau salaire journalier: " + salaire);
    }
}
