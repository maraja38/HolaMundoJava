import java.util.Scanner;

public class NumeroTextoSwitch {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Dame un numero: ");
        int numero=Integer.parseInt(scanner.nextLine()); 
        var numeroTexto= "Valor Desconocido";
        switch(numero){
            case 1: 
                numeroTexto="Numero uno";
                break;
            case 2:
                numeroTexto="Numero dos";
                break;
            case 3:
                numeroTexto="Numero tres";
                break;
            case 4:
                numeroTexto="numero cuatro";
                break;
            default:
        }
        System.out.println("El numero en Texto es: " + numeroTexto);
    }
}
