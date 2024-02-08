/*
4. Accept Character from user and check whether it is small case or 
not (a-z).
Input : g
Output : TRUE
Input : D
Output : FALSE
 */
import java.util.Scanner;

class Program20_4
{
     public static boolean  ChkSmall(char ch) 
    { boolean bret=false;
     if((ch>='a' && ch =<'z'))
     {
        bret= true;
     }
    return bret;
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter a character to check if it is in small case or not ");
        char ch=sobj.next().charAt(0);

        if(ChkSmall(ch))
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