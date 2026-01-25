import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

import java.io.FileReader;
import java.util.Iterator;

public class DecodageJSONFichier {
    public static void main(String[] args) {
        JSONParser parser = new JSONParser();
        try {
            Object obj = parser.parse(new FileReader("fichier1.json"));
            JSONObject jsonObject = (JSONObject) obj;
            JSONArray companyList = (JSONArray) jsonObject.get("Company List");
            // Un itérateur sur une collection. L'itérateur remplace l'énumération dans le Java Collections Framework.
            // Les itérateurs diffèrent des énumérations de deux manières :
            // 1. Les itérateurs permettent à l'appelant de supprimer des éléments de la collection sous-jacente pendant l'itération avec une sémantique bien définie.
            // 2. Les noms des méthodes ont été améliorés.
            Iterator<JSONObject> iterator = companyList.iterator();
            while (iterator.hasNext()) {
                System.out.println(iterator.next());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}