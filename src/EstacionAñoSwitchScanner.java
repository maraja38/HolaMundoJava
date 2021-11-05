import java.util.Scanner;

public class EstacionAñoSwitchScanner {
    public static void main(String args[]){
    Scanner scanner=new Scanner(System.in);
        System.out.println("Proporciona el mes del año:  ");
        int mes= Integer.parseInt(scanner.nextLine());
        var estacion="Estacion desconocida";
        switch(mes){
            case 1:     case 2:     case 12:
            estacion="Invierno"; 
            break;
            case 3:     case 4:     case 5:
            estacion="Primavera";
            break;
            case 6:     case 7:     case 8:
            estacion="Verano";
            break;
            case 9:     case 10:    case 11:
            estacion="Otoño";
            break;
            default:
        }
            System.out.println("La Estacion es: "+ estacion);
    }
    
}
