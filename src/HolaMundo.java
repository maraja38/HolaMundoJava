//Mi clase en Java
public class HolaMundo {
    public static void main(String args[])
    {   
        System.out.println("Hola Mundo desde Java");    
        //Definimos la Variable
        int miVariableEntera=10;
        System.out.println(miVariableEntera);
        //Modificamos el Valor de la variable
        miVariableEntera=5;
        System.out.println(miVariableEntera);       
        
        String miVariableCadena="Saludos";
        System.out.println(miVariableCadena);
        miVariableCadena="adiós";
        System.out.println(miVariableCadena);
        
        //Var - Inferencia de tipos en Java
        var miVariableEntera2=15;
        System.out.println(miVariableEntera2);
        
        var miVariableCadena2="Buenos dias";
        System.out.println("miVariableCadena2 es = " + miVariableCadena2);
        
        //Valores permitidos en el nombre de las variables
        var miVariable = 1;
        var _miVariable  = 2;
        var $miVariable = 3;
        //var ámiVariable = 4; No se recomienda utilizar
        //var #miVariable = 10;    No se permite utilizar caracteres especiales
    }
   
}
