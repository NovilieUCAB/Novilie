package BBDD.ModelosBD;

import BBDD.Fecha;

public class VisitaEntity {

    private String cedulaClientePotencial;
    private String cedulaPropietario;
    private String cedulaAsesor;
    private String referenciaInmueble;
    private Fecha fechaVisita;
    private int horaVisita;
    private int minVisita;

    public VisitaEntity() {
    }

    public VisitaEntity(String cedulaClientePotencial, String cedulaPropietario, String cedulaAsesor, String referenciaInmueble, Fecha fechaVisita, int horaVisita, int minVisita) {
        this.cedulaClientePotencial = cedulaClientePotencial;
        this.cedulaPropietario = cedulaPropietario;
        this.cedulaAsesor = cedulaAsesor;
        this.referenciaInmueble = referenciaInmueble;
        this.fechaVisita = fechaVisita;
        this.horaVisita = horaVisita;
        this.minVisita = minVisita;
    }

    public String getReferenciaInmueble() {
        return referenciaInmueble;
    }

    public void setReferenciaInmueble(String referenciaInmueble) {
        this.referenciaInmueble = referenciaInmueble;
    }

    public String getCedulaClientePotencial() {
        return cedulaClientePotencial;
    }

    public void setCedulaClientePotencial(String cedulaClientePotencial) {
        this.cedulaClientePotencial = cedulaClientePotencial;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getCedulaAsesor() {
        return cedulaAsesor;
    }

    public void setCedulaAsesor(String cedulaAsesor) {
        this.cedulaAsesor = cedulaAsesor;
    }

    public Fecha getFechaVisita() {
        return fechaVisita;
    }

    public void setFechaVisita(Fecha fechaVisita) {
        this.fechaVisita = fechaVisita;
    }

    public int getHoraVisita() {
        return horaVisita;
    }

    public void setHoraVisita(int horaVisita) {
        this.horaVisita = horaVisita;
    }

    public int getMinVisita() {
        return minVisita;
    }

    public void setMinVisita(int minVisita) {
        this.minVisita = minVisita;
    }
}
