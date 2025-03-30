package practica.martin.MarshallEj;

import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;

public class TiendaTest {
    final static String RUTA_FICH = "D:\\Daw_github\\Lenguaje_marcas\\practicamartin\\src\\main\\java\\practica\\martin\\MarshallEj\\";
    static TiendaMD tiendaClase = new TiendaMD();

    public static void main(String[] args) {
        unmarshallingTienda();
        marhsallingTienda();
    }

    private static void unmarshallingTienda() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(TiendaMD.class);
            Unmarshaller um = contexto.createUnmarshaller();
            tiendaClase = (TiendaMD) um.unmarshal(new File(RUTA_FICH+"tienda.xml"));
            System.out.println("Lista de productos: " + tiendaClase);
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }

    private static void marhsallingTienda() {
        try {
            JAXBContext contexto = JAXBContext.newInstance(TiendaMD.class);
            Marshaller marshaller = contexto.createMarshaller();
            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
            marshaller.marshal(tiendaClase, new File(RUTA_FICH+"tiendaOUT.xml"));
            System.out.println("Archivo XML generado correctamente");
        } catch (JAXBException e) {
            e.printStackTrace();
        }
    }
}
