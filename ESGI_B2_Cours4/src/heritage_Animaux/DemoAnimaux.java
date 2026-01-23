package heritage_Animaux;

public class DemoAnimaux {
    public static void main(String[] args) {
        Animal chien = new Chien("Rex", 5);
        Cerf cerf = new Cerf();

        chien.seDeplacer();
        cerf.seDeplacer();
    }
}
