public class Pizza {
private String tipo;
private int precio;
private int cantidad;
String nombre;

    public  Pizza(String tipo, int precio, String nombre,int cantidad){
        super();
this.tipo= tipo;
this.precio= precio;
this.nombre=nombre;
this.cantidad=cantidad;

        }
    public int getCantidad() {
        return cantidad;
    }
    public int getPrecio() {
        return precio;
    }



    public String getTipo() {
        return tipo;
    }


    public String getNombre() {
        return nombre;
    }
}

