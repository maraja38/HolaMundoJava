
import java.util.Scanner;

public class TiposPrimitivosBooleanos {

    public static void main(String args[]) {
        boolean varBoolean = true;
        System.out.println("El Valor de Variable booleana es: " + varBoolean);
        
        //A continuacion se utiliza el ciclo IF
        if (varBoolean){
            System.out.println("la bandera es verdadera");
        }
        else
            System.out.println("La bandera es falsa");
        var edad = 17;
        var esAdulto = edad>=18; //Esto arroja un true o un false
        if (esAdulto){
            System.out.println("Eres Mayor de edad");
        }
        else 
            System.out.println("Eres menor de edad");
        //otra forma
        if (edad>=18){
            System.out.println("Eres Mayor de edad");
        }
        else 
            System.out.println("Eres menor de edad");
                
    }
}