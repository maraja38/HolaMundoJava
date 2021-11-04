
import java.util.Scanner;

public class EstacionAñoScanner {

    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Proporciona el numero del mes del año: ");
        int mes = Integer.parseInt(scanner.nextLine());
        var estacion = "Estacion desconocida";
        if (mes == 1 || mes == 2 || mes == 12) {
            estacion = "Invierno";
        } else if (mes == 3 || mes == 4 || mes == 5) {
            estacion = "Primavera";
        } else if (mes == 6 || mes == 7 || mes == 8) {
            estacion="Verano";
        }else if (mes==9||mes==10||mes==11){
            estacion="Otonio";
        }
            System.out.println("La Estacion es: " + estacion);
        }
}
