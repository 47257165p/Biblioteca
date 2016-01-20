package sample;

import java.util.Date;

/**
 * Created by 47257165p on 15/01/16.
 */
public class Prestamo {

    private Libro libro;
    private Socio socio;
    private Date fechaInicio;
    private Date fechaFinal;

    public Prestamo (Libro libro, Socio socio, Date fechaInicio, Date fechaFinal)
    {
        this.libro = libro;
        this.socio = socio;
        this. fechaInicio = fechaInicio;
        this.fechaFinal = fechaFinal;
    }

    public Libro getLibro() {
        return libro;
    }

    public void setLibro(Libro libro) {
        this.libro = libro;
    }

    public Socio getSocio() {
        return socio;
    }

    public void setSocio(Socio socio) {
        this.socio = socio;
    }

    public Date getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Date fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

    public Date getFechaFinal() {
        return fechaFinal;
    }

    public void setFechaFinal(Date fechaFinal) {
        this.fechaFinal = fechaFinal;
    }
}
