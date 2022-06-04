import java.util.Scanner;
public class Cliente {
    String nombre;

    public void RegistrarCliente(){


        Scanner entrada = new Scanner(System.in);
        System.out.println("Inserte nombre:");
        nombre= entrada.next();

    }
public void MostrarCliente(){
    System.out.println("Pedido a nombre de: "+ nombre);
}
    public String getNombre() {
        return nombre;
    }


    }




