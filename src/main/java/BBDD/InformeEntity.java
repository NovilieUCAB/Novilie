package BBDD;

public class InformeEntity {
    private int numeroClientesAtendidos;
    private int numeroCaptacionesCompletadas;
    private int numeroHorasActivo;
    private int numeroHorasInactivo;
    private int diaUltimoInicio;
    private int mesUltimoInicio;
    private int añoUltimoInicio;
    private int diaUltimaSalida;
    private int mesUltimaSalida;
    private int añoUltimaSalida;

    public InformeEntity(int numeroClientesAtendidos, int numeroCaptacionesCompletadas, int numeroHorasActivo,
                         int numeroHorasInactivo, int diaUltimoInicio, int mesUltimoInicio, int añoUltimoInicio,
                         int diaUltimaSalida, int mesUltimaSalida, int añoUltimaSalida) {

        this.numeroClientesAtendidos = numeroClientesAtendidos;
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
        this.numeroHorasActivo = numeroHorasActivo;
        this.numeroHorasInactivo = numeroHorasInactivo;
        this.diaUltimoInicio = diaUltimoInicio;
        this.mesUltimoInicio = mesUltimoInicio;
        this.añoUltimoInicio = añoUltimoInicio;
        this.diaUltimaSalida = diaUltimaSalida;
        this.mesUltimaSalida = mesUltimaSalida;
        this.añoUltimaSalida = añoUltimaSalida;
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

    public int getDiaUltimoInicio() {
        return diaUltimoInicio;
    }

    public int getMesUltimoInicio() {
        return mesUltimoInicio;
    }

    public int getAñoUltimoInicio() {
        return añoUltimoInicio;
    }

    public int getDiaUltimaSalida() {
        return diaUltimaSalida;
    }

    public int getMesUltimaSalida() {
        return mesUltimaSalida;
    }

    public int getAñoUltimaSalida() {
        return añoUltimaSalida;
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

    public void setDiaUltimoInicio(int diaUltimoInicio) {
        this.diaUltimoInicio = diaUltimoInicio;
    }

    public void setMesUltimoInicio(int mesUltimoInicio) {
        this.mesUltimoInicio = mesUltimoInicio;
    }

    public void setAñoUltimoInicio(int añoUltimoInicio) {
        this.añoUltimoInicio = añoUltimoInicio;
    }

    public void setDiaUltimaSalida(int diaUltimaSalida) {
        this.diaUltimaSalida = diaUltimaSalida;
    }

    public void setMesUltimaSalida(int mesUltimaSalida) {
        this.mesUltimaSalida = mesUltimaSalida;
    }

    public void setAñoUltimaSalida(int añoUltimaSalida) {
        this.añoUltimaSalida = añoUltimaSalida;
    }
}
