public class Main {
    public static void main(String[] args) {
        //Creamos un objeto biblioteca
        Biblioteca biblioteca = new Biblioteca();

        //Creamos algunos objetos libro
        Libro libro1 = new Libro("Tokyo Blues","Haruki Murakami");
        Libro libro2 = new Libro("El programador pragmático", "Andrew Hunt, David Thomas");
        Libro libro3 = new Libro("El viejo y el mar", "Ernest Hemingway");

        //Agregamos esos libros a la biblioteca
        biblioteca.agregarLibro(libro1);
        biblioteca.agregarLibro(libro2);
        biblioteca.agregarLibro(libro3);

        //Mostrar todos los libros de la biblioteca
        biblioteca.mostrarLibros();

        //Prestar un libro
        biblioteca.prestarLibro("Tokyo Blues");
        
        //Mostrar todos los libros de la biblioteca después de prestar
        biblioteca.mostrarLibros();
    }
}

