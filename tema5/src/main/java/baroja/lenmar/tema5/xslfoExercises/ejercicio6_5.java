package baroja.lenmar.tema5.xslfoExercises;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.fop.apps.FOPException;

public class ejercicio6_5 {
    public static void main(String[] args) {
        final String RUTA_FICH = "D:\\Daw_github\\Lenguaje_marcas\\tema5\\src\\main\\java\\baroja\\lenmar\\tema5\\xslfoExercises\\";
        
        utilidades util = new utilidades();
        try {
            util.generarPDF("ejercicio6_5.xml", "ejercicio6_5.xsl", "ejercicio6_5.pdf", RUTA_FICH);
        } catch (IOException | TransformerException | FOPException e) {
        }
    }
}
