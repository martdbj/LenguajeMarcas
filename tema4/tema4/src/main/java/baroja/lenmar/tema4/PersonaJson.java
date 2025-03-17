package baroja.lenmar.tema4;

import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonaJson {
    public static void main(String[] args) {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonMartinD";
        Persona person1 = new Persona("Martin", "Díaz", 19, Arrays.asList("aprender cosas nuevas", "viajar", "escuchar música"));
        Persona person2 = new Persona("Maria", "Martínez", 20, Arrays.asList("libros", "WWE", "Música"));
        List<Persona> listaPersonaOut = Arrays.asList(person1, person2);
        try {
            Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "persona.json"));
            Gson gson = new GsonBuilder().setPrettyPrinting().create();
            gson.toJson(listaPersonaOut, writer);
            writer.close();
            System.out.println("Archivo Json generado correctamente");
        } catch (Exception e) {
        }
    
    }
}
