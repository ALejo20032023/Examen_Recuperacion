package SistemaTienda;

import java.util.List;

public interface CrudOperations<T> {
    void agregar(T objeto);

    T consultarPorId(int id);

    List<T> buscarPorGenero(String genero);

    void actualizar(int id, T objeto);

    void eliminar(int id);
}
