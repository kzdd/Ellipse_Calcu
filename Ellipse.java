/**
 
 Author: Kai Zeng
 * 
 Program purpose: by doing ellipse calculation, learn how to using system.out.*
 Scanner and java.lang.Math library. 

 */
import java.util.Scanner;
import java.lang.Math;
public class Ellipse_96648 {

    
    public static void main(String[] args) {
        
        double a;
        double b;
        /*Creat scanner*/
        Scanner keyboard = new Scanner(System.in);
        
        /*scanning the semi-major axis value a that entered */
        System.out.print ("Enter the semi-major axis value:");
        a = keyboard.nextDouble();
        
        /*scanning the semi-major axis value b that entered */
        System.out.print ("Enter the semi-minor axis value:");
        b = keyboard.nextDouble();
        
        /*Calculating The focus of the ellipse*/
        System.out.println("The focus of the ellipse is: " + 
                Math.sqrt(Math.pow(a,2) - Math.pow(b,2)));
        /*Calculating Area of the ellipse*/
        System.out.println("The Area of the ellipse is: " + Math.PI*a*b);
        
        /*Calculating ellipse circumference axis*/
        System.out.println("The ellipse circumference is: " + 
               Math.PI*(3*(a+b)- Math.sqrt(10*a*b + 
               3*(Math.pow(a,2)+Math.pow(b,2)))));
        
    }
    
}
