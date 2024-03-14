/*
3.Write a program which accept string from user and accept one 
character. Return index of first occurrence of that character.
Input : “Marvellous Multi OS”
M
Output : 0

Input : “Marvellous Multi OS”
W
Output : -1
Input : “Marvellous Multi OS”
e
Output : 4
 */
import java.util.Scanner;

class Program24_3
{
     public static int firstocc(char ch[],char cval) 
    { 
        int icnt=-1;
           
        for(icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]==cval)
            {
               break;

            }
                   
        }
        if(icnt==ch.length)
        {
            return -1;
        }
        else
        {
            return icnt;
        }
       
     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray();
        
        System.out.println("Please enter a charcter that you want to check if it is present or not");
        char cval=sobj.nextLine().charAt(0); 

        System.out.println("First occurence of the entered charcter is at "+firstocc(ch,cval));

        
        sobj.close();

    }
}