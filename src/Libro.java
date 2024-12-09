public class Libro extends Producto{
    private String autor;

    public Libro(String nombre, double precio, String codigo, String descripcion, String autor) {
        super(nombre, precio, codigo, descripcion);
        this.autor= autor;
    }

    public String getAutor() {
        return autor;
    }

    @Override
    public void mostrarProducto() {

    }


}
