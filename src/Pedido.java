import java.util.LinkedList;
import java.util.List;
import java.util.Scanner;

public class Pedido {


   public static List<Pizza> lista = new LinkedList<Pizza>();

   private int cantidad;




        public static void ordenarPedido(){
            Cliente cliente=new Cliente();
            cliente.RegistrarCliente();
            CatalogoPizza.Catalogo();
            System.out.println("Porfavor seleccione la especialidad: ");
        int opc;
        int cantidad=0;
        Scanner entrada = new Scanner(System.in);
        opc = entrada.nextByte();
    do{
        switch (opc) {
            case 1:
                System.out.println("Escogio peperonni");
                System.out.printf("Seleccione la cantidad: ");
                cantidad= entrada.nextByte();
                String nombre = cliente.getNombre();
                Pizza p1 = new Pizza("Peperonni",133,nombre,cantidad);
                cantidad=p1.getCantidad();
                nombre=p1.getNombre();
                lista.add(p1);
                opc= 3;
                Tienda.servicios();
                break;
            case 2:
                System.out.println("Escogio Champiñon ");
                System.out.printf("Seleccione la cantidad: ");
                cantidad= entrada.nextByte();
                nombre = cliente.getNombre();
                Pizza p2 = new Pizza("Champiñon",145,nombre,cantidad);
                cantidad=p2.getCantidad();
                nombre=p2.getNombre();
                lista.add(p2);
                opc= 3;
                Tienda.servicios();
                break;

        }
    } while (opc >3 );

}

 public static void  mostrarPedido(){

     for (Pizza p:lista) {
         System.out.println("Usted Ordeno: ");
         System.out.println("Precio: $"+p.getPrecio());
         System.out.println("Especialidad: "+p.getTipo());
         System.out.println("Cantidad: " + p.getCantidad());
         System.out.println("Al nombre de: " + p.getNombre());
     }


 }

        }