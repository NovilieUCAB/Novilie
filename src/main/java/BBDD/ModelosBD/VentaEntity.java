package BBDD.ModelosBD;

import BBDD.Fecha;

import java.util.HashMap;

public class VentaEntity {
    private  String codInmueble;
    private  String cedulaCliente;
    private  Fecha fechaRegistro;
    private  HashMap<String,Integer> cedulaAsesorComision;
    private  HashMap<String,Boolean> criteriosCierre;
    private  float porcentajeInicial;
    private  float precioIncial;
    private  float precioParcial;
    private  float precioDeContado;
    private  int tasaInteres;
    private  int numeroCuotas;
    private  float precioTotal;
    private  int plazoPago; // esta determinado por años

    public VentaEntity(String codInmueble, String cedulaCliente,Fecha fecha, HashMap<String, Integer> cedulaAsesorComision,
                       HashMap<String, Boolean> criteriosCierre, float porcentajeInicial, float precioDeContado,
                       int tasaInteres, int plazoPago) {
        this.codInmueble = codInmueble;
        this.cedulaCliente = cedulaCliente;
        this.fechaRegistro=fecha;
        this.cedulaAsesorComision = cedulaAsesorComision;
        this.criteriosCierre = criteriosCierre;
        this.porcentajeInicial = porcentajeInicial;
        this.precioDeContado = precioDeContado;
        this.tasaInteres = tasaInteres;
        this.plazoPago = plazoPago;
        this.numeroCuotas=plazoPago*12;
        this.precioIncial=precioDeContado*porcentajeInicial;
        this.precioParcial=(precioDeContado-precioIncial)*(1+(tasaInteres/100))/numeroCuotas;
        this.precioTotal=precioIncial+(precioParcial*numeroCuotas);
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
