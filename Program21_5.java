/*
5. Accept character from user and display its ASCII value in decimal, 
octal and hexadecimal format.
Input : A
Output : Decimal 65
         Octal 0101
         Hexadecimal 0X41
 */
import java.util.Scanner;

class Program21_5
{
     public static void Display (char ch) 
    { 
        System.out.println("Decimal "+((int) (ch)));
        System.out.println("Octal 0"+Integer.toOctalString(ch));
        System.out.println("Hexadecimal 0X"+Integer.toHexString(ch));

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.print("Please enter a character ");
        String str=sobj.nextLine();
        char ch=str.charAt(0); 
        
        Display(ch);
        sobj.close();

    }
}