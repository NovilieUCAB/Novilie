package BBDD.ModelosBD;

import java.util.HashMap;

public class CaptacionEntity {

    private String referenciaInmueble;
    private HashMap<String,Integer> cedulaAsesorComision = new HashMap<>();
    private HashMap<String,Boolean> criteriosAceptacion = new HashMap<>();
    private int comisionInmueble;

    public CaptacionEntity(){}

    public CaptacionEntity(String referenciaInmueble, HashMap<String, Integer> cedulaAsesorComision, HashMap<String, Boolean> criteriosAceptacion, int comisionInmueble) {
        this.referenciaInmueble = referenciaInmueble;
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

    public int getComisionInmueble() {
        return comisionInmueble;
    }

    public void setComisionInmueble(int comisionInmueble) {
        this.comisionInmueble = comisionInmueble;
    }
}
