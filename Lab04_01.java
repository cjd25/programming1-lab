import java.util.*; 

class Lab04_01
{
    public static void main (String Args[])
    {
    
        Scanner me= new Scanner(System.in);
        System.out.println("Please enter a number, any number: ");
        int x=me.nextInt();
        
        
        if(x<0){ //If x is less than zero then it is a negative number 
          System.out.printf("You have entered %d, thats a negative number! \n",x);
        }
        
        else{ //otherwise positve 
            System.out.printf("You entered %d, thats a positve number! \n", x);
        }
    }
}
      
    
        
        

