

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Unmarshaller;

import baroja.lenmar.tema4.XMLAnchan.Alumno;
public class AlumnoTest {


    static Alumno alumnosClases = new Alumno();

    public static void main(String[] args) {
        //Alumno alumno1 = new Alumno(id:1, "JeanPaul", "Milachay", notaMedia:8);
        //alumnosClases.getAlumnos().add(alumno1);
        alumnosClases.getAlumnos().add(alumno2);

        public static void UnmarshallerAlumnos() {
            try {
                JAXBContext contexto = JAXBContext.newInstance(classesToBeBound);
                Unmarshaller marshaller = contexto.createUnmarshaller();
                marshaller Unmarshaller File(RUTA_FICH"socio.xml");

            } catch (Exception e) {
            }
        }


        

    }
}
