import java.util.List;
import java.util.ArrayList;

public class Inventario<T> {
    private List<T> productos;

    public Inventario(List<T> productos) {
        this.productos = productos;
    }

    void agregarProducto(Producto producto) {
        productos.add((T) producto);
    }

    List<T> getProductos() {
        return productos;
    }
}
