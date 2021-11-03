import java.util.Scanner;

public class ConversionTiposPrimitivos {
    
    public static void main(String args[]){
        //Convertir un tipo strig a un tipo int
        var edad = Integer.parseInt("20");
        //var edad=20;
        System.out.println("Edad= "+ (edad+1));
       
        var valorPI =Double.parseDouble("3.1416");
        System.out.println("valorPI=" + valorPI);
        
        //Pedir un Valor
       var consola =new Scanner(System.in);
//        System.out.println("Proporciopna tu edad:");
//        edad = Integer.parseInt(consola.nextLine());
//        System.out.println("Edad= "+ edad);
        var edadTexto = String.valueOf(10);
        System.out.println("edadTexto= " + edadTexto);
        
        var caracter = "hola".charAt(1);//Nos regresa el caracter que esta en el indice (indice) 
        System.out.println("caracter= " + caracter);
        
        System.out.println("Proporciona un caracter:");
        caracter = consola.nextLine().charAt(0);
        System.out.println("caracter= "+ caracter);
        



    }
    
    
}
