package BBDD;

public class InmuebleEntity {
    private String numReferencia;
    private int estadoOperacion;
    // fotos
    private String documentacion;
    private String tipoPropiedad;
    private int precio;
    private boolean operacion;
    private String parroquiaDireccion;
    private String municipioDireccion;
    private String estadoDireccion;
    private String ciudadDireccion;
    private String direccion;
    private int metrosParcela;
    private int metrosConstruccion;
    private boolean ampliacion;
    private int metrosAmpliacion;
    private boolean disponibilidad;
    private boolean luminosidad;
    private int numBanhos;
    private int numAseos;
    private int numHabitaciones;
    private boolean fachada;
    private boolean armariosEmpotrados;
    private int orientacion;
    private boolean salonIndependiente;
    private int metrosSalon;
    private boolean estado;
    private boolean urbanizacion;
    private boolean amueblado;
    private boolean balcon;
    private boolean galeria;
    private int anhoConstruccion;
    private boolean chimenea;
    private boolean terraza;
    private String tipoTecho;
    private boolean comedor;
    private boolean cocina;
    private boolean ascensor;
    private boolean huardilla;
    private boolean garaje;
    private boolean planos;
    private boolean sotano;
    private boolean patio;
    private String tipoSuelo;
    private boolean calefaccion;
    private boolean aguaCaliente;
    private boolean aireAcondicionado;
    private boolean trastero;
    private boolean porteria;
    private boolean zonaServicio;
    private boolean zonaDeportivo;
    private boolean jardin;
    private boolean vigilancia;

