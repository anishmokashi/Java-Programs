/*
5. Write a program which accept string from user reverse that string 
in place.
Input : “abcd”
Output : “dcba”
Input : “abba”
Output : “abba”
 */
import java.util.Scanner;

class Program24_5
{
     public static void StrRevX(char ch[]) 
    { 
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
        String str=sobj.nextLine();
        char ch[]=str.toCharArray();

        StrRevX(ch);

        
        sobj.close();

    }
}