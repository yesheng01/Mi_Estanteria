
/**
 * PACKAGE_NAME
 * Nombre_project: Mi_Estanteria
 * TestEstanteria
 * Created by: sheng
 * Date : 04/02/2021
 * Description:
 **/
public class TestEstanteria {
    public static void main(String[] args) {
        Estanteria e = new Estanteria();
        libro libro1 = new libro("El orden del Fenix", "JK ROWLING", 10);
        libro libro2 = new libro("Leyendas de Mio Cid", "Anonimo", 6);
        e.Estanteria();
        e.AfegirLlibre(0, libro1);
        e.AfegirLlibre(1, libro2);
        libro libro3 = new libro("La Bibilia", "Anonimo", 9);
        libro libro4 = new libro("Don Quijote de La Mancha", "Miguel De Cervantes", 7);
        libro libro5 = new libro("El Señor de los Anillos", "J.R.R. Tolkien ", 5);
        e.AfegirLlibre(2, libro3);
        e.AfegirLlibre(3, libro4);
        e.AfegirLlibre(4, libro5);
        e.Top10();
        System.out.println("\n");
        System.out.println("Eliminando ......" + libro3.getTitulo() + "\n");
        e.EliminarLlibre(libro3.getTitulo());
        e.VeuresEstanteria();
    }
}
