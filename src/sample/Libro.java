package sample;

import java.util.Date;

/**
 * Created by 47257165p on 15/01/16.
 */
public class Libro {

    private String titulo;
    private int numero;
    private String editorial;
    private int paginas;
    private Date añoEdicion;

    public Libro (String titulo, int numero, String editorial, int paginas, Date añoEdicion)
    {
        this.titulo = titulo;
        this.numero = numero;
        this.editorial = editorial;
        this. paginas = paginas;
        this.añoEdicion = añoEdicion;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getEditorial() {
        return editorial;
    }

    public void setEditorial(String editorial) {
        this.editorial = editorial;
    }

    public int getPaginas() {
        return paginas;
    }

    public void setPaginas(int paginas) {
        this.paginas = paginas;
    }

    public Date getAñoEdicion() {
        return añoEdicion;
    }

    public void setAñoEdicion(Date añoEdicion) {
        this.añoEdicion = añoEdicion;
    }
}
