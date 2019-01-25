package BBDD;
import BBDD.Conection;
import com.google.cloud.storage.*;

import java.io.ByteArrayInputStream;
import java.io.InputStream;
import java.nio.file.Path;
import java.nio.file.Paths;

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

    public void downloadBlob(){
        String srcfile = "El beta";
        Storage store = StorageOptions.getDefaultInstance().getService();
        Blob blob = store.get(BlobId.of("novilie.appspot.com",srcfile));
        Path path = Paths.get("C:\\Users\\Adrian Luces\\Downloads\\elbeta.txt");
        blob.downloadTo(path);
    }


}
