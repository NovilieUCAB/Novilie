package BBDD.ModelosBD;

public class PublicidadEntity {
    private String urlBase;
    private String cuenta;
    private String contrasenha;

    public PublicidadEntity(String urlBase, String cuenta, String contrasenha) {
        this.urlBase = urlBase;
        this.cuenta = cuenta;
        this.contrasenha = contrasenha;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public String getCuenta() {
        return cuenta;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }
}
