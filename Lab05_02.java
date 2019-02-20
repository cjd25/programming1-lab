import java.util.*;

// same thing as Lab05_01 but with a switch
class Lab05_02
{
    public static void main(String args[])
    {
        Scanner vader= new Scanner(System.in);
        System.out.println("Please enter a Letter grade: ");
        char letter=vader.next().charAt(0);
        
        letter=Character.toUpperCase(letter);
        
        switch(letter)
        {
            case 'A':
                System.out.println("Excellent");
                break;
            case 'B':
                System.out.println("Good Job");
                break;
            case 'C':
                System.out.println("You can do better");
            case 'D': case 'F':
                System.out.println("Ugh-Oh, thats not good");
            default:
                System.out.println("You did not input a grade, or maybe you input a letter grade that does not exist!");
                break;  
        }
        
    }
}