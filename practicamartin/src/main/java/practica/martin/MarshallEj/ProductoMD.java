package practica.martin.MarshallEj;


import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "producto")
@XmlAccessorType(XmlAccessType.FIELD)

public class ProductoMD {
    private String nombre;
    private Integer precio;
    private Integer stock;
    private String proveedor;

    public ProductoMD(String nombre, Integer precio, Integer stock, String proveedor) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.proveedor = proveedor;
    }
    
    public ProductoMD(){}

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getPrecio() {
        return precio;
    }

    public void setPrecio(Integer precio) {
        this.precio = precio;
    }

    public Integer getStock() {
        return stock;
    }

    public void setStock(Integer stock) {
        this.stock = stock;
    }

    public String getProveedor() {
        return proveedor;
    }

    public void setProveedor(String proveedor) {
        this.proveedor = proveedor;
    }

    @Override
    public String toString() {
        return "Producto [nombre=" + nombre + ", precio=" + precio + ", stock=" + stock + ", proveedor=" + proveedor
                + "]";
    }

    
}
