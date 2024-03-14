/*
4.Write a program which accept string from user and accept one 
character. Return index of last occurrence of that character.
Input : “Marvellous Multi OS”
M
Output : 11
Input : “Marvellous Multi OS”
W
Output : -1
Input : “Marvellous Multi OS”
e
Output : 4
 */
import java.util.Scanner;

class Program24_4
{
     public static int lastocc(char ch[],char cval) 
    { 
        int icnt=-1;
           
        for(icnt=ch.length-1;icnt>=0;icnt--)
        {
            if(ch[icnt]==cval)
            {
               break;

            }
                   
        }
        if(icnt==0)
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

        System.out.println("Last occurence of the entered charcter is at "+lastocc(ch,cval));

        
        sobj.close();

    }
}