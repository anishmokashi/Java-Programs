/*
2.Write a program which accept string from user and accept one 
character. Return frequency of that character.
Input : “Marvellous Multi OS”
M
Output : 2
Input : “Marvellous Multi OS”
W
Output : 0
 */
import java.util.Scanner;

class Program24_2
{
     public static int CountChar(char ch[],char cval) 
    { 
        int icount=0;
           
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]==cval)
            {
               icount++;

            }        
        }
        return icount;
     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray();
        
        System.out.println("Please enter a charcter that you want to check if it is present or not");
        char cval=sobj.nextLine().charAt(0); 

        System.out.println(CountChar(ch,cval));

        
        sobj.close();

    }
}