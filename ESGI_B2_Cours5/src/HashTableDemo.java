import java.util.Enumeration;
import java.util.Hashtable;

public class HashTableDemo {

    public static void main(String[] args) {
        // Creat e a hash map
        Hashtable balance = new Hashtable();
        Enumeration names;
        String str;
        double bal;

        balance.put("Kieran", 3434.34);
        balance.put("Guillaume", 5432.45);
        balance.put("Thomas", 7894.56);
        balance.put("Louka", 8953.12);
        balance.put("Jérôme", 8736.54);
        balance.put("Liam", 9863.23);
        balance.put("Hermann", 7654.23);
        balance.put("Florian", 6542.23);
        balance.put("Tania", 7652.23);
        balance.put("Mayzer", 9852.23);
        balance.put("Nicolas", 7652.23);

        // Afficher les montants stockés dans la table de hachage
        names = balance.keys();

        while(names.hasMoreElements()) {
            str = (String) names.nextElement();
            System.out.println(str + ": " + balance.get(str));
        }

        System.out.println();

        // Dépôt de 1000 euros dans la compte de Tania
        bal = ((double) balance.get("Tania"));
        balance.put("Tania", bal + 1000);
        System.out.println("Tania's new balance: " + balance.get("Tania"));

    }
}
