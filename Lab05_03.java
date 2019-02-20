import java.util.Scanner;
import java.lang.Math;

class Lab05_03
{
    public static void main(String args[]){
        
        Scanner vader=new Scanner(System.in); //creating an input variable 
        final double pi= 3.14159265359;//for the circle area equation
        
        System.out.println("Please choose the following 4 options: "+"\n"+
                "1.Circle \n"+
                "2.Square \n"+
                "3.Rectangle \n"+
                "4.Exit" );
        int input= vader.nextInt();
        
     
        
        
        if(input==1)
        {
            System.out.println("----------------------------------------------\n"
            +"Awesome you have chose a Circle!\n"
            +"Now input a number to calculate the radius: ");
            int r=vader.nextInt(); //radius
            double c_area= pi* Math.pow(r,2); //cacultes the area of a circle
            System.out.printf("The area is: %.2f\n",c_area); //rounds to the nearest 2 decimal places
           
        }
        else if (input==2)
        {
            System.out.println("-----------------------------------------------\n"
                    +"Awesome you have a chosen a Square!\n "
                    + "Now plaese put a number so we can calculate the area: ");
            int a =vader.nextInt(); //area
            System.out.println("The area is: "+Math.pow(a,2));
            
    }
        else if(input ==3){
            System.out.println("------------------------------------------------\n"
                    +"Awesome you have a chose a Rectangle! \n"
                +"Now please enter the length and width so we can calculate the rectangle: ");
            int l=vader.nextInt();
            int w=vader.nextInt();
            System.out.println("The area is: "+l*w);
        }
        else {
            System.out.println("Have a nice Day!");
        }
        
        
        
                
    }
}