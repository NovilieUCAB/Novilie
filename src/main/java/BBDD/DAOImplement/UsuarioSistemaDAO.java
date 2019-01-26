package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.ModelosBD.UsuarioSistemaEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.protobuf.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class UsuarioSistemaDAO implements IDAO<UsuarioSistemaEntity> {

    Firestore dbstore = Conection.database;
    private final String collection = "UsuariosSistema";

    @Override
    public boolean create(UsuarioSistemaEntity objeto) {
        boolean created = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreUsuario()).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<UsuarioSistemaEntity> read() throws ExecutionException, InterruptedException {
        List<UsuarioSistemaEntity>existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist){
            existingDocuments.add(document.toObject(UsuarioSistemaEntity.class));
        }
        return existingDocuments;
    }

    @Override
    public boolean update(UsuarioSistemaEntity objeto) {
        boolean updated = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreUsuario()).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(UsuarioSistemaEntity objeto) {
        boolean deleted = false;
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(objeto.getNombreUsuario()).delete();
        deleted = true;
        return deleted;
    }
}
