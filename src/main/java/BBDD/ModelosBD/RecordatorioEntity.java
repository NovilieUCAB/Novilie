package BBDD.ModelosBD;

public class RecordatorioEntity {
    private String cedulaDestinatario;
    private String titulo;
    private int minutoreacion;
    private int horaCreacion;
    private int diaCreacion;
    private int mesCreacion;
    private int anhoCreacion;
    private String descripcion;

    public RecordatorioEntity() {
    }

    public RecordatorioEntity(String cedulaDestinatario, String titulo, int minutoreacion, int horaCreacion, int diaCreacion,
                              int mesCreacion, int anhoCreacion, String descripcion) {
        this.cedulaDestinatario = cedulaDestinatario;
        this.titulo = titulo;
        this.minutoreacion = minutoreacion;
        this.horaCreacion = horaCreacion;
        this.diaCreacion = diaCreacion;
        this.mesCreacion = mesCreacion;
        this.anhoCreacion = anhoCreacion;
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

    public int getDiaCreacion() {
        return diaCreacion;
    }

    public int getMesCreacion() {
        return mesCreacion;
    }

    public int getAnhoCreacion() {
        return anhoCreacion;
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

    public void setDiaCreacion(int diaCreacion) {
        this.diaCreacion = diaCreacion;
    }

    public void setMesCreacion(int mesCreacion) {
        this.mesCreacion = mesCreacion;
    }

    public void setAnhoCreacion(int anhoCreacion) {
        this.anhoCreacion = anhoCreacion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
}
