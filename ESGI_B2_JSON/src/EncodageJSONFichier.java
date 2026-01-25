import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.io.FileWriter;
import java.io.IOException;

public class EncodageJSONFichier {
    private static FileWriter fichierJSON;

    public static void main(String[] args) {
        try {
            JSONObject jsonObject = new JSONObject();
            jsonObject.put("Name", "Dalloul.eu");
            jsonObject.put("Author", "Dima Dalloul");
            JSONArray societes = new JSONArray();
            societes.add("Company: Facebook");
            societes.add("Company: PayPal");
            societes.add("Company: Google");
            jsonObject.put("Company List", societes);

            // Construit un FileWriter à partir d'un nom de fichier, en utilisant le jeu de caractères par défaut de la plate-forme.
            fichierJSON = new FileWriter("societes.txt");
            fichierJSON.write(jsonObject.toJSONString());
            log("Objet JSON copié avec succès dans le fichier...");
            log("\nObjet JSON: " + jsonObject);
            fichierJSON.flush();
            fichierJSON.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
    static public void log(String str) {
        System.out.println(str);
    }
}
