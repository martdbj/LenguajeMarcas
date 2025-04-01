package marzo.test.testMDB;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="libro")
@XmlAccessorType(XmlAccessType.FIELD)

public class LibroMDB {
    private String titulo;
    private String autor;
    private int paginas;

    public LibroMDB(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    } 

    public LibroMDB(){}

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    @Override
    public String toString() {
        return "LibroMDB [titulo=" + titulo + ", autor=" + autor + ", paginas=" + paginas + "]";
    }

    
}
