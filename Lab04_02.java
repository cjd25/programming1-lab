import java.util.*;

class Lab04_02
{
    public static void main(String args[])
    {
        Scanner vader=new Scanner(System.in);
        
        System.out.print("Hey, enter the year when you were born right here-> ");
        int year=vader.nextInt();
        
        int age= 2018-year;  //calculates the user's age
        
        if(age<20) //if the age is less than 20 
        {
            System.out.println("Wow your less than 20 years old");
        }
        
        else if(age>30) //if the the age is more than 30
        {
                
            System.out.println("You're more than 30?...Damn your old!");
        }
      
        else //otherwise 
        {
            System.out.printf("Your %d, thats awesome! Have an awesome day!\n",age);
        }
           
        
        }
        
        
        
        
}