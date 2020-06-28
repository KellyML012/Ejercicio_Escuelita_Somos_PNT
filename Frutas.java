public class Frutas extends Productos{

    private String unidad_venta;

    public Frutas(String nombre, int precio, String unidad_venta){
        super(nombre, precio);
        this.unidad_venta = unidad_venta;
    }

    public String toString(){
        return "Nombre: " + getNombre() + " /// Precio: $" + getPrecio() + " /// Unidad de venta: " + unidad_venta;
    }
}