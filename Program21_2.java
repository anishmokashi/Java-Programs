/*
2. Accept character from user. If character is small display its 
corresponding capital character, and if it small then display its 
corresponding capital. In other cases display as it is.
Input : Q
Output : q
Input : m
Output : M
Input : 4
Output : 4
Input : %
Output : %
 */
import java.util.Scanner;

class Program21_2
{
     public static void  Display(char cha) 
    {  char ch=cha;
        int ascii=0;
        if(ch>='a'&&ch<='z')
        {
            ascii = ch;
            ascii = ascii - 32;
            ch = (char)ascii;
            
            System.out.println("\nEquivalent Character in Uppercase = " +ch);
        }
        else if(ch>='A'&&ch<='Z')
        {
            ascii = ch;
            ascii = ascii + 32;
            ch = (char)ascii;
            
            System.out.println("\nEquivalent Character in lowercase = " +ch);
        }
        else
        {
            System.out.println("\nEquivalent Character in lowercase = " +ch);
        }

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