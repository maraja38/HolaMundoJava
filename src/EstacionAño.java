
import java.util.Scanner;

public class EstacionAño {

    public static void main(String args[]) {
        var mes = 12;
        var estacion = "Estacion desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion = "Verano";
        } else if (mes == 9 || mes == 10 || mes == 11) {
            estacion = "Otoño";
        }
        System.out.println("Estacion es: " + estacion);
    }
}
