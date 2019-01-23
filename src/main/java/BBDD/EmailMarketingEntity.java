package BBDD;

import java.util.ArrayList;

public class EmailMarketingEntity {
    ArrayList<ClienteEntity> listaInteresados = new ArrayList<ClienteEntity>();

    public ArrayList<ClienteEntity> getListaInteresados() {
        return listaInteresados;
    }

    public void addInteresado(ClienteEntity interesado) {
        this.listaInteresados.add(interesado);
    }

    public void removeInteresado(ClienteEntity interesado) {
        this.listaInteresados.remove(interesado);
    }

}
