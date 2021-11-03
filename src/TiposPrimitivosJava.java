
import java.util.Scanner;

public class TiposPrimitivosJava {

    public static void main(String args[]) {
        /*
        Tipos primitivos enteros:byte, short, int, long
         */
        byte numerobyte = (byte) (129);
        System.out.println("El Valor del numeroByte es: " + numerobyte);
        System.out.println("El Valor minimo de byte es: " + Byte.MIN_VALUE);
        System.out.println("El Valor maximo de byte es: " + Byte.MAX_VALUE);
        short numeroshort = (short) 32768;
        System.out.println("El valor del numeroShort es: " + numeroshort);
        System.out.println("El Valor minimo de short es: " + Short.MIN_VALUE);
        System.out.println("El Valor maximo de short es: " + Short.MAX_VALUE);
        int numeroint = (int) 2147483648L;
        System.out.println("El Valor del numeroInt es: " + numeroint);
        System.out.println("El Valor minimo de Int es: " + Integer.MIN_VALUE);
        System.out.println("El Valor maximo de int es: " + Integer.MAX_VALUE);
        long numerolong = 9223372036854775807L;
        System.out.println("El Valor del numerolong es: " + numerolong);
        System.out.println("El Valor minimo de long es: " + Long.MIN_VALUE);
        System.out.println("El Valor maximo de long es: " + Long.MAX_VALUE);
        
    }
}
