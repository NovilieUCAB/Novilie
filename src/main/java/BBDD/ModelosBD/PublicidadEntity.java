package BBDD.ModelosBD;

public class PublicidadEntity {
    private String urlBase;
    private String cuenta;
    private String contrasenha;
    private String referenciaInmueble;

    public PublicidadEntity() {
    }

    public PublicidadEntity(String urlBase, String cuenta, String contrasenha, String referenciaInmueble) {
        this.urlBase = urlBase;
        this.cuenta = cuenta;
        this.contrasenha = contrasenha;
        this.referenciaInmueble = referenciaInmueble;
    }

    public String getUrlBase() {
        return urlBase;
    }

    public void setUrlBase(String urlBase) {
        this.urlBase = urlBase;
    }

    public String getCuenta() {
        return cuenta;
    }

    public void setCuenta(String cuenta) {
        this.cuenta = cuenta;
    }

    public String getContrasenha() {
        return contrasenha;
    }

    public void setContrasenha(String contrasenha) {
        this.contrasenha = contrasenha;
    }

    public String getReferenciaInmueble() {
        return referenciaInmueble;
    }

    public void setReferenciaInmueble(String referenciaInmueble) {
        this.referenciaInmueble = referenciaInmueble;
    }
}
