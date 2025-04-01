package marzo.test.testMDB;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="biblioteca")
@XmlAccessorType(XmlAccessType.FIELD)

public class BibliotecaMDB {
    @XmlElement(name="libro")
    private List<LibroMDB> biblioteca = null;

    public BibliotecaMDB(){}

    public List<LibroMDB> getBiblioteca() {
        return biblioteca;
    }

    @Override
    public String toString() {
        return "BibliotecaMDB [biblioteca=" + biblioteca + "]";
    }

    
}
