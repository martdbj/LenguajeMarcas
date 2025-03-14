package baroja.lenmar.tema4;

public class AEmpleado {
    private int numEmpleado;
    private String nombre;
    private String apellido;
    private String email;
    private String departamento;

    
    public AEmpleado(int numEmpleado, String nombre, String apellido, String email, String departamento) {
        this.numEmpleado = numEmpleado;
        this.nombre = nombre;
        this.apellido = apellido;
        this.email = email;
        this.departamento = departamento;
    }
    

    public int getNumEmpleado() {
        return numEmpleado;
    }

    public void setnumEmpleado(int numEmpleado) {
        this.numEmpleado = numEmpleado;
    }

    public String getnNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getnApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getnEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getnDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }


    @Override
    public String toString() {
        return "Empleado [Numero Empleado " + numEmpleado + " Nombre " + nombre + " Apellido " + apellido + " Email " + email + " Departamento " + departamento
                + "]";
    }

}
