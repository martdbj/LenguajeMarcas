package marzo.test.testMDB;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TiendaTestMDB {
    final static String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\marzo\\src\\main\\java\\marzo\\test\\testMDB\\";
    static BibliotecaMDB biblioteca = new BibliotecaMDB();

    public static void main(String[] args) {
        unmarshalling();
        marshalling();
    }

    // Pasar XML a objeto
    private static void unmarshalling() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(BibliotecaMDB.class);
            Unmarshaller um = contexto.createUnmarshaller();
            biblioteca = (BibliotecaMDB) um.unmarshal(new File(RUTA_FICH+"bibliotecaMDB.xml"));
            System.out.println(biblioteca);
            
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void marshalling() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(BibliotecaMDB.class);
            Marshaller marshal = contexto.createMarshaller();
            marshal.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshal.marshal(biblioteca, new File(RUTA_FICH+"biblioteca_salida_MDB.xml"));
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
