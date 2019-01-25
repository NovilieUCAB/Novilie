package BBDD.ModelosBD;

import javafx.scene.image.Image;

import java.util.ArrayList;

public class InmuebleEntity {
    String numReferencia;
    int estadoOperacion;
    ArrayList<Image> fotos;
    String documentacion;
    String tipoPropiedad;
    int precio;
    String operacion;
    String parroquiaDireccion;
    String municipioDireccion;
    String estadoDireccion;
    String ciudadDireccion;
    String direccion;
    int metrosParcela;
    int metrosConstruccion;
    boolean ampliacion;
    int metrosAmpliacion;
    String disponibilidad;
    boolean luminosidad;
    int numBanhos;
    int numAseos;
    int numHabitaciones;
    String fachada;
    boolean armariosEmpotrados;
    String orientacion;
    boolean salonIndependiente;
    int metrosSalon;
    String estado;
    boolean urbanizacion;
    boolean amueblado;
    boolean balcon;
    boolean galeria;
    int anhoConstruccion;
    boolean chimenea;
    boolean terraza;
    String tipoTecho;
    boolean comedor;
    boolean cocina;
    boolean ascensor;
    boolean huardilla;
    boolean garaje;
    boolean planos;
    boolean sotano;
    boolean patio;
    String tipoSuelo;
    boolean calefaccion;
    boolean aguaCaliente;
    boolean aireAcondicionado;
    boolean trastero;
    boolean porteria;
    boolean zonaServicio;
    boolean zonaDeportivo;
    boolean jardin;
    boolean vigilancia;
    String cedulaPropietario;

    public InmuebleEntity() {
    }

    public InmuebleEntity(String numReferencia, int estadoOperacion, ArrayList<Image> fotos, String documentacion,
                          String tipoPropiedad, int precio, String operacion, String parroquiaDireccion,
                          String municipioDireccion, String estadoDireccion, String ciudadDireccion, String direccion,
                          int metrosParcela, int metrosConstruccion, boolean ampliacion, int metrosAmpliacion,
                          String disponibilidad, boolean luminosidad, int numBanhos, int numAseos, int numHabitaciones,
                          String fachada, boolean armariosEmpotrados, String orientacion, boolean salonIndependiente,
                          int metrosSalon, String estado, boolean urbanizacion, boolean amueblado, boolean balcon,
                          boolean galeria, int anhoConstruccion, boolean chimenea, boolean terraza, String tipoTecho,
                          boolean comedor, boolean cocina, boolean ascensor, boolean huardilla, boolean garaje,
                          boolean planos, boolean sotano, boolean patio, String tipoSuelo, boolean calefaccion,
                          boolean aguaCaliente, boolean aireAcondicionado, boolean trastero, boolean porteria,
                          boolean zonaServicio, boolean zonaDeportivo, boolean jardin, boolean vigilancia,
                          String cedulaPropietario) {
        this.numReferencia = numReferencia;
        this.estadoOperacion = estadoOperacion;
        this.fotos = fotos;
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
        this.cedulaPropietario = cedulaPropietario;
    }

    public String getNumReferencia() {
        return numReferencia;
    }

    public void setNumReferencia(String numReferencia) {
        this.numReferencia = numReferencia;
    }

    public int getEstadoOperacion() {
        return estadoOperacion;
    }

    public void setEstadoOperacion(int estadoOperacion) {
        this.estadoOperacion = estadoOperacion;
    }

    public ArrayList<Image> getFotos() {
        return fotos;
    }

    public void setFotos(ArrayList<Image> fotos) {
        this.fotos = fotos;
    }

    public String getDocumentacion() {
        return documentacion;
    }

    public void setDocumentacion(String documentacion) {
        this.documentacion = documentacion;
    }

    public String getTipoPropiedad() {
        return tipoPropiedad;
    }

