package BBDD;

public class RecordatorioEntity {
    private int cedulaDestinatario;
    private String titulo;
    private int minutoreacion;
    private int horaCreacion;
    private int diaCreacion;
    private int mesCreacion;
    private int añoCreacion;
    private String descripcion;
    //lista ReferenciasAdjuntas


    public RecordatorioEntity(int cedulaDestinatario, String titulo, int minutoreacion, int horaCreacion, int diaCreacion,
                              int mesCreacion, int añoCreacion, String descripcion) {
        this.cedulaDestinatario = cedulaDestinatario;
        this.titulo = titulo;
        this.minutoreacion = minutoreacion;
        this.horaCreacion = horaCreacion;
        this.diaCreacion = diaCreacion;
        this.mesCreacion = mesCreacion;
        this.añoCreacion = añoCreacion;
        this.descripcion = descripcion;
    }

    public int getCedulaDestinatario() {
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

    public int getDiaCreacion() {
        return diaCreacion;
    }

    public int getMesCreacion() {
        return mesCreacion;
    }

    public int getAñoCreacion() {
        return añoCreacion;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setCedulaDestinatario(int cedulaDestinatario) {
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

    public void setDiaCreacion(int diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public void setMesCreacion(int mesCreacion) {
        this.mesCreacion = mesCreacion;
    }

    public void setAñoCreacion(int añoCreacion) {
        this.añoCreacion = añoCreacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
