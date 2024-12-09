import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        Categoria cienciaFiccion = new Categoria("Ciencia Ficcion", new ArrayList<Producto>());
        Categoria novela = new Categoria("Novela", new ArrayList<Producto>());
        Categoria divulgacion = new Categoria("Divulgacion", new ArrayList<Producto>());
        Categoria moda = new Categoria("Moda", new ArrayList<Producto>());

        cienciaFiccion.agregarProducto(new Libro("trilogia de la fundacion",200,"tf1234","en una galaxia lejana se esta realizando los planes de la revolucion que traera un nuevo regimen para el universo","Isaac Asimov"));
        cienciaFiccion.agregarProducto(new Libro("yo, robot",150,"yr3498","los robots comienzan a pensar por si mismos, hay tres reglas que deben seguir, y uno rompe la tercera","isaac asimov"));
        cienciaFiccion.agregarProducto(new Libro("la guerra de los mundos", 100, "gm2039","en la radio se comienza a narrar como los aliens llegan al planeta y se vencen a los ejercitos, un humano logra escabuyirse entre ellos","h. g. wells"));

        novela.agregarProducto(new Libro("la saga de los juegos del hambre", 300,"jh3487", "kath se ofree como sacrificio en lugar de su hna, ella hara todo lo posible para sobrevivir y ganar","suzanne collins"));
        novela.agregarProducto(new Libro("la saga de divergente", 300, "dv1293", "te das cuenta que no encajas en la misma sociedad en que naciste y decides apartar de ellos al momento de pasar a adulto","veronica roth"));
        novela.agregarProducto(new Libro("la saga del señor de los anillos", 300, "sa2349","la tierra media se ve amenzada por el resurgimiento del señor oscuro, el anillo unico es buscado por su legitimo creador, los hobits tendran que aventurarse para lograr una hazaña","j. r. r. tolkien"));

        divulgacion.agregarProducto(new Revista("National Geographic",100,"ng4532","temas relacionados con la geografía, la historia, la naturaleza, la ciencia y la cultura mundial.","marzo 2024"));
        divulgacion.agregarProducto(new Revista("Muy Interesante",50,"mi9834","fantástica para los curiosos y los amantes de la ciencia, la tecnología, la historia","agosto 2024"));

        moda.agregarProducto(new Revista("Vogue",150,"vg4379","conocida por su estilo elegante y contenido de alta calidad que abarca moda, belleza, cultura y estilo de vida.","abril 2024"));
        moda.agregarProducto(new Revista("¡Hola!",100,"hl4368","revista de celebridades y entretenimiento. Esta revista ofrece una mezcla de noticias de celebridades, eventos sociales, moda y estilo de vida.","septiembre 2024"));

        Inventario inventario = new Inventario(new ArrayList<>());

        cienciaFiccion.getProductos().stream().forEach(libro -> inventario.agregarProducto(libro));
        novela.getProductos().stream().forEach(libro -> inventario.agregarProducto(libro));
        divulgacion.getProductos().stream().forEach(libro -> inventario.agregarProducto(libro));
        moda.getProductos().stream().forEach(libro -> inventario.agregarProducto(libro));

        inventario.getProductos().stream().forEach(producto -> System.out.printf(producto.toString()+"\n"));
    }
}

