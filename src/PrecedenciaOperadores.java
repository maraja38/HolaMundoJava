
import java.util.Scanner;

public class PrecedenciaOperadores {

    public static void main(String args[]) {
        var x = 5;
        var y = 10;
        var z = ++x + y--;//Se evalua primero la operacion ++x y 
        //enseguida la operacion (++x + y), por ultimo y-- 
        //y se imprimen los valores de acuerdo a la orden en que se evaluaron
        System.out.println("El Valor de x es: " + x);
        System.out.println("El Valor de y es: " + y);
        System.out.println("El Valor de z es: " + z);
        var resultado = 4 + 5 * 6 / 3;//4+((5*6)/3) Se evaluan de izquierda a derecha pero la multiplicacion y la division son primero 
        System.out.println("resultado= " + resultado);
        resultado = (4 + 5) * 6 / 3;
        System.out.println("Resultado= "+ resultado);
        
    }
}
