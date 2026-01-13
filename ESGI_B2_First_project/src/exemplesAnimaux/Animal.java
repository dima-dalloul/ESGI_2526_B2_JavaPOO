package exemplesAnimaux;

public class Animal {
    private String nom;
    private int age;

    /**
     * Méthode pour dormir
     */
    public void dormir(){
        System.out.println("zzzzzzzz zzzzzzzzzz");
        int a = 5;
    }

    protected void manger(){
        System.out.println("Miam miam !");
    }

    public String getNom() {
        return nom;
    }

    /**
     * Méthode pour choisir le nom
     * @param nom nom de l'animal
     */
    public void setNom(String nom) {
        this.nom = nom;
    }

    /**
     * Renvoie l'âge de l'animal
     * @return age de l'animal
     */
    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
