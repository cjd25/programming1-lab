public class Lab07_02
{
    public static void main(String args[])
    {
        int i=0;
        int total=0;
        
        do
        {
            if(i%2!=0)
            {
                total=total+i;
               
            
            }//if
            
            
           
            i++;
        }while(i<=100);
        
         System.out.println("The total is: "+ total);
    
    
    
    
    }
}