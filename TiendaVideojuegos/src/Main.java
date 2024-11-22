import SistemaTienda.Videojuego;
import SistemaTienda.VideojuegoManager;

public class Main {
    public static void main(String[] args) {
        VideojuegoManager manager = new VideojuegoManager();

        manager.agregar(new Videojuego(1, "FIFA", 349.00, "Deporte", "Playstation"));
        manager.agregar(new Videojuego(2, "HALO Infinite", 49.99, "Acción", "PC"));

        System.out.println("Lista de juegos:");
        for (Videojuego v : manager.buscarPorGenero("")) {
            System.out.println(v);
        }

        System.out.println("\nPrecio Actualizado ");
        manager.actualizar(1, new Videojuego(1, " FIFA", 299.99, " Deporte", " Playstation"));

        System.out.println("\nConsulta por ID (1):");
        System.out.println(manager.consultarPorId(1));

        System.out.println("\nEliminando videojuego con ID 2...");
        manager.eliminar(2);

        System.out.println("\nLista actualizada de videojuegos:");
        for (Videojuego v : manager.buscarPorGenero("")) {
            System.out.println(v);
        }
    }
}