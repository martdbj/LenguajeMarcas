package practica.martin.MartinJSON;

import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;

public class EjemploJSON {

    public class MartinJSON {

        public static void main(String[] args) {
            JsonObject objectoJson1 = new JsonObject();
            objectoJson1.addProperty("coche", "rojo");
            objectoJson1.addProperty("temperatura", 22.5);
            objectoJson1.addProperty("anio", 2010);

            JsonObject objetoJson2 = new JsonObject();
            objetoJson2.addProperty("Hola", "Mundo");

            objectoJson1.add("mensaje", objetoJson2);

            JsonArray mesesArray = new JsonArray();
            mesesArray.add("Enero");
            mesesArray.add("Febrero");
            mesesArray.add("Marzo");
            objectoJson1.add("meses", mesesArray);

            try {
                Writer writer = Files.newBufferedWriter(Paths.get("D:\\Daw_github\\Lenguaje_marcas\\practicamartin\\src\\main\\java\\practica\\martin\\MartinJSON\\json.json"));
                Gson gson = new GsonBuilder().setPrettyPrinting().create();
                gson.toJson(objectoJson1, writer);

                writer.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
