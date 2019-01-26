package backend.Actividades;

public class Correo {
    String correoEmisor;
    String contrasenia;
    String correoReceptor;
    String asunto;
    String mensaje;
    String nombreArchivo;
    String rutaArchivo;

    public Correo() {

    }

    public Correo(String correoEmisor, String contrasenia, String correoReceptor, String asunto, String mensaje,
                  String nombreArchivo, String rutaArchivo) {
        this.correoEmisor = correoEmisor;
        this.contrasenia = contrasenia;
        this.correoReceptor = correoReceptor;
        this.asunto = asunto;
        this.mensaje = mensaje;
        this.nombreArchivo = nombreArchivo;
        this.rutaArchivo = rutaArchivo;
    }

    public String getCorreoEmisor() {
        return correoEmisor;
    }

    public String getContrasenia() {
        return contrasenia;
    }

    public String getCorreoReceptor() {
        return correoReceptor;
    }

    public String getAsunto() {
        return asunto;
    }

    public String getMensaje() {
        return mensaje;
    }

    public String getNombreArchivo() {
        return nombreArchivo;
    }

    public String getRutaArchivo() {
        return rutaArchivo;
    }

    public void setCorreoEmisor(String correoEmisor) {
        this.correoEmisor = correoEmisor;
    }

    public void setContrasenia(String contrasenia) {
        this.contrasenia = contrasenia;
    }

    public void setCorreoReceptor(String correoReceptor) {
        this.correoReceptor = correoReceptor;
    }

    public void setAsunto(String asunto) {
        this.asunto = asunto;
    }

    public void setMensaje(String mensaje) {
        this.mensaje = mensaje;
    }

    public void setNombreArchivo(String nombreArchivo) {
        this.nombreArchivo = nombreArchivo;
    }

    public void setRutaArchivo(String rutaArchivo) {
        this.rutaArchivo = rutaArchivo;
    }
}
