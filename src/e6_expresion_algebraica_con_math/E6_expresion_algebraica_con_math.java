
package e6_expresion_algebraica_con_math;


import static java.lang.Math.pow;
import java.util.Scanner;

public class E6_expresion_algebraica_con_math {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in); 
       //declaracion de variables
       int a;
       int b;
       int x;
       // entrada de datos
        System.out.println("ingrese el valor de a");
        a=in.nextInt();
        System.out.println("ingrese el valor de b");
        b=in.nextInt();
        //procedimiento
        x=(int) (pow(a,2)+pow(b,2));
     
        //salida de datos
        System.out.println("el valor de la expresion algebraica es: "+x);
       
       
    }
    
}
