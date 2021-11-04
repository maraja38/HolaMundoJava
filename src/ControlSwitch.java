
import java.util.Scanner;

public class ControlSwitch {

    public static void main(String args[]) {
        var numero =4 ;
        var numeroTexto = "Valor desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;
            case 2:
                numeroTexto = "Numero dos";
                break;
            case 3:
                numeroTexto = "Numero tres";
                break;
            case 4:
                numeroTexto = "Numero cuatro";
                break;
            default:
        }
        System.out.println("NumeroTexto= " + numeroTexto);
    }
}
