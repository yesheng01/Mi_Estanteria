/**
 * PACKAGE_NAME
 * Nombre_project: Mi_Estanteria
 * libro
 * Created by: sheng
 * Date : 04/02/2021
 * Description:
 **/
public class libro {

    private String Titulo;
    private String Autor;
    private int Cualificacion = 10;


    public libro(String titulo, String autor, int cualificacion) {
        Titulo = titulo;
        Autor = autor;
        Cualificacion = cualificacion;
    }


    public String getTitulo() {
        return Titulo;
    }

    public void setTitulo(String titulo) {
        Titulo = titulo;
    }

    public String getAutor() {
        return Autor;
    }

    public void setAutor(String autor) {
        Autor = autor;
    }

    public int getCualificacion() {
        return Cualificacion;
    }

    public void setCualificacion(int cualificacion) {
        Cualificacion = cualificacion;
    }
}
