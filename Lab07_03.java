import apple.laf.JRSUIConstants;
import java.util.Scanner;

public class Lab07_03
{
    public static void main(String args[])
    {
       
        
        System.out.println("Please enter a list of numbers, but it must between 50 and 100"
                +" when your done please type in 0 to calculate the average: ");
        Scanner vader=new Scanner(System.in);
        int input=vader.nextInt();
        
        double total=0;
        int i=0;
        double average;
        
     
     while(input!=0)
     {
         if(input>=50 && input<=100)
         {
         total+=input;
         
         
         System.out.println("Please enter a number, or 0 to finish: ");
         input=vader.nextInt();
         }//if
     
     
         else  
         { 
          System.out.println("You must enter the number in the correct range!");
          break;
          }//else
         i++;
     }//while
     
 
     if(i==0)
     {
         System.out.println("You did'nt enter anything!");
     }//if
     
     else
     {
         average=total/i; //calculates the average 
         System.out.println("You enetered "+i+" positive numbers!");
         System.out.printf("Your average is: %5.2f\n",average); //width 5 and 2 deciaml places 
     }//else 
        
        
     }//main


}