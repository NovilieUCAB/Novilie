package BBDD;

public class AgenciaInmobiliariaEntity {
    String nombreAgencia;
    String lema;
    // logo
    String urlPaginaWeb;
    String parroquiaDireccion;
    String municipioDireccion;
    String estadoDireccion;
    String ciudadDireccion;
    String direccion;

    public AgenciaInmobiliariaEntity(String nombreAgencia, String lema, String urlPaginaWeb, String parroquiaDireccion, String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion) {
        this.nombreAgencia = nombreAgencia;
        this.lema = lema;
        this.urlPaginaWeb = urlPaginaWeb;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
    }

    public String getNombreAgencia() {
        return nombreAgencia;
    }

    public String getLema() {
        return lema;
    }

    public String getUrlPaginaWeb() {
        return urlPaginaWeb;
    }

    public String getParroquiaDireccion() {
        return parroquiaDireccion;
    }

    public String getMunicipioDireccion() {
        return municipioDireccion;
    }

    public String getEstadoDireccion() {
        return estadoDireccion;
    }

    public String getCiudadDireccion() {
        return ciudadDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setNombreAgencia(String nombreAgencia) {
        this.nombreAgencia = nombreAgencia;
    }

    public void setLema(String lema) {
        this.lema = lema;
    }

    public void setUrlPaginaWeb(String urlPaginaWeb) {
        this.urlPaginaWeb = urlPaginaWeb;
    }

    public void setParroquiaDireccion(String parroquiaDireccion) {
        this.parroquiaDireccion = parroquiaDireccion;
    }

    public void setMunicipioDireccion(String municipioDireccion) {
        this.municipioDireccion = municipioDireccion;
    }

    public void setEstadoDireccion(String estadoDireccion) {
        this.estadoDireccion = estadoDireccion;
    }

    public void setCiudadDireccion(String ciudadDireccion) {
        this.ciudadDireccion = ciudadDireccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }
}
