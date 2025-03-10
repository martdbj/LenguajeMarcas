
import com.google.gson.JsonObject;


public class EjemploJSON {
    final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\tema4\\jsonMD";
    public static void main(String[] args) {
        JsonObject objectoJson1 = new JsonObject();
        objectoJson1.addProperty("coche", "rojo");
        objectoJson1.addProperty("temperatura", 22.5);
        objectoJson1.addProperty("año", 2025);

        // lo volcamos a fichero
        try {
            FileWriter file = new FileWriter(RUTA_FICH"miprimerJSon", StandardCharsets = UTF-8, f
            alse);    
        } catch (Exception e) {
        }
        

    
    }
}
