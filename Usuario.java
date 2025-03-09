import java.util.ArrayList;
import java.util.List;

//Definimos una clase Usuario de la que derivaran dos subclases

public class Usuario{
    //Atributos encapsulados/protegidos de cada usuario
    private String nombre;
    protected List<Libro> prestamosActivos;

    //Cada que se cree un nuevo usuario, se debe definir:
    public Usuario(String nombre){
        this.nombre = nombre; 
        prestamosActivos = new ArrayList<>();
    }

    //Métodos del usuario
    public String mostrarNombre(){
        return nombre;
    }

    public void mostrarPrestamos(){
        if(prestamosActivos.isEmpty()){
            System.out.println("El usuario " + mostrarNombre() + " no tiene préstamos activos.");
        }else {
            System.out.println("Prestamos activos de " + mostrarNombre() +":");
            for(Libro libro: prestamosActivos){
                System.out.println(libro.getTitulo() + " | " + libro.getAutor());
            }
        }
    };
    //Método para solicitar préstamo a la biblioteca solicitdada
    public void solicitarPrestamo(Biblioteca biblioteca, String titulo){
        System.out.println(nombre + " solicita el libro " + titulo);
        Libro libroPrestado = biblioteca.prestarLibro(this, titulo);
        if(libroPrestado != null){
            prestamosActivos.add(libroPrestado);
        }
    }

    //Método para devolver libro a la biblioteca solicitada
    public void devolverLibro(Biblioteca biblioteca, String titulo){
        if(prestamosActivos.isEmpty()){
            System.out.println("No hay préstamos activos");
            return;
        }

        for(Libro libro : new ArrayList<>(prestamosActivos)){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                prestamosActivos.remove(libro);
                biblioteca.devolverLibro(this, titulo);
                return;
            }
        }
        System.out.println("Libro: " + titulo + " no está en los préstamos activos del usuario");
    }
};
