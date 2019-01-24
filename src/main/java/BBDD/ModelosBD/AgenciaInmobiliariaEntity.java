package BBDD.ModelosBD;

import javafx.scene.image.Image;

import java.io.File;

public class AgenciaInmobiliariaEntity {
    private String nombreAgencia;
    private String lema;
    private Image logo;
    private String urlPaginaWeb;
    private String parroquiaDireccion;
    private String municipioDireccion;
    private String estadoDireccion;
    private String ciudadDireccion;
    private String direccion;

    public AgenciaInmobiliariaEntity() {
    }

    public AgenciaInmobiliariaEntity(String nombreAgencia, String lema, String urlPaginaWeb, String parroquiaDireccion, String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion, Image logo) {
        this.nombreAgencia = nombreAgencia;
        this.lema = lema;
        this.urlPaginaWeb = urlPaginaWeb;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
        this.logo = logo;
    }

    public Image getLogo() {
        return logo;
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

    public void setLogo(Image logo) {
        this.logo = logo;
    }

    @Override
    public String toString() {
        return "AgenciaInmobiliariaEntity{" +
                "nombreAgencia='" + nombreAgencia + '\'' +
                ", lema='" + lema + '\'' +
                ", urlPaginaWeb='" + urlPaginaWeb + '\'' +
                ", parroquiaDireccion='" + parroquiaDireccion + '\'' +
                ", municipioDireccion='" + municipioDireccion + '\'' +
                ", estadoDireccion='" + estadoDireccion + '\'' +
                ", ciudadDireccion='" + ciudadDireccion + '\'' +
                ", direccion='" + direccion + '\'' +
                '}';
    }
}
