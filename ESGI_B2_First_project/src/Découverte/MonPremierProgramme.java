package Découverte;

import pizzaFactory.TaillePizza;

import java.util.Scanner;

public class MonPremierProgramme {

    public static void main (String[] args){
        System.out.println("Hello les B2!");
        int i = 0;
        i = 2;
        System.out.println(i);

        // J'ai faim donc je vais commander une pizza

        /*
        Je suis
        un commentaire
        sur plusieurs
        lignes
         */
        TaillePizza taille = TaillePizza.M;
        System.out.println("Taille pizza choisie : " + taille);

        System.out.println("Bonjour comment vas-tu aujourd'hui?");
        Scanner scanner = new Scanner(System.in);
        String reponseUtilisateur = scanner.nextLine();
        System.out.println("Echo : " + reponseUtilisateur);
        System.out.println("Un chiffre?");
        String chiffre = "" + scanner.nextInt();
        System.out.println(chiffre);
    }
}
