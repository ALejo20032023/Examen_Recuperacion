package SistemaTienda;

    public class Videojuego extends Producto {
        private String genero;
        private String plataforma;

        public Videojuego(int id, String nombre, double precio, String genero, String plataforma) {
            super(id, nombre, precio);
            this.genero = genero;
            this.plataforma = plataforma;
        }

        public String getGenero() {
            return genero;
        }

        public String getPlataforma() {
            return plataforma;
        }

        @Override
        public String toString() {
            return super.toString() + ", Genero=" + genero + ", Plataforma=" + plataforma;
        }
}
