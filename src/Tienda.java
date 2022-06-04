import java.util.Scanner;

public class Tienda {

    Cliente cl= new Cliente();
    CatalogoPizza catalogo= new CatalogoPizza();
    public static void servicios(){
        Scanner teclado= new Scanner(System.in);
        System.out.println("Escoja entre las opciones: ");
        System.out.println("1. Pedir orden ");
        System.out.println("2. Mostrar orden");
        int opcion=0;
      do {
          opcion = teclado.nextByte();
        switch (opcion){
            case 1:
                Pedido.ordenarPedido();


                opcion=0;
                break;
            case 2:
            Pedido.mostrarPedido();
            break;
        }

    } while(opcion>4);





    }
    // Cliente.RegistrarCliente();
    // Pizza.MostrarCatalogo();
    // Cliente.MostrarRecibo();
}