    public void setTipoPropiedad(String tipoPropiedad) {
        this.tipoPropiedad = tipoPropiedad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public String getOperacion() {
        return operacion;
    }

    public void setOperacion(String operacion) {
        this.operacion = operacion;
    }

    public String getParroquiaDireccion() {
        return parroquiaDireccion;
    }

    public void setParroquiaDireccion(String parroquiaDireccion) {
        this.parroquiaDireccion = parroquiaDireccion;
    }

    public String getMunicipioDireccion() {
        return municipioDireccion;
    }

    public void setMunicipioDireccion(String municipioDireccion) {
        this.municipioDireccion = municipioDireccion;
    }

    public String getEstadoDireccion() {
        return estadoDireccion;
    }

    public void setEstadoDireccion(String estadoDireccion) {
        this.estadoDireccion = estadoDireccion;
    }

    public String getCiudadDireccion() {
        return ciudadDireccion;
    }

    public void setCiudadDireccion(String ciudadDireccion) {
        this.ciudadDireccion = ciudadDireccion;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public int getMetrosParcela() {
        return metrosParcela;
    }

    public void setMetrosParcela(int metrosParcela) {
        this.metrosParcela = metrosParcela;
    }

    public int getMetrosConstruccion() {
        return metrosConstruccion;
    }

    public void setMetrosConstruccion(int metrosConstruccion) {
        this.metrosConstruccion = metrosConstruccion;
    }

    public boolean isAmpliacion() {
        return ampliacion;
    }

    public void setAmpliacion(boolean ampliacion) {
        this.ampliacion = ampliacion;
    }

    public int getMetrosAmpliacion() {
        return metrosAmpliacion;
    }

    public void setMetrosAmpliacion(int metrosAmpliacion) {
        this.metrosAmpliacion = metrosAmpliacion;
    }

    public String getDisponibilidad() {
        return disponibilidad;
    }

    public void setDisponibilidad(String disponibilidad) {
        this.disponibilidad = disponibilidad;
    }

    public boolean isLuminosidad() {
        return luminosidad;
    }

    public void setLuminosidad(boolean luminosidad) {
        this.luminosidad = luminosidad;
    }

    public int getNumBanhos() {
        return numBanhos;
    }

    public void setNumBanhos(int numBanhos) {
        this.numBanhos = numBanhos;
    }

    public int getNumAseos() {
        return numAseos;
    }

    public void setNumAseos(int numAseos) {
        this.numAseos = numAseos;
    }

    public int getNumHabitaciones() {
        return numHabitaciones;
    }

    public void setNumHabitaciones(int numHabitaciones) {
        this.numHabitaciones = numHabitaciones;
    }

    public String getFachada() {
        return fachada;
    }

    public void setFachada(String fachada) {
        this.fachada = fachada;
    }

    public boolean isArmariosEmpotrados() {
        return armariosEmpotrados;
    }

    public void setArmariosEmpotrados(boolean armariosEmpotrados) {
        this.armariosEmpotrados = armariosEmpotrados;
    }

    public String getOrientacion() {
        return orientacion;
    }

    public void setOrientacion(String orientacion) {
        this.orientacion = orientacion;
    }

    public boolean isSalonIndependiente() {
        return salonIndependiente;
    }

    public void setSalonIndependiente(boolean salonIndependiente) {
        this.salonIndependiente = salonIndependiente;
    }

    public int getMetrosSalon() {
        return metrosSalon;
    }

    public void setMetrosSalon(int metrosSalon) {
        this.metrosSalon = metrosSalon;
    }

    public String getEstado() {
        return estado;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    public boolean isUrbanizacion() {
        return urbanizacion;
    }

    public void setUrbanizacion(boolean urbanizacion) {
        this.urbanizacion = urbanizacion;
    }

    public boolean isAmueblado() {
        return amueblado;
    }

    public void setAmueblado(boolean amueblado) {
        this.amueblado = amueblado;
    }

    public boolean isBalcon() {
        return balcon;
    }

    public void setBalcon(boolean balcon) {
        this.balcon = balcon;
    }

    public boolean isGaleria() {
        return galeria;
    }

    public void setGaleria(boolean galeria) {
        this.galeria = galeria;
    }

    public int getAnhoConstruccion() {
        return anhoConstruccion;
    }

    public void setAnhoConstruccion(int anhoConstruccion) {
        this.anhoConstruccion = anhoConstruccion;
    }

    public boolean isChimenea() {
        return chimenea;
    }

    public void setChimenea(boolean chimenea) {
        this.chimenea = chimenea;
    }

    public boolean isTerraza() {
        return terraza;
    }

    public void setTerraza(boolean terraza) {
        this.terraza = terraza;
    }

    public String getTipoTecho() {
        return tipoTecho;
    }

    public void setTipoTecho(String tipoTecho) {
        this.tipoTecho = tipoTecho;
    }

    public boolean isComedor() {
        return comedor;
    }

    public void setComedor(boolean comedor) {
        this.comedor = comedor;
    }

    public boolean isCocina() {
        return cocina;
    }

    public void setCocina(boolean cocina) {
        this.cocina = cocina;
    }

    public boolean isAscensor() {
        return ascensor;
    }

    public void setAscensor(boolean ascensor) {
        this.ascensor = ascensor;
    }

    public boolean isHuardilla() {
        return huardilla;
    }

    public void setHuardilla(boolean huardilla) {
        this.huardilla = huardilla;
    }

    public boolean isGaraje() {
        return garaje;
    }

    public void setGaraje(boolean garaje) {
        this.garaje = garaje;
    }

    public boolean isPlanos() {
        return planos;
    }

    public void setPlanos(boolean planos) {
        this.planos = planos;
    }

    public boolean isSotano() {
        return sotano;
    }

    public void setSotano(boolean sotano) {
        this.sotano = sotano;
    }

    public boolean isPatio() {
        return patio;
    }

    public void setPatio(boolean patio) {
        this.patio = patio;
    }

    public String getTipoSuelo() {
        return tipoSuelo;
    }

    public void setTipoSuelo(String tipoSuelo) {
        this.tipoSuelo = tipoSuelo;
    }

    public boolean isCalefaccion() {
        return calefaccion;
    }

    public void setCalefaccion(boolean calefaccion) {
        this.calefaccion = calefaccion;
    }

    public boolean isAguaCaliente() {
        return aguaCaliente;
    }

    public void setAguaCaliente(boolean aguaCaliente) {
        this.aguaCaliente = aguaCaliente;
    }

    public boolean isAireAcondicionado() {
        return aireAcondicionado;
    }

    public void setAireAcondicionado(boolean aireAcondicionado) {
        this.aireAcondicionado = aireAcondicionado;
    }

    public boolean isTrastero() {
        return trastero;
    }

    public void setTrastero(boolean trastero) {
        this.trastero = trastero;
    }

    public boolean isPorteria() {
        return porteria;
    }

    public void setPorteria(boolean porteria) {
        this.porteria = porteria;
    }

    public boolean isZonaServicio() {
        return zonaServicio;
    }

    public void setZonaServicio(boolean zonaServicio) {
        this.zonaServicio = zonaServicio;
    }

    public boolean isZonaDeportivo() {
        return zonaDeportivo;
    }

    public void setZonaDeportivo(boolean zonaDeportivo) {
        this.zonaDeportivo = zonaDeportivo;
    }

    public boolean isJardin() {
        return jardin;
    }

    public void setJardin(boolean jardin) {
        this.jardin = jardin;
    }

    public boolean isVigilancia() {
        return vigilancia;
    }

    public void setVigilancia(boolean vigilancia) {
        this.vigilancia = vigilancia;
    }

    public String getCedulaPropietario() {
        return cedulaPropietario;
    }

    public void setCedulaPropietario(String cedulaPropietario) {
        this.cedulaPropietario = cedulaPropietario;
    }
}
