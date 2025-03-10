
import java.io.FileWriter;
import java.nio.charset.StandardCharsets;

import com.google.gson.JsonObject;


public class EjemploJSON {
    
    public static void main(String[] args) {
        final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\tema4\\jsonMD";
        JsonObject objectoJson1 = new JsonObject();
        objectoJson1.addProperty("coche", "rojo");
        objectoJson1.addProperty("temperatura", 22.5);
        objectoJson1.addProperty("año", 2025);

        // lo volcamos a fichero
        try {
            FileWriter file = new FileWriter(RUTA_FICH + "miprimerJSon.json", StandardCharsets:UTF_8 ,false);    
        } catch (Exception e) {
        }
        

    
    }
}
