import java.util.*;

class Lab04_04{

    public static void main(String args[]){
    
    Scanner vader= new Scanner(System.in);
    System.out.println("Looks like we have a compass, enter a number in degrees: ");
    double x=vader.nextDouble ();
    
    final double NE=22.5;
    final double E=22.5+45;
    final double SE= E+45;
    final double S=SE+45;
    final double SW=S+45;
    final double W=SW+45;
    final double NW=W+45;
    final double N= W+45;
    
   if(x<=N){
        System.out.println("N");
   }
   else if(x<=NE){
        System.out.println("NE");
                }
   else if(x<=E){
       System.out.println("E");
   }
   else if(x<=SE){
       System.out.println("SE");
   }
   else if(x<=S){
       System.out.println("S");
   }
   else if(x<=SW){
       System.out.println("SW");
   }
   else if(x<=W){
       System.out.println("W");
   }
  
    }
    
    
    
}
    