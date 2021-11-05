import java.util.Scanner;

public class BreakyContinue {
    public static void main(String args[]){
    
        for(var contador=0; contador<3; contador++){
        if(contador%2!=0){
        continue;//Ir a la siguiente iteracion
        }
            System.out.println("Copntador= "+ contador);
        }
//        for(var contador=0; contador<3; contador++){
//            if (contador%2!=0){
//                    System.out.println("Contador= "+ contador);
//                    break;
//            }
//        }
    }
    
}
