package baroja.lenmar.tema5.xslfo;
import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class Practica1 {
    public static void main(String[] args) {
        String RutaFich = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\tema5\\src\\main\\java\\baroja\\lenmar\\tema5\\xslfo\\";

        //Nombre del archivo FO
        File xslFile = new File(RutaFich+"practica1.xsl");
        //Nombre del archivo FO-XSL
        StreamSource xmlSource = new StreamSource(new File(RutaFich+"practica1.xml"));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        //Parte de generacion del PDF
        try {
            OutputStream out = new FileOutputStream(RutaFich + "practica1OUT.pdf");
            Fop fop = fopFactory.newFop(MimeConstants.MIME_PDF, foUserAgent, out);
            TransformerFactory factory = TransformerFactory.newInstance();
            Transformer transformer = factory.newTransformer(new StreamSource(xslFile));
            Result res = new SAXResult(fop.getDefaultHandler());
            transformer.transform(xmlSource, res);
            out.close();
        } catch (IOException | TransformerException | FOPException e) {
            System.out.println("Error al generar el pdf");
        }
    }
}
