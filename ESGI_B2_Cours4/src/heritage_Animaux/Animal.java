package heritage_Animaux;

public abstract class Animal {
    String name;

    public Animal(String name){
        this.name = name;
    }

    public abstract void manger();
    public abstract void seDeplacer();
}
