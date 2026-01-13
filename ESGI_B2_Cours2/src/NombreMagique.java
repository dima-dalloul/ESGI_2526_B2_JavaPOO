import java.util.Random;
import java.util.Scanner;

public class NombreMagique {
    public static void main(String[] args){
        // Attributs
        int nbCoups = 0, entreeUtilisateur = -1, nbMagique = -1;

        // On annonce le jeu à l'utilisateur
        System.out.println("Jeu du nombre magique");
        System.out.println("Devinez le nombre magique entre 0 et 100 en 10 coups maximum");
        System.out.println("Let's go !!!");

        // On branche le scanner sur l'entrée du système
        Scanner scanner = new Scanner(System.in);

        // On va générer le nombre aléatoire entre 0 et 100
        nbMagique = new Random().nextInt(101);

        do{
            // Je lance le coup
            System.out.println("Coup " + nbCoups);
            System.out.println("Choisis un nombre");

            // Je récupère l'entrée utilisateur
            entreeUtilisateur = scanner.nextInt();

            // Je teste s'il y a égalité
            if(entreeUtilisateur != nbMagique){
                // Pas d'égalité => On incrémente le nombre de coups
                nbCoups++;

                // On indique à l'utilisateur si le nombre magique est plus grand ou plus petit
                if(entreeUtilisateur < nbMagique)
                    System.out.println("Le nombre magique est plus grand");
                else
                    System.out.println("Le nombre magique est plus petit");
            }
        } while(entreeUtilisateur != nbMagique && nbCoups < 10);

        // On voit l'issue du jeu
        System.out.println("Le nombre magique était " + nbMagique);
        if(nbCoups != 10){
            // L'utilisateur a gagné
            System.out.println("BRAVOOOOOOO! Tu as gagné en " + nbCoups +  " coups !");
        } else{
            // L'utilisateur a perdu
            System.out.println("Bouuuuuh la honte !!");
        }

        // On libère le scanner
        scanner.close();
    }
}
