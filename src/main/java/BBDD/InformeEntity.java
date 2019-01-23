package BBDD;

public class InformeEntity {
    private int numeroClientesAtendidos;
    private int numeroCaptacionesCompletadas;
    private int numeroHorasActivo;
    private int numeroHorasInactivo;
    private int diaUltimoInicio;
    private int mesUltimoInicio;
    private int anhoUltimoInicio;
    private int diaUltimaSalida;
    private int mesUltimaSalida;
    private int anhoUltimaSalida;

    public InformeEntity(int numeroClientesAtendidos, int numeroCaptacionesCompletadas, int numeroHorasActivo,
                         int numeroHorasInactivo, int diaUltimoInicio, int mesUltimoInicio, int anhoUltimoInicio,
                         int diaUltimaSalida, int mesUltimaSalida, int anhoUltimaSalida) {

        this.numeroClientesAtendidos = numeroClientesAtendidos;
        this.numeroCaptacionesCompletadas = numeroCaptacionesCompletadas;
        this.numeroHorasActivo = numeroHorasActivo;
        this.numeroHorasInactivo = numeroHorasInactivo;
        this.diaUltimoInicio = diaUltimoInicio;
        this.mesUltimoInicio = mesUltimoInicio;
        this.anhoUltimoInicio = anhoUltimoInicio;
        this.diaUltimaSalida = diaUltimaSalida;
        this.mesUltimaSalida = mesUltimaSalida;
        this.anhoUltimaSalida = anhoUltimaSalida;
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

    public int getAnhoUltimoInicio() {
        return anhoUltimoInicio;
    }

    public int getDiaUltimaSalida() {
        return diaUltimaSalida;
    }

    public int getMesUltimaSalida() {
        return mesUltimaSalida;
    }

    public int getAnhoUltimaSalida() {
        return anhoUltimaSalida;
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

    public void setAnhoUltimoInicio(int anhoUltimoInicio) {
        this.anhoUltimoInicio = anhoUltimoInicio;
    }

    public void setDiaUltimaSalida(int diaUltimaSalida) {
        this.diaUltimaSalida = diaUltimaSalida;
    }

    public void setMesUltimaSalida(int mesUltimaSalida) {
        this.mesUltimaSalida = mesUltimaSalida;
    }

    public void setAnhoUltimaSalida(int anhoUltimaSalida) {
        this.anhoUltimaSalida = anhoUltimaSalida;
    }
}
