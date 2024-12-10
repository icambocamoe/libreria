import java.util.List;

public class Libreria {
    private String nombre;
    private List<Categoria> categorias;

    public Libreria(String nombre, List<Categoria> categorias) {
        this.nombre = nombre;
        this.categorias = categorias;
    }

    void agregarCategoria(Categoria categoria) {
        categorias.add(categoria);
    }

    List<Categoria> mostrarInventario() {
        return categorias;
    }
}
