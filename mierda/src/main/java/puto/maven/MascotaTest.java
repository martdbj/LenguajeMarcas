package puto.maven;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MascotaTest {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\mierda\\src\\main\\java\\puto\\maven\\";
    static Mascotas mascotaClase = new Mascotas();

    public static void main(String[] args) {
        unmarshallingMascotas();
        marshallingMascotas();
    }

    private static void unmarshallingMascotas() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Mascotas.class);
            Unmarshaller um = contexto.createUnmarshaller();
            mascotaClase = (Mascotas) um.unmarshal(new File(RUTA_FICH+"mascotas.xml"));
            System.out.println("Lista de mascotas: " + mascotaClase);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void marshallingMascotas() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Mascotas.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(mascotaClase, new File (RUTA_FICH+"mascotasOUT.xml"));
            System.out.println("Fichero generado correctamente");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
