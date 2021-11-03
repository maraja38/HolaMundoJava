import java.util.Scanner;

public class OperadoresCondicionales {
    public static void main(String args[]){
        var a=10;
        var valorMinimo=0;
        var valorMAximo=10;
        
        var resultado = a >= 0 && a <=10;
        if (resultado){
            System.out.println("Dentro de rango");
        }else{
            System.out.println("Fuera de rango");
        }
            var vacaciones = false;
            var diaDescanso = true;
            
         if (vacaciones||diaDescanso){
             System.out.println("El padre puede asistir al juego del hijo");
         }
         else{
             System.out.println("El padre esta ocupado");
         }
        
        
    }
    
}
