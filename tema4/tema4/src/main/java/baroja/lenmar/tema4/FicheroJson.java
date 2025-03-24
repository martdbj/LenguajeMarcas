package baroja.lenmar.tema4;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class FicheroJson {
    public static void main(String[] args) {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonMartinD";
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "JsonMartinDpersona.json"));
            //Convertir a objeto persona 
            //vo leyendo uno a uno y por cada atributo y valor lo voy asignando a un new Persona();
            //en vez de eso qeu es muy largo 
            List<Persona> listaPersonaIn = Arrays.asList(gson.fromJson(reader, Persona[].class));
            System.out.println(listaPersonaIn);
        } catch (Exception e) {
        }
    }
}
