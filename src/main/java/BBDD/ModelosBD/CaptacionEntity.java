package BBDD.ModelosBD;

import BBDD.Fecha;

import java.util.HashMap;

public class CaptacionEntity {

    private String referenciaInmueble;
    private HashMap<String,Integer> cedulaAsesorComision = new HashMap<>();
    private HashMap<String,Boolean> criteriosAceptacion = new HashMap<>();
    private float comisionInmueble;
    private Fecha fechaRegistro;

    public CaptacionEntity(){}

    public CaptacionEntity(String referenciaInmueble,Fecha fecha, HashMap<String, Integer> cedulaAsesorComision, HashMap<String,
            Boolean> criteriosAceptacion, float comisionInmueble) {
        this.referenciaInmueble = referenciaInmueble;
        this.fechaRegistro=fecha;
        this.cedulaAsesorComision = cedulaAsesorComision;
        this.criteriosAceptacion = criteriosAceptacion;
        this.comisionInmueble = comisionInmueble;
    }

    public String getReferenciaInmueble() {
        return referenciaInmueble;
    }

    public void setReferenciaInmueble(String referenciaInmueble) {
        this.referenciaInmueble = referenciaInmueble;
    }

    public HashMap<String, Integer> getCedulaAsesorComision() {
        return cedulaAsesorComision;
    }

    public void setCedulaAsesorComision(HashMap<String, Integer> cedulaAsesorComision) {
        this.cedulaAsesorComision = cedulaAsesorComision;
    }

    public HashMap<String, Boolean> getCriteriosAceptacion() {
        return criteriosAceptacion;
    }

    public void setCriteriosAceptacion(HashMap<String, Boolean> criteriosAceptacion) {
        this.criteriosAceptacion = criteriosAceptacion;
    }

    public float getComisionInmueble() {
        return comisionInmueble;
    }

    public void setComisionInmueble(float comisionInmueble) {
        this.comisionInmueble = comisionInmueble;
    }
}
