package Découverte;

import pizzaFactory.TaillePizza;

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
    }
}
