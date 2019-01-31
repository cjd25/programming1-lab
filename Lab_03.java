//Excercise 2

import java.util.*;

public class Lab_03
{
    public static void main (String Args[])
    {
        Scanner in= new Scanner(System.in);
        
        System.out.println("Please enter a phrase with a word repeated 3 times:");
        String phrase=in.nextLine();
        
        System.out.println("Enter the word that is repeated: ");
        String word=in.nextLine(); //word that repeats
        
        System.out.println("Enter the replacement of the first occurence: ");
        String s2=in.nextLine();
        
        System.out.println("Enter the replacement of the second occurence: ");
        String s3=in.nextLine();
        
        System.out.println("Enter the replacement of the third occurence: ");
        String s4=in.nextLine();
                
        phrase= phrase.replaceFirst(word,s2); //firt occurence 
        phrase= phrase.replaceFirst(word, s3); //second occurence
        phrase=phrase.replaceFirst(word, s4); //third occurence
        
        System.out.println("New phrase: "+phrase); //new phrase
        
        
                
       
     
        
      
        
        
        
        
        
                
        
    }
}