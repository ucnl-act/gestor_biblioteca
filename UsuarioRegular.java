public class UsuarioRegular extends Usuario {
    //Constructor
    public UsuarioRegular(String nombre){
        super(nombre);
    }

    //Método para usuario regulares
    public void verificarLimitePrestamos(){
        System.out.println(mostrarNombre() + " es usuario regular. Límites de préstamos: 1 libro.");
    };
};

