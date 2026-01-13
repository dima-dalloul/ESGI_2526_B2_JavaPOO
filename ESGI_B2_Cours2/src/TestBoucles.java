public class TestBoucles {
    public static void main(String[] args){
        // Exemple avec While
        int i = 1;
        System.out.println("Exemple While pour compter de 1 à 5");
        while(i <= 5){
            System.out.println(i);
            i++;
        }

        System.out.println("Exemple For pour compter de 10 à 5 (exclus)");
        for(int j = 10; j > 5; j--){
            System.out.println(j);
        }

        System.out.println("Exemple For pour compter de 5 à 10 (exclus)");
        for(int j = 5; j < 10; j++){
            System.out.println(j);
        }

        System.out.println("Exemple Do While pour compter de 1 à 5 (exclus)");
        int k = 1;
        do{
            System.out.println(k);
            k++;
        } while(k < 5);

        System.out.println("Exemple for dans un tableau/collection/ensemble qui peut être de taille non connue d'avance");
        int[] tableau = {7, 8, 14, 0, 8};
        for(int o : tableau){
            if(o < 5)
                System.out.println(o + " est plus petit que 5");
            else
                System.out.println(o + " est plus grand ou égal à 5");
        }
    }
}
