//Excericse 1

import java.util.*;

public class Lab3_01
{
    public static void main(String args[])
    {
        Scanner me=new Scanner(System.in);
        
        System.out.println("Yo enter a phrase that has 3 repeated words or whatever: ");
        String phrase= me.nextLine();
        
         System.out.println("\nNow enter the word that repeats yo: ");
         String word=me.nextLine();
         
         System.out.println("\nYo what do you want to replace it with: ");
         String s=me.nextLine();
         
         phrase=phrase.replaceAll(word,s);
         
         System.out.println("\nNow this is the new phrase yo: "+phrase);
         
        
  
        
        
    }
}