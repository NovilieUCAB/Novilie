package BBDD.ModelosBD;

import BBDD.Fecha;

public class InformeEntity {
    private String cedulaAsesor;
    private int numeroClientesAtendidos;
    private int numeroCaptacionesCompletadas;
    private int numeroHorasActivo;
    private int numeroHorasInactivo;
    private Fecha ultimoInicio;
    private Fecha ultimaSalida;

    public InformeEntity() {
    }

    public InformeEntity(String cedulaAsesor, int numeroClientesAtendidos, int numeroCaptacionesCompletadas,
                         int numeroHorasActivo, int numeroHorasInactivo, Fecha ultimoInicio, Fecha ultimaSalida) {
        this.cedulaAsesor = cedulaAsesor;
        this.numeroClientesAtendidos = numeroClientesAtendidos;
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
        this.numeroHorasActivo = numeroHorasActivo;
        this.numeroHorasInactivo = numeroHorasInactivo;
        this.ultimoInicio = ultimoInicio;
        this.ultimaSalida = ultimaSalida;
    }

    public String getCedulaAsesor() {
        return cedulaAsesor;
    }

    public void setCedulaAsesor(String cedulaAsesor) {
        this.cedulaAsesor = cedulaAsesor;
    }

    public int getNumeroClientesAtendidos() {
        return numeroClientesAtendidos;
    }

    public void setNumeroClientesAtendidos(int numeroClientesAtendidos) {
        this.numeroClientesAtendidos = numeroClientesAtendidos;
    }

    public int getNumeroCaptacionesCompletadas() {
        return numeroCaptacionesCompletadas;
    }

    public void setNumeroCaptacionesCompletadas(int numeroCaptacionesCompletadas) {
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
    }

    public int getNumeroHorasActivo() {
        return numeroHorasActivo;
    }

    public void setNumeroHorasActivo(int numeroHorasActivo) {
        this.numeroHorasActivo = numeroHorasActivo;
    }

    public int getNumeroHorasInactivo() {
        return numeroHorasInactivo;
    }

    public void setNumeroHorasInactivo(int numeroHorasInactivo) {
        this.numeroHorasInactivo = numeroHorasInactivo;
    }

    public Fecha getUltimoInicio() {
        return ultimoInicio;
    }

    public void setUltimoInicio(Fecha ultimoInicio) {
        this.ultimoInicio = ultimoInicio;
    }

    public Fecha getUltimaSalida() {
        return ultimaSalida;
    }

    public void setUltimaSalida(Fecha ultimaSalida) {
        this.ultimaSalida = ultimaSalida;
    }

    @Override
    public String toString() {
        return "InformeEntity{" +
                "numeroClientesAtendidos=" + numeroClientesAtendidos +
                ", numeroCaptacionesCompletadas=" + numeroCaptacionesCompletadas +
                ", numeroHorasActivo=" + numeroHorasActivo +
                ", numeroHorasInactivo=" + numeroHorasInactivo +
                ", ultimoInicio=" + ultimoInicio.getDia() + "/" + ultimoInicio.getMes() + "/" + ultimoInicio.getAnio() +
                ", ultimaSalida=" + ultimaSalida.getDia() + "/" + ultimaSalida.getMes() + "/" + ultimaSalida.getAnio() +
                '}';
    }
}
