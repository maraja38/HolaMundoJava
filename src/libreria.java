
import java.util.Scanner;

public class libreria {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el nombre: ");
        var nombre = consola.nextLine();
        System.out.println("Proporciona el id: ");
        var id = consola.nextLine();
        System.out.println("Proporciona el precio: " );
        var precio = consola.nextLine();
        System.out.println("Proporciona el envio gratuito: " );
        var envioGratuito = consola.nextLine();
        System.out.println("\n");
        System.out.println((nombre) + " #" + id );
        System.out.println("Precio: $" + precio);
        System.out.println("Envio Gratuito: " + envioGratuito);
    }

}
