package practica.martin.XMLtoJSON;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name="tienda")
@XmlAccessorType(XmlAccessType.FIELD)

public class Tienda {
    @XmlElement(name="producto")
    private List<Producto> tienda = null;
    
    public Tienda(){}

    public List<Producto> getTienda() {
        return tienda;
    }

    @Override
    public String toString() {
        return "Tienda [tienda=" + tienda + "]";
    }
}
