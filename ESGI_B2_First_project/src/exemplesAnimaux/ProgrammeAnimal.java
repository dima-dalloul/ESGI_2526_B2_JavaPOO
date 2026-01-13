package exemplesAnimaux;

public class ProgrammeAnimal {
    public static void main(String[] args){
        Chien monChien = new Chien();
        monChien.setAge(19);
        System.out.println("Il a "+ monChien.getAge()+ " ans");
        monChien.dormir();
        monChien.setNom("Robert");
        System.out.println("Mon chien s'appelle " + monChien.getNom());
        System.out.println("Il a "+ monChien.getAge() + " ans");
        monChien.aboyer();

        Chat monChat = new Chat();
        monChat.setNom("Gato");
        monChat.manger();
        monChat.setAge(37);
        System.out.println("Mon chat a " + monChat.getAge() + " ans!");
        monChat.miauler();
        // Pas accepté : monChat.aboyer();
    }
}
