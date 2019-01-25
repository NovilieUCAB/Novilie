package BBDD.ModelosBD;

import BBDD.Fecha;

import java.util.ArrayList;

public class RecordatorioEntity {
    private String cedulaDestinatario;
    private String titulo;
    private int minutoreacion;
    private int horaCreacion;
    private Fecha fechaCreacion;
    private String descripcion;

    public RecordatorioEntity() {
    }

    public RecordatorioEntity(String cedulaDestinatario, String titulo, int minutoreacion, int horaCreacion, Fecha fechaCreacion, String descripcion) {
        this.cedulaDestinatario = cedulaDestinatario;
        this.titulo = titulo;
        this.minutoreacion = minutoreacion;
        this.horaCreacion = horaCreacion;
        this.fechaCreacion = fechaCreacion;
        this.descripcion = descripcion;
    }

    public String getCedulaDestinatario() {
        return cedulaDestinatario;
    }

    public String getTitulo() {
        return titulo;
    }

    public int getMinutoreacion() {
        return minutoreacion;
    }

    public int getHoraCreacion() {
        return horaCreacion;
    }

    public Fecha getFechaCreacion() {
        return fechaCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCedulaDestinatario(String cedulaDestinatario) {
        this.cedulaDestinatario = cedulaDestinatario;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public void setMinutoreacion(int minutoreacion) {
        this.minutoreacion = minutoreacion;
    }

    public void setHoraCreacion(int horaCreacion) {
        this.horaCreacion = horaCreacion;
    }

    public void setFechaCreacion(Fecha fechaCreacion) {
        this.fechaCreacion = fechaCreacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
