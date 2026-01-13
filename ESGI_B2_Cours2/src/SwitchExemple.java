import java.util.Scanner;

public class SwitchExemple {
    public static void main(String[] args){
        System.out.println("Veuillez entrer un caractère");
        Scanner s = new Scanner(System.in);
        char a = s.nextLine().charAt(0);

        switch (a){
            case 'a':
                System.out.println('a');
                break;
            case 'b':
                System.out.println("b");
                break;
            case 'c':
                System.out.println("c");
                break;
            case 'd':
                System.out.println("d");
                break;
            default:
                System.out.println("autre");
                break;
        }
    }
}