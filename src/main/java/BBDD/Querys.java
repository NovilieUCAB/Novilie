package BBDD;

import com.google.api.core.ApiFuture;
import com.google.cloud.firestore.CollectionReference;
import com.google.cloud.firestore.DocumentSnapshot;
import com.google.cloud.firestore.Query;
import com.google.cloud.firestore.QuerySnapshot;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.ExecutionException;


public class Querys<T> {


    Query whereEqualsTo(String collection, String attribute, T value){
        CollectionReference collections = Conection.database.collection(collection);
        // Create a query against the collection.
        return  collections.whereEqualTo(attribute, value);
    }

    Query whereLessThanTo(String collection, String attribute, T value){
        CollectionReference collections = Conection.database.collection(collection);
        // Create a query against the collection.
        return collections.whereLessThan(attribute, value);
    }

    Query whereGreaterThanTo(String collection, String attribute, T value){
        CollectionReference collections = Conection.database.collection(collection);
        // Create a query against the collection.
        return collections.whereGreaterThan(attribute, value);
    }

    Query whereGreaterThanOrEqualTo(String collection, String attribute, T value){
        CollectionReference collections = Conection.database.collection(collection);
        // Create a query against the collection.
        return collections.whereGreaterThanOrEqualTo(attribute, value);
    }

    Query whereLessThanOrEqualTo(String collection, String attribute, T value){
        CollectionReference collections = Conection.database.collection(collection);
        // Create a query against the collection.
        return collections.whereLessThanOrEqualTo(attribute, value);
    }

    ApiFuture<QuerySnapshot> orderBy(Query list, String order, boolean ascendent){
        if(!ascendent){
            Query queryOrder = list.orderBy(order, Query.Direction.DESCENDING);
            return queryOrder.get();
        }
        Query queryOrder = list.orderBy(order);
        return queryOrder.get();
    }

    List<DocumentSnapshot> getElements(ApiFuture<QuerySnapshot> querys){
        List<DocumentSnapshot> elements = new ArrayList<>();

        try{
            for(DocumentSnapshot document : querys.get().getDocuments()){
                elements.add(document);
            }
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }

        return elements;
    }
}
