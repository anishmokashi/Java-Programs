/*
1. Accept Character from user and check whether it is alphabet or not 
(A-Z a-z).
Input : F
Output : TRUE
Input : &
Output : FALSE
 */
import java.util.Scanner;

class Program20_1
{
     public static boolean ChkAlpha(char ch) 
    { boolean bret=false;
     if((ch>='A' && ch =<'Z')||(ch>='a'&&ch=<'z'))
     {
        bret= true;
     }
    return bret;
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter a character");
        char ch=sobj.next().charAt(0);

        if(ChkAlpha(ch))
        {
            System.out.println("True");
        }
        else
        {
            System.out.println("False");
        }
        sobj.close();

    }
}