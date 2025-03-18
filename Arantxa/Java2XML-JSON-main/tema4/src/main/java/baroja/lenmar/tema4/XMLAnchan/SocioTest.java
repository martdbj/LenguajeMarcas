package baroja.lenmar.tema4.XMLAnchan;
import java.io.File;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;

public class SocioTest {
    final static String RUTA_FICH = "src\\main\\java\\baroja\\lenmar\\tema4\\XMLAnchan\\";
    public static void main(String[] args) {
        try {
            JAXBContext contexto = JAXBContext.newInstance(Socio.class);
            Unmarshaller um = contexto.createUnmarshaller();

            Socio objectEntrada = (Socio) um.unmarshal(new File(RUTA_FICH+"Socio.xml"));
            System.out.println(objectEntrada);
        } catch (JAXBException jex) {
            jex.printStackTrace();
        }
    }
}
