import java.util.Scanner;

public class MayorDosNumeros {
    public static void main(String args[]){
        var consola = new Scanner(System.in);
        System.out.println("Proporciona el numero 1: ");
        int numero1=Integer.parseInt(consola.nextLine());
        System.out.println("Proporciona el numero 2: ");
        int numero2=Integer.parseInt(consola.nextLine());
        if (numero1>numero2){
            System.out.println(numero1 + " es mayor que " + numero2);
        }
        else{
            System.out.println(numero2 + " es mayor que " + numero1);
        }
        
    }
    
}
