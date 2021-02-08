/**
 * PACKAGE_NAME
 * Nombre_project: Mi_Estanteria
 * libro
 * Created by: sheng
 * Date : 04/02/2021
 * Description:
 **/
public class libro  implements  Comparable <libro>{

    private String Titulo;
    private String Autor;
    private int Cualificacion;


    public libro(String titulo, String autor, int cualificacion) {
        this.Titulo = titulo;
        this.Autor = autor;
        this.Cualificacion= cualificacion;
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

    @Override
    public String toString() {
        return "libro{" +
                "Titulo='" + Titulo + '\'' +
                ", Autor='" + Autor + '\'' +
                ", Cualificacion=" + Cualificacion +
                '}';
    }

    public int compareTo(libro l) {
        if (l.getCualificacion()<Cualificacion){
            return -1;
        }else if (l.Cualificacion<Cualificacion){
            return 0;
        }else {
            return 1;
        }
    }
}

