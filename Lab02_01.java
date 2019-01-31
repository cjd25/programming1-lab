import java.util.*;
        
public class Lab02_01
{
    public static void main( String args[])
    {
        //User email
        Scanner e=new Scanner(System.in);//input variable 
        
        //Prompt
        System.out.println("Please enter your email: ");
        String email=e.nextLine(); //Users email
        
        //User Address
        System.out.print("Also your address,please: ");
        String address=e.nextLine();
        
        String output=email+", "+address;//concatenation 
        
        System.out.println("This INFORMATION belongs to us muahahaha!!" + "\n"+ 
                output);
        
        
        
        
    }
}