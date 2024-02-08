/*
3. Accept Character from user and check whether it is digit or not 
(0-9).
Input : 7
Output : TRUE
Input : d
Output : FALSE
 */
import java.util.Scanner;

class Program20_3
{
     public static boolean  ChkDigit(char ch) 
    { boolean bret=false;
     if((ch>='0' && ch =<'9'))
     {
        bret= true;
     }
    return bret;
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter a digit but it will be considered as a character");
        char ch=sobj.next().charAt(0);

        if(ChkDigit(ch))
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