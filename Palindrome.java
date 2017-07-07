import java.util.*;
class Palindrome
{
    public static void main(String arg[])
    {
        String str="MADAM";
        String revstring="";
        
        for(int i =str.length()-1;i>=0;--i)
        {
            revstring+=str.charAt(i);
         }   
            System.out.println(revstring); 
         if(revstring.equalsIgnoreCase(str))
         {
           
        System.out.println("The string is palindrome");
        }
        else
        {
          
        System.out.println("Not palindrome"); // LINE B
    
    }
}
}
