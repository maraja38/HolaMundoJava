import java.util.Scanner;

public class Calificaciones {
    public static void main(String args[]){
    Scanner scanner= new Scanner(System.in);
        System.out.println("Proporciona un valor entre 0 y 10");
        int valor=Integer.parseInt(scanner.nextLine());
        if(valor>=9 && valor<=10){
            System.out.println("A");
        }
        else if(valor>=8&&valor<9){
            System.out.println("B");
        }
        else if(valor>=7&&valor<8){
            System.out.println("C");
        }    
        else if(valor>=6&&valor<7){
            System.out.println("D");
        }
        else if(valor>=0&&valor<6){
            System.out.println("F");
        }
        else{
            System.out.println("Valor Desconocido");
        }
    }
    
}
