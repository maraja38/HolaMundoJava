import java.util.Scanner;

public class OperadoresAsignacion {
    public static void main(String args[]){
    int a=3, b=2;
    int c=a + 5- b;
        System.out.println("c= " + c);
        
        a+=1; //esto es igual -> a=a+1
        System.out.println("a= "+ a);
        
        a+=3; //esto es igual -> a=a+3
        System.out.println("a= "+ a);
        
        a-=2; //esto es igual -> a=a-2
        System.out.println("a= "+ a);
        
        a*=3; //esto es igual -> a=a*3
        System.out.println("a= "+ a);
        
        a/=2; //Esto es igual -> a=a/2
        System.out.println("a= "+ a);
        
        a%=3; //Esto es igual -> a=a mod 3
        System.out.println("a= "+ a);
    }
            
}
