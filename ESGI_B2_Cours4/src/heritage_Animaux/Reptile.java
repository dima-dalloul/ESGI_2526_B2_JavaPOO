package heritage_Animaux;

public class Reptile extends Animal{
    TypeAnimal type;

    public Reptile(TypeAnimal t, String nom){
        super(nom);
        this.type = t;
    }

    @Override
    public void manger() {
        System.out.println("Mon reptile mange");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mon reptile se déplace doucement");
    }
}
