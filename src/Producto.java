public abstract class Producto implements intProducto{
    protected String nombre;
    protected double precio;
    protected String codigo;
    protected String descripcion;

    public Producto(String nombre, double precio, String codigo, String descripcion) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    public abstract void mostrarProducto();

    @Override
    public String getNombre() {
        return nombre;
    }

    @Override
    public double getPrecio() {
        return precio;
    }

    @Override
    public String getCodigo() {
        return codigo;
    }

    @Override
    public String getDescripcion() {
        return descripcion;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    public String toString(){
        return "Nombre: "+this.nombre + ", Precio: " + this.precio + ", Codigo: " + this.codigo + ", Descripcion " + this.descripcion;
    }
}

