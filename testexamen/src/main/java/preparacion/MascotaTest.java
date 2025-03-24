package preparacion;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class MascotaTest {
    final static String RUTA_FICH = "D:\\Daw_github\\Lenguaje_marcas\\testexamen\\src\\main\\java\\preparacion\\";
    static Mascotas mascotasClase = new Mascotas();

    public static void main(String[] args) {
        unmarshallingMascotas();
        marshallingMascotas();
    }
    private static void unmarshallingMascotas() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Mascotas.class);
            Unmarshaller um = contexto.createUnmarshaller();
            mascotasClase = (Mascotas) um.unmarshal(new File(RUTA_FICH+"mascotas.xml"));
            System.out.println("Lista de mascotas leidas: " + mascotasClase);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
    private static void marshallingMascotas() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Mascotas.class);
            Marshaller  marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(mascotasClase, new File(RUTA_FICH+"mascotasOUT.xml"));
            System.out.println("XML de salida generado correctamente");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
