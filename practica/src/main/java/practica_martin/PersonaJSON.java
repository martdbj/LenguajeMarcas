package practica_martin;

import java.util.ArrayList;
import java.util.List;

import com.google.gson.Gson;

public class PersonaJSON {
    public static void main(String[] args) {
        // Lista de personas a formato JSON e imprimirlo por pantalla
        ArrayList aficiones = new ArrayList<>();
        aficiones.add("cine");
        aficiones.add("fútbol");
        aficiones.add("LOL");
        
        ArrayList aficiones1 = new ArrayList<>();
        aficiones1.add("libros");
        aficiones1.add("fútbol");
        aficiones1.add("música");

        Persona persona1 = new Persona("Pepe", "Pérez", 20, aficiones);
        Persona persona2 = new Persona("María", "Martínez", 21, aficiones1);

        List<Persona> listaPersonas = new ArrayList<>();
        listaPersonas.add(persona1);
        listaPersonas.add(persona2);
        // A formato json con gson e imprimir por pantalla
        Gson gson = new Gson();
        String persona1String = gson.toJson(listaPersonas);
        System.out.println(persona1String);
    }
}
