package baroja.lenmar.tema5.examen;

import java.io.IOException;

import javax.xml.transform.TransformerException;

import org.apache.fop.apps.FOPException;

public class pract2 {
    public static void main(String[] args) {
        final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\tema5\\src\\main\\java\\baroja\\lenmar\\tema5\\examen\\";
        
        utilidades util = new utilidades();
        try {
            util.generarPDF("pract2.xml", "pract2.xsl", "pract2.pdf", RUTA_FICH);
        } catch (IOException | TransformerException | FOPException e) {
            // TODO: handle exception
        }
    }
}
