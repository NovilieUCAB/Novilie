package BBDD.ModelosBD;

import java.util.ArrayList;

public class EmailMarketingEntity {
    private ArrayList<String> listaInteresados = new ArrayList<>();

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

    @Override
    public String toString() {
        return "EmailMarketingEntity{" +
                "listaInteresados=" + listaInteresados.toString() +
                '}';
    }
}
