/*
3. Write a program which accept string from user and display it inn 
reverse order.
Input : “MarvellouS”
Output : “SuollevraM”
 */
import java.util.Scanner;

class Program22_5
{
     public static void Reverse(char ch[]) 
    { 
        boolean bret=false;
        char temp='\0';
        
        
        for(int icnt=0;icnt<ch.length/2;icnt++)
        {
            temp=ch[icnt];
        
            
            ch[icnt]=ch[ch.length-1-icnt];
      
            
            ch[ch.length-1-icnt]=temp;
        
            
        }
       
           System.out.println(ch);

     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine().toLowerCase();
        char ch[]=str.toCharArray(); 
        Reverse(ch);
       
        
        
        
        sobj.close();

    }
}