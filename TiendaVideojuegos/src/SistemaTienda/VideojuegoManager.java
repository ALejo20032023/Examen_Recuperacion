package SistemaTienda;

import java.util.ArrayList;
import java.util.List;

public class VideojuegoManager implements CrudOperations<Videojuego> {
    private List<Videojuego> videojuegos = new ArrayList<>();

    @Override
    public void agregar(Videojuego videojuego) {
        if (videojuego == null) {
            throw new IllegalArgumentException("Ingrese el producto correctamente");
        }
        for (Videojuego v : videojuegos) {
            if (v.getId() == videojuego.getId()) {
                throw new IllegalArgumentException("Este ID ya existe");
            }
        }
        videojuegos.add(videojuego);
    }

    @Override
    public Videojuego consultarPorId(int id) {
        return videojuegos.stream()
                .filter(v -> v.getId() == id)
                .findFirst()
                .orElse(null);
    }

    @Override
    public List<Videojuego> buscarPorGenero(String genero) {
        List<Videojuego> resultados = new ArrayList<>();
        for (Videojuego v : videojuegos) {
            if (v.getGenero().equalsIgnoreCase(genero)) {
                resultados.add(v);
            }
        }
        return resultados;
    }

    @Override
    public void actualizar(int id, Videojuego videojuegoActualizado) {
        Videojuego existente = consultarPorId(id);
        if (existente == null) {
            throw new IllegalArgumentException("El videojuego " + id + " no existe");
        }
        existente.setPrecio(videojuegoActualizado.getPrecio());
    }

    @Override
    public void eliminar(int id) {
        Videojuego videojuego = consultarPorId(id);
        if (videojuego == null) {
            throw new IllegalArgumentException("El videojuego " + id + " no existe");
        }
        videojuegos.remove(videojuego);
    }
}
