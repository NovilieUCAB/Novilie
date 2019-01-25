package BBDD.ModelosBD;

import BBDD.ModelosBD.ClienteEntity;

import java.util.ArrayList;

public class EmailMarketingEntity {
    private ArrayList<String> listaInteresados = new ArrayList<>();
    private String referenciaInmueble;

    public ArrayList<String> getListaInteresados() {
        return listaInteresados;
    }

    public void addInteresado(String interesado) {
        this.listaInteresados.add(interesado);
    }

    public void removeInteresado(String interesado) {
        this.listaInteresados.remove(interesado);
    }

    public EmailMarketingEntity() {
    }

    public EmailMarketingEntity(ArrayList<String> listaInteresados, String referenciaInmueble) {
        this.listaInteresados = listaInteresados;
        this.referenciaInmueble = referenciaInmueble;
    }

    public void setListaInteresados(ArrayList<String> listaInteresados) {
        this.listaInteresados = listaInteresados;
    }

    public String getReferenciaInmueble() {
        return referenciaInmueble;
    }

    public void setReferenciaInmueble(String referenciaInmueble) {
        this.referenciaInmueble = referenciaInmueble;
    }

    @Override
    public String toString() {
        return "EmailMarketingEntity{" +
                "listaInteresados=" + listaInteresados.toString() +
                '}';
    }
}
