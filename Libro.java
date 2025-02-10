public class Libro{
    //Atributos "encapsulados" de la clase Libro, solo podemos acceder a ellos usando métodos específicados por nosotros
    private String titulo;
    private String autor;
    private boolean disponible;

    // Constructor del objeto, en este caso un libro
    public Libro (String titulo, String autor){
        this.titulo = titulo;
        this.autor = autor;
        this.disponible = true;
    }


    //Método para acceder al atributo privado titulo
    public String getTitulo(){
        return titulo;
    }
    //Método para acceder al atributo privado: autor 
    public String getAutor(){
        return autor;
    }
    //Supongo que ya se entendió 
    public boolean isDisponible(){
        return disponible;
    }

    public void prestar(){
        if(disponible){
            disponible = false;
            System.out.println("Libro: " + titulo + " ha sido prestado");
        } else {
            System.out.println("Libro: " + titulo + " no está disponible para préstamo");
        }
    }

    public void devolver(){
        disponible = true;
    }
    //Método para mostrar toda la info de un libro 
    public String info(){
        return titulo + " | Autor: " + autor + " | Disponible: " + (disponible ? "Si" : "No");
    }
};

