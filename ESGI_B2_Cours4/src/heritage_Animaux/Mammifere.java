package heritage_Animaux;

public class Mammifere extends Animal{
    TypeAnimal type;
    String nom;

    public Mammifere(TypeAnimal t, String nom){
        super(nom);
        this.nom = nom;
        type = t;
    }

    @Override
    public void manger() {
        System.out.println(nom + " mange");
    }

    @Override
    public void seDeplacer() {
        System.out.println(nom + " se déplace");
    }
}
