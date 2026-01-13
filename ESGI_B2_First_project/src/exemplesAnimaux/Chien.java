package exemplesAnimaux;

public class Chien extends Animal{
    public void aboyer(){
        System.out.println("----");
    }

    public void dormir(){
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        System.out.println("zzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzzz");
        super.dormir();
        setAge(25);
    }
}
