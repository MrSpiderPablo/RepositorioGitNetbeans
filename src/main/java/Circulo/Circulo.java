
package Circulo;
import java.util.Scanner;
import java.lang.Math;
/**
 *
 * @author pablo
 */
public class Circulo 
{
    public static void main(String[]args)
    {
     try
     {
        Scanner s= new Scanner (System.in);
        System.out.println("introduce el radio: ");
        double r=s.nextDouble();
        double area=((Math.PI)*r*r);
        System.out.printf("El valor del area es %f\n", area);
     }catch(Exception e)
     {System.out.println("Error");
     }
     }
    }
