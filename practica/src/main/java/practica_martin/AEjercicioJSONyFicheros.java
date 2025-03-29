package practica_martin;
import java.io.FileWriter;

import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class AEjercicioJSONyFicheros {
    public static void main(String[] args) {
        final String RUTA_FICH = "/home/fluza/GItHub/LenguajeMarcas/practica/src/main/java/practica_martin/";
        //Generamos el primer objeto json
        JsonObject objetoJson1 = new JsonObject();
        objetoJson1.addProperty("coche", "rojo");
        objetoJson1.addProperty("temperatura", 22.5);
        objetoJson1.addProperty("anio", 2010);
        //Generamos el segundo objeto json
        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "mundo");

        //Insercion del objeto 2 en el objeto 1
        objetoJson1.add("mensaje", objetoJson2);

        //Ahora objeto jsonArray
        JsonArray jsonArrayMeses = new JsonArray();
        jsonArrayMeses.add("Enero");
        jsonArrayMeses.add("Febrero");
        jsonArrayMeses.add("Marzo");
        objetoJson1.add("Meses", jsonArrayMeses);
        System.out.println("Objeto json: " + objetoJson1.toString());

        //Escribimo el objeto json en un fichero
        try (FileWriter writer = new FileWriter(RUTA_FICH+"AjsonOUT.json")){
            writer.write(objetoJson1.toString());
            writer.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}
