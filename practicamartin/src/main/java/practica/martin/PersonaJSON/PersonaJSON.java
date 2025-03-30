package practica.martin.PersonaJSON;

import java.io.IOException;
import java.io.Reader;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class PersonaJSON {
    public static void main(String[] args) {
        final String RUTA_FICH = "D:\\Daw_github\\Lenguaje_marcas\\practicamartin\\src\\main\\java\\practica\\martin\\PersonaJSON\\";

        Persona persona1 = new Persona("Pepe", "Pérez", 20, Arrays.asList("cine", "fútbol", "LOL"));
        Persona persona2 = new Persona("María", "Martínez", 21, Arrays.asList("libros", "música", "WWE"));
        
        // Agrupamos a las dos personas en un ArrayList
        List<Persona> listaPersonaOUT = Arrays.asList(persona1, persona2);

        // Método GSON con toJSON para convertirlo al formato JSON e imprimirlo por pantalla
        Gson gson = new Gson();
        String listaPersonasJSON = gson.toJson(listaPersonaOUT);
        System.out.println("Lista personas en formato JSON: " + listaPersonasJSON);
        
        try {
            // Escritura JSON
            Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH+"persona.json"));
            Gson gsonSalida = new GsonBuilder().setPrettyPrinting().create();
            gsonSalida.toJson(listaPersonaOUT, writer);
            writer.close();
            System.out.println("Fichero generado correctamente");
            
            // Lectura JSON
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH+"persona.json"));
            Gson gsonEntrada = new GsonBuilder().create();
            List<Persona> listaPersonasEntrada = Arrays.asList(gsonEntrada.fromJson(reader, Persona[].class));
            reader.close();
            
            System.out.println("Lista de personas leída del JSON:");
            System.out.println(listaPersonasEntrada);

        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
