package model.Modulo_Publicaciones;

public class Publicacion {
    private String datosPublicacion;
    private String fecha;
    private String hora;
    private String autor;

    // Constructor vacío
    public Publicacion() {}

    // Constructor
    public Publicacion(String datosPublicacion, String fecha, String hora, String autor) {
        this.datosPublicacion = datosPublicacion;
        this.fecha = fecha;
        this.hora = hora;
        this.autor = autor;
    }

    // Getters and Setters
    public String getDatosPublicacion() {
        return datosPublicacion;
    }

    public void setDatosPublicacion(String datosPublicacion) {
        this.datosPublicacion = datosPublicacion;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    // Metodos
    public void recibeDatosPublicacion() {
        // Implementación
    }

    public String obtieneFecha() {
        // Implementación
        return null;
    }

    public String obtieneHora() {
        // Implementación
        return null;
    }

    public String obtieneAutor() {
        // Implementación
        return null;
    }

    public void solicitaGuardado() {
        // Implementación
    }
}
