import java.util.Scanner;
import java.lang.String;

class Lab06_04
{
    public static void main(String args[])
    {
        
        
        Scanner vader= new Scanner(System.in);
        System.out.print("Enter a word any word! As long its not a bad word-> ");
        String input=vader.nextLine();
        
        char[] vowels={'a','e','i','o','u'};    // array of vowels 
        
        input=input.toLowerCase(); //lower cases the input 

        for(char vow:vowels) 
        {
           
            input=input.replace(vow, '_'); //replaces all the vowels 
           
            
        }//for   
        System.out.println(input); //prints 
     
        
    }
        
    }