package practica.martin.XMLtoJSON;

import java.io.File;
import java.io.IOException;
import java.io.Writer;
import java.nio.file.Files;
import java.nio.file.Paths;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class TiendaTest {

    final static String RUTA_FICH = "D:\\Daw_github\\Lenguaje_marcas\\practicamartin\\src\\main\\java\\practica\\martin\\XMLtoJSON\\";
    static Tienda papeleria = new Tienda();

    public static void main(String[] args) {
        unmarshallingToJson();
    }

    // Pasar de XML a Json
    private static void unmarshallingToJson() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Tienda.class);
            Unmarshaller um = contexto.createUnmarshaller();
            papeleria = (Tienda) um.unmarshal(new File(RUTA_FICH + "tienda.xml"));
            System.out.println("Papeleria Test: " + papeleria);

            Gson gson = new Gson();
            String listaPersonasJSON = gson.toJson(papeleria);
            System.out.println("Lista personas en formato JSON: " + listaPersonasJSON);

            try {
                // Escritura JSON
                Writer writer = Files.newBufferedWriter(Paths.get(RUTA_FICH + "tienda.json"));
                Gson gsonSalida = new GsonBuilder().setPrettyPrinting().create();
                gsonSalida.toJson(papeleria, writer);
                writer.close();
                System.out.println("Fichero generado correctamente");
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
