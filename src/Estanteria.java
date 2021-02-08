import java.util.ArrayList;
import java.util.Collections;

/**
 * PACKAGE_NAME
 * Nombre_project: Mi_Estanteria
 * Estanteria
 * Created by: sheng
 * Date : 04/02/2021
 * Description:
 **/
public class Estanteria {
    ArrayList<libro> libros = new ArrayList<libro>(10);

    public void Estanteria() {
            for (int i = 0; i < 10; i++) {
                libros.add(new libro("", "", 0));
            }
    }

    public void AfegirLlibre(int posicion, libro libro)  {
        if (libros.get(posicion).getCualificacion() == 0) {
            if (libros.contains(libro)) {
            } else {
                if (libros.get(posicion).getCualificacion() == 0) {
                    libros.set(posicion, libro);
                } else {
                    System.out.println("error");
                }
            }
        } else {
            System.out.println("Estanteria ahora mismo esta lleno");
        }
    }

    public void EliminarLlibre(String libro) {
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getTitulo().equals(libro)) {
                libros.remove(libros.get(i));
                libros.add(new libro("", "", 0));
            }
        }
    }

    public void Top10() {
        int contador = 1;
        System.out.println("---------------------------TOP 10 DE LOS LIBROS-------------------");
        for (int i = libros.size(); i > -1; i--) {
            Collections.sort(libros);
            for (libro libro : libros) {
                if (libro != null) {
                    if (libro.getCualificacion() == i) {
                        System.out.println(contador + " : " + libro.getTitulo() + " Cualificacion: " + libro.getCualificacion());
                        contador++;
                    }
                }
            }
        }
    }

    public void VeuresEstanteria() {
        System.out.println("---------- MI ESTANTERIA----------");
        for (int i = 0; i < libros.size(); i++) {
            if (libros.get(i).getCualificacion() == 0) {
                System.out.println("No hay libros , esta vacio");
            } else {
                System.out.println(libros.get(i).toString());
            }
        }
    }

    public ArrayList<libro> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<libro> libros) {
        this.libros = libros;
    }

}