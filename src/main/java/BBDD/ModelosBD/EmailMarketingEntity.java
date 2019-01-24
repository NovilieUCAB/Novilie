package BBDD.ModelosBD;

import java.util.ArrayList;

public class EmailMarketingEntity {
    private ArrayList<ClienteEntity> listaInteresados = new ArrayList<>();

    public ArrayList<ClienteEntity> getListaInteresados() {
        return listaInteresados;
    }

    public void addInteresado(ClienteEntity interesado) {
        this.listaInteresados.add(interesado);
    }

    public void removeInteresado(ClienteEntity interesado) {
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
