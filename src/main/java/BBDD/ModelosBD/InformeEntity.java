package BBDD.ModelosBD;

import BBDD.Fecha;

public class InformeEntity {
    private int numeroClientesAtendidos;
    private int numeroCaptacionesCompletadas;
    private int numeroHorasActivo;
    private int numeroHorasInactivo;
    private Fecha ultimoInicio;
    private Fecha ultimaSalida;

    public InformeEntity() {
    }

    public InformeEntity(int numeroClientesAtendidos, int numeroCaptacionesCompletadas, int numeroHorasActivo,
                         int numeroHorasInactivo, Fecha ultimoInicio, Fecha ultimaSalida) {

        this.numeroClientesAtendidos = numeroClientesAtendidos;
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
        this.numeroHorasActivo = numeroHorasActivo;
        this.numeroHorasInactivo = numeroHorasInactivo;
        this.ultimoInicio = ultimoInicio;
        this.ultimaSalida = ultimaSalida;
    }

    public int getNumeroClientesAtendidos() {
        return numeroClientesAtendidos;
    }

    public int getNumeroCaptacionesCompletadas() {
        return numeroCaptacionesCompletadas;
    }

    public int getNumeroHorasActivo() {
        return numeroHorasActivo;
    }

    public int getNumeroHorasInactivo() {
        return numeroHorasInactivo;
    }

    public Fecha getUltimoInicio() {
        return ultimoInicio;
    }

    public Fecha getUltimaSalida() {
        return ultimaSalida;
    }

    public void setNumeroClientesAtendidos(int numeroClientesAtendidos) {
        this.numeroClientesAtendidos = numeroClientesAtendidos;
    }

    public void setNumeroCaptacionesCompletadas(int numeroCaptacionesCompletadas) {
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
    }

    public void setNumeroHorasActivo(int numeroHorasActivo) {
        this.numeroHorasActivo = numeroHorasActivo;
    }

    public void setNumeroHorasInactivo(int numeroHorasInactivo) {
        this.numeroHorasInactivo = numeroHorasInactivo;
    }

    public void setUltimoInicio(Fecha ultimoInicio) {
        this.ultimoInicio = ultimoInicio;
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
