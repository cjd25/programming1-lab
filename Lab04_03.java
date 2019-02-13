import java.util.*;

class Lab04_03{
    public static void main(String args[])
    {
            
            Scanner vader= new Scanner(System.in);
            System.out.println("Please enter 3 numbers: "); //3 inputs
            int x1= vader.nextInt();
            int x2= vader.nextInt();
            int x3= vader.nextInt();
            
            if (x1==x2 & x2==x3) //compares if x1,x2,x3 are the same 
            {
                System.out.println("All the same!");
            }
            
            else{
                System.out.println("Neither!");
            }
        
    }
}