    public InmuebleEntity(String numReferencia, int estadoOperacion, String documentacion, String tipoPropiedad, int precio,
                          boolean operacion, String parroquiaDireccion, String municipioDireccion, String estadoDireccion,
                          String ciudadDireccion, String direccion, int metrosParcela, int metrosConstruccion,
                          boolean ampliacion, int metrosAmpliacion, boolean disponibilidad, boolean luminosidad, int numBanhos,
                          int numAseos, int numHabitaciones, boolean fachada, boolean armariosEmpotrados, int orientacion,
                          boolean salonIndependiente, int metrosSalon, boolean estado, boolean urbanizacion, boolean amueblado,
                          boolean balcon, boolean galeria, int anhoConstruccion, boolean chimenea, boolean terraza,
                          String tipoTecho, boolean comedor, boolean cocina, boolean ascensor, boolean huardilla,
                          boolean garaje, boolean planos, boolean sotano, boolean patio, String tipoSuelo, boolean calefaccion,
                          boolean aguaCaliente, boolean aireAcondicionado, boolean trastero, boolean porteria,
                          boolean zonaServicio, boolean zonaDeportivo, boolean jardin, boolean vigilancia) {

        this.numReferencia = numReferencia;
        this.estadoOperacion = estadoOperacion;
        this.documentacion = documentacion;
        this.tipoPropiedad = tipoPropiedad;
        this.precio = precio;
        this.operacion = operacion;
        this.parroquiaDireccion = parroquiaDireccion;
        this.municipioDireccion = municipioDireccion;
        this.estadoDireccion = estadoDireccion;
        this.ciudadDireccion = ciudadDireccion;
        this.direccion = direccion;
        this.metrosParcela = metrosParcela;
        this.metrosConstruccion = metrosConstruccion;
        this.ampliacion = ampliacion;
        this.metrosAmpliacion = metrosAmpliacion;
        this.disponibilidad = disponibilidad;
        this.luminosidad = luminosidad;
        this.numBanhos = numBanhos;
        this.numAseos = numAseos;
        this.numHabitaciones = numHabitaciones;
        this.fachada = fachada;
        this.armariosEmpotrados = armariosEmpotrados;
        this.orientacion = orientacion;
        this.salonIndependiente = salonIndependiente;
        this.metrosSalon = metrosSalon;
        this.estado = estado;
        this.urbanizacion = urbanizacion;
        this.amueblado = amueblado;
        this.balcon = balcon;
        this.galeria = galeria;
        this.anhoConstruccion = anhoConstruccion;
        this.chimenea = chimenea;
        this.terraza = terraza;
        this.tipoTecho = tipoTecho;
        this.comedor = comedor;
        this.cocina = cocina;
        this.ascensor = ascensor;
        this.huardilla = huardilla;
        this.garaje = garaje;
        this.planos = planos;
        this.sotano = sotano;
        this.patio = patio;
        this.tipoSuelo = tipoSuelo;
        this.calefaccion = calefaccion;
        this.aguaCaliente = aguaCaliente;
        this.aireAcondicionado = aireAcondicionado;
        this.trastero = trastero;
        this.porteria = porteria;
        this.zonaServicio = zonaServicio;
        this.zonaDeportivo = zonaDeportivo;
        this.jardin = jardin;
        this.vigilancia = vigilancia;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public int getPrecio() {
        return precio;
    }

    public boolean isOperacion() { return operacion; }
    public String getParroquiaDireccion() {
        return parroquiaDireccion;
    }

    public String getMunicipioDireccion() {
        return municipioDireccion;
    }

    public String getEstadoDireccion() {
        return estadoDireccion;
    }

    public String getCiudadDireccion() {
        return ciudadDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public int getMetrosParcela() {
        return metrosParcela;
    }

    public int getMetrosConstruccion() {
        return metrosConstruccion;
    }

    public boolean isAmpliacion() {
        return ampliacion;
    }

    public int getMetrosAmpliacion() {
        return metrosAmpliacion;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }

    public boolean isLuminosidad() {
        return luminosidad;
    }

    public int getNumBanhos() {
        return numBanhos;
    }

    public int getNumAseos() {
        return numAseos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public boolean isFachada() {
        return fachada;
    }

    public boolean isArmariosEmpotrados() {
        return armariosEmpotrados;
    }

    public int getOrientacion() {
        return orientacion;
    }

    public boolean isSalonIndependiente() {
        return salonIndependiente;
    }

    public int getMetrosSalon() {
        return metrosSalon;
    }

    public boolean isEstado() {
        return estado;
    }

    public boolean isUrbanizacion() {
        return urbanizacion;
    }

    public boolean isAmueblado() {
        return amueblado;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public boolean isGaleria() {
        return galeria;
    }

    public int getAnhoConstruccion() {
        return anhoConstruccion;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public boolean isComedor() {
        return comedor;
    }

    public boolean isCocina() {
        return cocina;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public boolean isHuardilla() {
        return huardilla;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public boolean isPlanos() {
        return planos;
    }

    public boolean isSotano() {
        return sotano;
    }

    public boolean isPatio() {
        return patio;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public boolean isTrastero() {
        return trastero;
    }

    public boolean isPorteria() {
        return porteria;
    }

    public boolean isZonaServicio() {
        return zonaServicio;
    }

    public boolean isZonaDeportivo() {
        return zonaDeportivo;
    }

    public boolean isJardin() {
        return jardin;
    }

    public boolean isVigilancia() {
        return vigilancia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public void setOperacion(boolean operacion) { this.operacion = operacion; }

    public void setParroquiaDireccion(String parroquiaDireccion) {
        this.parroquiaDireccion = parroquiaDireccion;
    }

    public void setMunicipioDireccion(String municipioDireccion) {
        this.municipioDireccion = municipioDireccion;
    }

    public void setEstadoDireccion(String estadoDireccion) {
        this.estadoDireccion = estadoDireccion;
    }

    public void setCiudadDireccion(String ciudadDireccion) {
        this.ciudadDireccion = ciudadDireccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setMetrosParcela(int metrosParcela) {
        this.metrosParcela = metrosParcela;
    }

    public void setMetrosConstruccion(int metrosConstruccion) {
        this.metrosConstruccion = metrosConstruccion;
    }

    public void setAmpliacion(boolean ampliacion) {
        this.ampliacion = ampliacion;
    }

    public void setMetrosAmpliacion(int metrosAmpliacion) {
        this.metrosAmpliacion = metrosAmpliacion;
    }

    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public void setLuminosidad(boolean luminosidad) {
        this.luminosidad = luminosidad;
    }

    public void setNumBanhos(int numBanhos) {
        this.numBanhos = numBanhos;
    }

    public void setNumAseos(int numAseos) {
        this.numAseos = numAseos;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public void setFachada(boolean fachada) {
        this.fachada = fachada;
    }

    public void setArmariosEmpotrados(boolean armariosEmpotrados) {
        this.armariosEmpotrados = armariosEmpotrados;
    }

    public void setOrientacion(int orientacion) {
        this.orientacion = orientacion;
    }

    public void setMetrosSalon(int metrosSalon) {
        this.metrosSalon = metrosSalon;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public void setGaleria(boolean galeria) {
        this.galeria = galeria;
    }

    public void setAnhoConstruccion(int anhoConstruccion) {
        this.anhoConstruccion = anhoConstruccion;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public void setCocina(boolean cocina) {
        this.cocina = cocina;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public void setHuardilla(boolean huardilla) {
        this.huardilla = huardilla;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public void setPlanos(boolean planos) {
        this.planos = planos;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public void setPorteria(boolean porteria) {
        this.porteria = porteria;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public void setSalonIndependiente(boolean salonIndependiente) {
        this.salonIndependiente = salonIndependiente;
    }

    public void setUrbanizacion(boolean urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public void setSotano(boolean sotano) {
        this.sotano = sotano;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public void setTrastero(boolean trastero) {
        this.trastero = trastero;
    }

    public void setZonaServicio(boolean zonaServicio) {
        this.zonaServicio = zonaServicio;
    }

    public void setZonaDeportivo(boolean zonaDeportivo) {
        this.zonaDeportivo = zonaDeportivo;
    }

    public void setVigilancia(boolean vigilancia) {
        this.vigilancia = vigilancia;
    }
}
