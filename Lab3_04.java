import java.util.*;
import java.math.*;

public class Lab3_04
{
public static void main (String args[])
{
    Scanner in=new Scanner(System.in); //input variable 
    
    System.out.println("Lets calculate the hypotenuse of a triangle!\n");
    
    System.out.println("Please the enter the length of the adjacent side: ");
    Double adj= in.nextDouble();
    
    System.out.println("Now the length of the opposite side: ");
    Double opp=in.nextDouble();
    
    Double hypo= Math.sqrt(Math.pow(adj, 2)+ Math.pow(opp, 2));
    
    
    System.out.printf("Awesome the Hypotenuse is: %3.2f",hypo);
    System.out.println("\nYay is'nt Trigonometry fun! :D");
    

    
    
}
}
        
            
