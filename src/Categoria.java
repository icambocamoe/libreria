import java.util.List;

public class Categoria {
    private String nombre;
    private List<Producto> productos;

    public Categoria(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    public void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    public List<Producto> getProductos() {
        return productos;
    }

    public String toString(){
        return nombre;
    }
}
