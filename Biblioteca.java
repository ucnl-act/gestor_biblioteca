import java.util.ArrayList;
import java.util.List;
//Clase Biblioteca: Representa una lista o array donde almacenamos instancias de la clase Libro.
class Biblioteca {
    //"Encapsulación" del atributo List ya que al declararlo privado solo podemos acceder a su contenido utilizando métodos específicos.
    private List<Libro> libros;

    //Constructor de la clase.
    public Biblioteca(){
        //Por default cada vez que instanciamos esta clase, ya viene con un array para almacenar libros.
        libros = new ArrayList<>();
    }
    //Con este método agregamos un objeto "Libro".
    public void agregarLibro(Libro libro){
        libros.add(libro);
        //Utilizamos el método getTitulo de la clase Libro.
        System.out.println("Libro agregado: " + libro.getTitulo());
    }
    
    //Con este método iteramos sobre la lista de libros y ejecutamos la función info sobre cada uno de estos.
    public void mostrarLibros(){
        if(libros.isEmpty()){
            System.out.println("No hay libros en la biblioteca");
        }else {
            System.out.println("Libros en la biblioteca: ");
            for (Libro libro: libros){
                System.out.println(libro.info());
            }
        }
    }
    
    //Con este método cambiamos el atributo "disponible" a false.
    public void prestarLibro(String titulo){
        for(Libro libro: libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                libro.prestar();
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
        
    }
    //Con este método cambiamos el atributo "disponible" a true.

    public void devolverLibro(String titulo){
        for(Libro libro: libros){
            if(libro.getTitulo().equalsIgnoreCase(titulo)){
                libro.devolver();
                return;
            }
        }
        System.out.println("Libro no encontrado: " + titulo);
    }

}
