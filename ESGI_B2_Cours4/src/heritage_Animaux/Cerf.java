package heritage_Animaux;

public class Cerf extends Animal implements Vegetarien{
    public Cerf() {
        super("Bambi");
    }

    @Override
    public void detesterViande() {
        System.out.println("Si le cerf mange la viande, il va clamser !");
    }

    @Override
    public void manger() {
        System.out.println("Mon cerf mange de l'herbe");
    }

    @Override
    public void seDeplacer() {
        System.out.println("Mon cerf gambade dans la forêt");
    }
}
