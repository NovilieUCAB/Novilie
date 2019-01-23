package BBDD;

public class PublicidadEntity {
    private String urlBase;
    private String cuenta;
    private String contraseña;

    public PublicidadEntity(String urlBase, String cuenta, String contraseña) {
        this.urlBase = urlBase;
        this.cuenta = cuenta;
        this.contraseña = contraseña;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }
}
