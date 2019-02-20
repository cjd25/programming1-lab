import java.util.*;

class Prog05_01{
    public static void main(String args[])
    {
        Scanner vader=new Scanner(System.in);
        System.out.println("Please enter a Letter grade: ");
        char letter=vader.next().charAt(0);
        
        letter=Character.toUpperCase(letter); //converts the letter into capital
        
       if(letter=='A')
        {
            System.out.println("Excellent");
        }
            
        else if(letter=='B') {
                    
            System.out.println("Good!");
        }
        else if(letter=='C'){
            System.out.println("You can do better");
        }
        else if(letter=='D'||letter=='F'){
             System.out.println("Thats not good");
        
    }
        else 
            System.out.println("That grade does not exist");
    }
}
   
            
           
        
        
    
