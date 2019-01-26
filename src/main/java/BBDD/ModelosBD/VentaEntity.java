package BBDD.ModelosBD;

import java.util.HashMap;

public class VentaEntity {
    private  String codInmueble;
    private  String cedulaCliente;
    private HashMap<String,Integer> cedulaAsesorComision;
    private HashMap<String,Boolean> criteriosCierre;
    private  String tipoPago;
    private  float porcentajeInicial;
    private  float precioDeContado;
    private  int tasaInteres;
    private  int numeroCuotas;
    private  float precioTotal;
    private  int plazoPago;

    public VentaEntity(String codInmueble, String cedulaCliente, HashMap<String, Integer> cedulaAsesorComision,
                       HashMap<String, Boolean> criteriosCierre, String tipoPago, float porcentajeInicial, float precioDeContado,
                       int tasaInteres, int plazoPago) {
        this.codInmueble = codInmueble;
        this.cedulaCliente = cedulaCliente;
        this.cedulaAsesorComision = cedulaAsesorComision;
        this.criteriosCierre = criteriosCierre;
        this.tipoPago = tipoPago;
        this.porcentajeInicial = porcentajeInicial;
        this.precioDeContado = precioDeContado;
        this.tasaInteres = tasaInteres;
        this.plazoPago = plazoPago;
        this.numeroCuotas=plazoPago*12;
    }

    public String getCodInmueble() {
        return codInmueble;
    }

    public String getCedulaCliente() {
        return cedulaCliente;
    }

    public HashMap<String, Integer> getCedulaAsesorComision() {
        return cedulaAsesorComision;
    }

    public HashMap<String, Boolean> getCriteriosCierre() {
        return criteriosCierre;
    }

    public String getTipoPago() {
        return tipoPago;
    }

    public float getPorcentajeInicial() {
        return porcentajeInicial;
    }

    public float getPrecioDeContado() {
        return precioDeContado;
    }

    public int getTasaInteres() {
        return tasaInteres;
    }

    public int getNumeroCuotas() {
        return numeroCuotas;
    }

    public float getPrecioTotal() {
        return precioTotal;
    }

    public int getPlazoPago() {
        return plazoPago;
    }

    public void setCodInmueble(String codInmueble) {
        this.codInmueble = codInmueble;
    }

    public void setCedulaCliente(String cedulaCliente) {
        this.cedulaCliente = cedulaCliente;
    }

    public void setCedulaAsesorComision(HashMap<String, Integer> cedulaAsesorComision) {
        this.cedulaAsesorComision = cedulaAsesorComision;
    }

    public void setCriteriosCierre(HashMap<String, Boolean> criteriosCierre) {
        this.criteriosCierre = criteriosCierre;
    }

    public void setTipoPago(String tipoPago) {
        this.tipoPago = tipoPago;
    }

    public void setPorcentajeInicial(float porcentajeInicial) {
        this.porcentajeInicial = porcentajeInicial;
    }

    public void setPrecioDeContado(float precioDeContado) {
        this.precioDeContado = precioDeContado;
    }

    public void setTasaInteres(int tasaInteres) {
        this.tasaInteres = tasaInteres;
    }

    public void setNumeroCuotas(int numeroCuotas) {
        this.numeroCuotas = numeroCuotas;
    }

    public void setPrecioTotal(float precioTotal) {
        this.precioTotal = precioTotal;
    }

    public void setPlazoPago(int plazoPago) {
        this.plazoPago = plazoPago;
    }
}
