package practica.martin.MarshallEj;

import java.util.List;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "tienda")
@XmlAccessorType(XmlAccessType.FIELD)

public class TiendaMD {
    @XmlElement(name = "producto")

    private List<ProductoMD> Tienda = null;

    public TiendaMD(){}

    public List<ProductoMD> getTienda() {
        return Tienda;
    }

    @Override
    public String toString() {
        return "Tienda [Tienda=" + Tienda + "]";
    }

}
