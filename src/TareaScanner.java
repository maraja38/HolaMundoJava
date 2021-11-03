import java.util.Scanner;

public class TareaScanner {
    public static void main(String args[]){
        System.out.println("Proporciona el titulo: ");
        Scanner consola = new Scanner(System.in);
        var titulo= consola.nextLine();
        System.out.println("Proporciona el Autor: ");
        Scanner consola1 = new Scanner(System.in);
        var Autor= consola1.nextLine();
        System.out.println(titulo + " fue escrito por " + Autor);
    }
            
    
    
}
