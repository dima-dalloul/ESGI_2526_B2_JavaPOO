package heritage_Animaux;

public class Chien extends Mammifere{
    int age;

    public Chien(String nom, int age){
        super(TypeAnimal.MAMMIFERE, nom);
        this.age = age;
    }
}
