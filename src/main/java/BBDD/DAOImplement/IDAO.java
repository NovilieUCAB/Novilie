package BBDD.DAOImplement;

import java.util.List;

public interface IDAO<T> {
    boolean create(T objeto);
    List<T> read();
    boolean update(T objeto);
    boolean delete(T objeto);
}
