class Lab06_02
{
    public static void main(String args[])
    {
        int counter;
        int number=0;//setting number=0
        
        for(counter=2;counter<=100;counter++)
        {
           if(counter%2==0)
            {
                
                number=number+counter; //summation of even numbers
               
            }//if
         
        }//for
        System.out.println(number);
      
    }
}