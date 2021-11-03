
import java.util.Scanner;

public class OperadoresAritmeticos {

    public static void main(String args[]) {
        int a = 3, b = 2;
        var resultado = a + b;
        System.out.println("Resultado de suma es = " + resultado);

        resultado = a - b;
        System.out.println("Resultado de la resta es = " + resultado);

        resultado = a * b;
        System.out.println("Resultado de la multiplicacion es = " + resultado);

        resultado = a / b;
        System.out.println("Resultado de la division es = " + resultado);

        var resultado2 = 3D / b;
        System.out.println("resultado division= " + resultado2);

        resultado = a % b;
        System.out.println("Resultado modulo= " + resultado);

        if (b % 2 == 0) {
            System.out.println("es numero par");
        } else {
            System.out.println("es numero impar");
        }

    }
}
