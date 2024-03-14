/*
4. Write a program which accept string from user and display only 
digits from that string.
Input : “marve89llous121”
Output : 89121
Input : “Demo”
Output : 
 */
import java.util.Scanner;

class Program23_4
{
     public static void DisplayDigit(char ch[]) 
    { 
    
        
       
        
        
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='0' && ch[icnt]<='9')
            {
                System.out.print(ch[icnt]+"\t");

            }
            
        
          
        
            
        }
       
           

     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray(); 
        DisplayDigit(ch);
       
        
        
        
        sobj.close();

    }
}