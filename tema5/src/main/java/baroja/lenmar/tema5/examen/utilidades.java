package baroja.lenmar.tema5.examen;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

import javax.xml.transform.Result;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerConfigurationException;
import javax.xml.transform.TransformerException;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.sax.SAXResult;
import javax.xml.transform.stream.StreamSource;

import org.apache.fop.apps.FOPException;
import org.apache.fop.apps.FOUserAgent;
import org.apache.fop.apps.Fop;
import org.apache.fop.apps.FopFactory;
import org.apache.fop.apps.MimeConstants;

public class utilidades {

    public void generarPDF(String xmlEntrada, String xslEntrada, String archivoSalida, String RUTA_FICH) throws TransformerConfigurationException, FileNotFoundException, FOPException, TransformerException, IOException {
        //Nombre del archivo FO
        File xslFile = new File(RUTA_FICH+xslEntrada);
        //Nombre del archivo FO-XSL
        StreamSource xmlSource = new StreamSource(new File(RUTA_FICH+xmlEntrada));
        FopFactory fopFactory = FopFactory.newInstance(new File(".").toURI());
        FOUserAgent foUserAgent = fopFactory.newFOUserAgent();

        //Parte de generacion del PDF
        try {
            OutputStream out = new FileOutputStream(RUTA_FICH+archivoSalida);
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
