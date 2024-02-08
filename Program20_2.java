/*
2. Accept Character from user and check whether it is capital or not 
(A-Z).
Input : F
Output : TRUE
Input : d
Output : FALSE
 */
import java.util.Scanner;

class Program20_2
{
     public static boolean  ChkCapital(char ch) 
    { boolean bret=false;
     if((ch>='A' && ch =<'Z'))
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

        if(ChkCapital(ch))
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