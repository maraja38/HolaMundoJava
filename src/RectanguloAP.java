
import java.util.Scanner;

public class RectanguloAP {

    public static void main(String args[]) {
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el alto: ");
        int alto = Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el ancho: ");
        int ancho = Integer.parseInt(consola.nextLine());
        int Area = alto * ancho;
        int Perimetro = (alto + ancho) * 2;
        System.out.println("El area del Rectagulo es: " + Area);
        System.out.println("El Perimetro del Rectagulo es: " + Perimetro);
    }
}
