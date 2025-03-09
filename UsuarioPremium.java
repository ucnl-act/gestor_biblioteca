public class UsuarioPremium extends Usuario {
    //Constructor
    public UsuarioPremium(String nombre){
        super(nombre);
    }

    //Método exlusivo para usuarios premium
    public void solicitarPrestamoExtendido(Biblioteca biblioteca, String titulo, int dias){
        System.out.println("El usuario: " + mostrarNombre() + "está solicitando un préstamo extendido del libro " + titulo + "por " + dias + "días.");
        Libro libroPrestado = biblioteca.prestarLibro(this, titulo);
        if(libroPrestado != null) {
            prestamosActivos.add(libroPrestado);
        }
    }
};
