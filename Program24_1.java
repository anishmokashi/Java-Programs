/*
1.Write a program which accept string from user and accept one 
character. Check whether that character is present in string or not.
Input : “Marvellous Multi OS”
            e
Output : TRUE

Input : “Marvellous Multi OS”
            W
Output : FALSE
 */
import java.util.Scanner;

class Program24_1
{
     public static boolean ChkChar(char ch[],char cval) 
    { boolean bret=false;
           
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]==cval)
            {
               bret=true;

            }        
        }
        return bret;
     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray();
        
        System.out.println("Please enter a charcter that you want to check if it is present or not");
        char cval=sobj.nextLine().charAt(0); 

        System.out.println(ChkChar(ch,cval));

        
        sobj.close();

    }
}