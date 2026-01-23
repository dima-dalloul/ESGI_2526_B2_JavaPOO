import java.io.FileWriter;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;
import java.util.Scanner;

/**
 * Dédicace à Kieran :-)
 */
public class TrickOrTreat {
    public static void main(String[] args) throws IOException {
        // Nous allons faire un jeu de Trick or Treat avec nos utilisateurs
        System.out.println("Bienvenue à notre jeu de Trick or Treat version B2 Java :-)");
        System.out.println("Vous devez demander des bonbons ou un sort à chaque maison que vous visitez");
        System.out.println("Pour info, il y en a 100");
        System.out.println("Si vous décidez d'arrêter avant, écrivez STOP dans la console");
        System.out.println("Une fois la tournée terminée, on vous donnera les stats");
        System.out.println("Let's go !!");

        // On initialise tout avant le début du jeu
        Scanner scanner = new Scanner(System.in);
        int nbMaisonsTotal = 100,
                nbMaisonsVisitees = 0,
                nbBonbonsDemandes = 0,
                nbSortsJetes = 0,
                nbBonbonsRecuperesParMaison = 0,
                totalBonbonsRecuperes = 0;
        Date dateDuJeu = new Date();
        SimpleDateFormat formattageDeDate = new SimpleDateFormat("E yyyy-MM-dd");
        FileWriter ecrivainDeFichier = null;

        String[] sortsAJeter = {"Stupéfix !", "Lumos", "Andoloris", "Imperium", "Bam tu es un canard !", "sssssssssssssssss",
                "Excalibur!", "Miaou miaou miaou miaouuuuuuuuuuuuuuuuuu", "Doom", "KO", "Veni vedi vici", "Shazam",
                "Expelliarmus", "Sed les durales", "JETEZ LES AUX OUBLIETTES !"};

        Random aleatoire = new Random();
        String inputUser = "";
        int inputUserChoixBonbonOuSort;

        try {
            // On lance la boucle
            do {
                System.out.println("-------- Vous sonnez à la maison numéro " + nbMaisonsVisitees + " --------");
                System.out.println("DRINNNNNNNNNGGGGGGGG !");
                System.out.println("Les propriétaires ouvrent. Vous criez UN BONBON OU UN SORT !!");
                System.out.println("Exprimez le choix des propriétaires en écrivant 1 pour Bonbon ou 2 pour un Sort");

                // On récupère l'entrée utilisateur
                inputUser = scanner.nextLine();
                inputUserChoixBonbonOuSort = Integer.parseInt(inputUser);
                nbMaisonsVisitees++;
                switch (inputUserChoixBonbonOuSort) {
                    case 1: // Choix bonbon
                        nbBonbonsDemandes++;
                        nbBonbonsRecuperesParMaison = aleatoire.nextInt(5);
                        if (nbBonbonsRecuperesParMaison > 2) {
                            System.out.println("Les propriétaires sont gentils et vous ont donné " + nbBonbonsRecuperesParMaison + " bonbons!");
                        } else {
                            System.out.println("Les propriétaires sont méchants et vous ont donné seulement " + nbBonbonsRecuperesParMaison + " bonbons!");
                            System.out.println("Vous décidez de les punir et vous leur jetez un sort");
                            System.out.println("~~~~~~~~~~ " + sortsAJeter[aleatoire.nextInt(15)] + " ~~~~~~~~~~");
                        }
                        // On met à jour le total des bonbons qui sont dans le sac
                        totalBonbonsRecuperes += nbBonbonsRecuperesParMaison;
                        // Version explicite de la ligne précédente : totalBonbonsRecuperes = totalBonbonsRecuperes + nbBonbonsDemandes;
                        break;

                    case 2: // Choix sort
                        nbSortsJetes++;
                        System.out.println("Les propriétaires sont méchants et ne veulent pas vous donner des bonbons!");
                        System.out.println("Vous décidez de les punir et vous leur jetez un sort");
                        System.out.println("~~~~~~~~~~ " + sortsAJeter[aleatoire.nextInt(15)] + " ~~~~~~~~~~");
                        break;

                    default:
                        if (!inputUser.equals("STOP"))
                            System.out.println("Entrée non reconnue");
                        break;
                }
            } while (!inputUser.equals("STOP") || nbMaisonsVisitees < 100);
            //} while(!inputUser.contains("STOP"));
        } catch (NumberFormatException e) {
            // Facultatif : imprimer l'exception
            // System.err.println("Number format exception " + e);
        }

        try {
            // On prépare le fichier
            ecrivainDeFichier = new FileWriter("stats_joueurs_" + formattageDeDate.format(dateDuJeu) + ".txt");

            ecrivainDeFichier.write("Bravo ! La tournée est finie, voyons un peu vos stats: ");
            ecrivainDeFichier.write("Nombre de maisons visitées : " + nbMaisonsVisitees);
            ecrivainDeFichier.write("Nombre de bonbons dans le sac : " + totalBonbonsRecuperes);
            ecrivainDeFichier.write("Nombre de sorts jetés " + nbSortsJetes);
            System.out.println("Bravo ! La tournée est finie, voyons un peu vos stats: ");
            System.out.println("Nombre de maisons visitées : " + nbMaisonsVisitees);
            System.out.println("Nombre de bonbons dans le sac : " + totalBonbonsRecuperes);
            System.out.println("Nombre de sorts jetés " + nbSortsJetes);

            if (totalBonbonsRecuperes < 10) {
                ecrivainDeFichier.write("LOSER ! Tu aurais dû avoir plus de bonbons !");
                System.out.println("LOSER ! Tu aurais dû avoir plus de bonbons !");
            }
            if (nbSortsJetes > 10) {
                ecrivainDeFichier.write("Oh ! Tu es un sorcier, Harry !");
                System.out.println("Oh ! Tu es un sorcier, Harry !");
            }

        } catch (IOException e) {
            System.out.println("Erreur d'ouverture de fichier résultat");
        } finally {
            // On ferme le scanner et le fichier afin qu'il soit sauvegardé
            scanner.close();
            ecrivainDeFichier.close();
        }
    }
}
