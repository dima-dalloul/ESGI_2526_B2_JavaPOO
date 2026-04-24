public class GenericMethodTest {

    // Méthode générique pour afficher les éléments d'un tableau
    public static <E> void printArray(E[] inputArray) {
        // Afficher les éléments dans le tableau
        for (E element : inputArray) {
            System.out.printf("%s ", element);
        }
        System.out.println("\n--------\n");
    }

    public static void main(String[] args){
        // On va créer des tableaux de type différents : Integer, Double et Character puis les afficher avec la méthode
        // générique
        Integer[] intArray = {1, 2, 3, 4, 5};
        Double[] doubles = {1.1, 2.2, 3.3, 4.4, 5.5};
        Character[] charArray = {'H', 'E', 'L', 'L', 'O', ' ', 'L', 'E', 'S', ' ', 'B', '2'};

        System.out.println("Array integerArray contains:");
        printArray(intArray);

        System.out.println("Array doubleArray contains:");
        printArray(doubles);

        System.out.println("Array characterArray contains:");
        printArray(charArray);
    }
}
