public class Revista extends Producto{
    private String edicion;

    public Revista(String nombre, double precio, String codigo, String descripcion, String edicion) {
        super(nombre, precio, codigo, descripcion);
        this.edicion = edicion;
    }

    @Override
    public void mostrarProducto() {

    }
}
