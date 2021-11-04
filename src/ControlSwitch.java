
import java.util.Scanner;

public class ControlSwitch {

    public static void main(String args[]) {
        var numero =4 ;
        var numeroTexto = "Valor desconocido";
        switch (numero) {
            case 1:
                numeroTexto = "Numero uno";
                break;//El break es para que si se cumple la condicion se realiza la accion y se salta todas las demas opciones del switch sino se pusiera el break seguiria ejecutando las demas condiciones
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
