//Concatenacion con Java

public class HolaMundo2 {

    public static void main(String args[]) {
        var usuario = "Juan";
        var titulo = "Ingeniero";
        var union = titulo + " " + usuario;
        System.out.println("union es = " + union);

        var i = 3;
        var j = 4;
        System.out.println(i + j);//Se realiza la suma de numeros
        System.out.println(i + j + usuario);//Evaluacion de izquierda a derecha Realiza la suma primero
        System.out.println(usuario + i + j);//como empieza con una cadena todo lo toma como cadena string
        System.out.println(usuario + (i+j));//El uso de parentesis modifica la prioridad en la evaluacion primero se evalua lo que esta adentro del paretesis 
    }

}
