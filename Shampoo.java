public class Shampoo extends Productos{

    private int contenido;

    public Shampoo (String nombre, int precio, int contenido){
        super(nombre, precio);
        this.contenido = contenido;
    }

    public String toString(){
        return "Nombre: " + getNombre() + " /// Contenido: " + contenido + "ml /// Precio: " + getPrecio();
    }
}
