import java.util.Scanner;

class Lab06_05
{
    public static void main (String args[])
    {
        
            Scanner vader=new Scanner(System.in);
            System.out.print("Please enter a number-> ");
            int input= vader.nextInt();
            
            if(input>=1)
            {
                for(int i=1;i<=input;i++)
                {
                    for(int j=1;j<=input;j++)
                    {
                        if(j==1||j==input||i==1||i==input)
                        {
                            System.out.print("*");
                            
                            
                        }
                        else 
                            System.out.print(" ");
                    }
                    System.out.println();
                }
               
            }
            
            else 
                System.out.println("The number you entered is incorrect");
             
    }//public
                
}//class


