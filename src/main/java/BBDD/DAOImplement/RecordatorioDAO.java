package BBDD.DAOImplement;

import BBDD.Conection;
import BBDD.Fecha;
import BBDD.ModelosBD.RecordatorioEntity;
import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.Firestore;
import com.google.cloud.firestore.QueryDocumentSnapshot;
import com.google.cloud.firestore.QuerySnapshot;
import com.google.cloud.firestore.WriteResult;
import com.google.protobuf.Api;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;

public class RecordatorioDAO implements IDAO<RecordatorioEntity> {

    Firestore dbstore = Conection.database;
    private final String collection = "Recordatorios";

    @Override
    public boolean create(RecordatorioEntity objeto) {
        boolean created = false;
        Fecha date = objeto.getFechaCreacion();
        int dia = date.getDia();
        int mes = date.getMes();
        int anho = date.getAnio();
        String doctitle = objeto.getCedulaDestinatario()+dia+mes+anho+objeto.getHoraCreacion();

        ApiFuture<WriteResult> future = dbstore.collection(collection).document(doctitle).set(objeto);
        created = true;
        return created;
    }

    @Override
    public List<RecordatorioEntity> read() throws ExecutionException, InterruptedException {
        List<RecordatorioEntity> existingDocuments = new ArrayList<>();
        ApiFuture<QuerySnapshot> future = dbstore.collection(collection).get();
        List<QueryDocumentSnapshot> documentlist = future.get().getDocuments();

        for(QueryDocumentSnapshot document : documentlist)
            existingDocuments.add(document.toObject(RecordatorioEntity.class));

        return existingDocuments;
    }

    @Override
    public boolean update(RecordatorioEntity objeto) {
        boolean updated = false;
        Fecha date = objeto.getFechaCreacion();
        String doctitle = objeto.getCedulaDestinatario()+date.getDia()+date.getMes()+date.getAnio()+objeto.getHoraCreacion();

        ApiFuture<WriteResult> future = dbstore.collection(collection).document(doctitle).set(objeto);
        updated = true;
        return updated;
    }

    @Override
    public boolean delete(RecordatorioEntity objeto) {
        boolean deleted = false;
        Fecha date  =objeto.getFechaCreacion();
        String doctitle = objeto.getCedulaDestinatario()+date.getDia()+date.getMes()+date.getAnio()+objeto.getHoraCreacion();
        ApiFuture<WriteResult> future = dbstore.collection(collection).document(doctitle).delete();
        deleted = true;
        return deleted;
    }
}
