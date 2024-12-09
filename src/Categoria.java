import java.util.List;

public class Categoria {
    private String nombre;
    private List<Producto> productos;

    public Categoria(String nombre, List<Producto> productos) {
        this.nombre = nombre;
        this.productos = productos;
    }

    void agregarProducto(Producto producto) {
        productos.add(producto);
    }

    List<Producto> getProductos() {
        return productos;
    }
}
