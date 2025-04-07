package baroja.lenmar.tema5.xslfoExercises;

public class ejercicio6_4 {
    public static void main(String[] args) {
        final String RUTA_FICH = "C:\\Users\\Usuario_Mañana\\Desktop\\Lenguaje_marcas-1\\tema5\\src\\main\\java\\baroja\\lenmar\\tema5\\xslfoExercises\\";
        utilidades util = new utilidades();
        try {
            util.generarPDF("ejercicio6_4.xml","ejercicio6_4.xsl", "pdfOUT.pdf", RUTA_FICH);
        } catch (Exception e) {
        }
    }
}
