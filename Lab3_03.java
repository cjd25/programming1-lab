import java.math.*;
import java.util.*;

//excercise 3
public class Lab3_03
{
    public static void main(String Args[])
    {
        //input varaible
       Scanner in= new Scanner(System.in);
        
       System.out.println("Enter a number so I can calculate it for you: ");
       Double x=in.nextDouble();
       
        
       double equation= 1+x+(Math.pow(x, 2)/2) +(Math.pow(x, 3)/6)+(Math.pow(x, 4)/24);
        
       System.out.println("The answer is: "+equation);
    }
}
       