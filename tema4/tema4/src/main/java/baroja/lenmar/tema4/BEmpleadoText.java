package baroja.lenmar.tema4;

import java.io.Reader;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;

import com.google.gson.Gson;

public class BEmpleadoText {
    public static void main(String[] args) {
        final String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\JsonMartinD";
        try {
            Gson gson = new Gson();
            Reader reader = Files.newBufferedReader(Paths.get(RUTA_FICH + "empleado.json"));
            //Convertir a objeto persona 
            //voy leyendo uno a uno y por cada atributo y valor lo voy asignando a un new Persona();
            //en vez de eso qeu es muy largo  
            List<AEmpleado> listaEmpleados = Arrays.asList(gson.fromJson(reader, AEmpleado[].class));
            System.out.println(listaEmpleados);
        } catch (Exception e) {
        }
    }
}