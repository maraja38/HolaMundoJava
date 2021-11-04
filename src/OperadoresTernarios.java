
import java.util.Scanner;

public class OperadoresTernarios {

    public static void main(String args[]) {
        var resultado = (1 > 2) ? "Verdadero" : "Falso";
        System.out.println("Resultado= " + resultado);

        var numero = 9;
        resultado = (numero % 2 == 0) ? "Numero par " : "Numero impar";
        System.out.println("Resultado= " + resultado);

    }
}
