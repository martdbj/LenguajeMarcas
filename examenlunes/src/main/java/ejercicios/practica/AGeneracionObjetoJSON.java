package ejercicios.practica;

import java.io.FileWriter;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class AGeneracionObjetoJSON {
    public static void main(String[] args) {
        final String RUTA_FICH = "/home/fluza/GItHub/LenguajeMarcas/examenlunes/src/main/java/ejercicios/practica/";
        //Generamos el primer objeto JSON
        JsonObject objetoJson1 = new JsonObject();
        objetoJson1.addProperty("coche","rojo");
        objetoJson1.addProperty("temperatura", 22.5);
        objetoJson1.addProperty("anyo", 2005);
        //Generamos el segundo objeto JSON
        JsonObject objetoJson2 = new JsonObject();
        objetoJson2.addProperty("Hola", "mundo");


        //Insertamos objeto 2 en el objeto1
        objetoJson1.add("mensaje", objetoJson2);

        //Ahora objeto JsonArray
        JsonArray jsonArrayMeses = new JsonArray();
        jsonArrayMeses.add("Enero");
        jsonArrayMeses.add("Febrero");
        jsonArrayMeses.add("Marzo");
        objetoJson1.add("meses", jsonArrayMeses);
        System.out.println("Objeto json: " + objetoJson1.toString());

        //Escribimos el objeto json en un fichero 
        try {
            FileWriter fw = new FileWriter(RUTA_FICH+"A Output.json");
            fw.write(objetoJson1.toString());
            System.out.println("Json producido correctamente");
            fw.close();
        } catch (Exception e) {
            // TODO: handle exception
        }
    }
}

