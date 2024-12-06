public class Revista extends Producto{
    String edicion;

    public Revista() {
    }

    public Revista(String nombre, double precio, String codigo, String desc, String edicion){
        super.codigo=codigo;
        super.nombre=nombre;
        super.precio=precio;
        super.descripcion=desc;
        this.edicion=edicion;
    }

    @Override
    public void mostrarProducto() {

    }
}
