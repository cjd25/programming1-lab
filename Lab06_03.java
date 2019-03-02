import java.util.Scanner;

class Lab06_03
{
    public static void main(String args[])
    {
       

       Scanner vader=new Scanner(System.in); //input variable 
       int total=0;
       
       System.out.print("Please select two numbers: ");
        int a=vader.nextInt();
        int b=vader.nextInt();
        
       
        
        for(int i=a;i<=b;i++)
        {
            if(i%2!=0) //if the counter is not even then add
            {
               total+=i;
            }//if
           
        }//for
       
        System.out.println("Between " +a+" and "+b + ", the total is: " +total);
        
    }
}