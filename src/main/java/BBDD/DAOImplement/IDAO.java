package BBDD.DAOImplement;

import java.util.List;
import java.util.concurrent.ExecutionException;

public interface IDAO<T> {
    boolean create(T objeto);
    List<T> read() throws ExecutionException, InterruptedException;
    boolean update(T objeto);
    boolean delete(T objeto);
}
