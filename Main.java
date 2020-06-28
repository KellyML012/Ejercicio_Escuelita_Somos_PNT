import java.util.*;

public class Main{

    public static void main(String[] args){

        ArrayList<Productos> lista = new ArrayList<Productos>();
        lista.ensureCapacity(4);

        lista.add(new Bebidas("Coca-cola Zero", 20, 1.5));
        lista.add(new Bebidas("Coca-cola", 18, 1.5));
        lista.add(new Shampoo("Shampoo Sedal", 19, 500));
        lista.add(new Frutas("Frutillas", 64, "kilo"));

        lista.trimToSize();

        for(Productos p :  lista){
            System.out.println(p.toString());
        };
        
        System.out.println("=============================");
        
        System.out.println("Producto más caro: " + Collections.max(lista).getNombre());
        System.out.println("Producto más barato: " + Collections.min(lista).getNombre());
    }

}