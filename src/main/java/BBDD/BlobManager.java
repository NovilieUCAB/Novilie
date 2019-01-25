package BBDD;
import BBDD.Conection;
import com.google.cloud.storage.Blob;
import com.google.cloud.storage.Bucket;

import java.io.ByteArrayInputStream;
import java.io.InputStream;

import static java.nio.charset.StandardCharsets.UTF_8;

public class BlobManager {
    private final Bucket storeBucket = Conection.CloudStorage;

    public BlobManager (){
        //Default Constructor
    }

    public void uploadBlob(){

        InputStream content = new ByteArrayInputStream("Pene".getBytes(UTF_8));
        Blob blob;
        System.out.println(1);
        blob = storeBucket.create("El beta",content,"text/plain");
        System.out.println(2);
    }


}
