/*
3. Accept character from user. If it is capital then display all the 
characters from the input characters till Z. If input character is small 
then print all the characters in reverse order till a. In other cases 
return directly.
Input : Q
Output : Q R S T U V W X Y Z
Input : m
Output : m l k j i h g f e d c b a
Input : 8
Output :
 */
import java.util.Scanner;

class Program21_3
{
     public static void  Display(char cha) 
    {  char ch='\0';
     
        if(cha>='a'&&cha<='z')
        {
            for(ch=cha;ch>='a';ch--)
            {
                System.out.print(ch+"\t");
            }
        }
        else if(cha>='A'&&cha<='Z')
        {
            for(ch=cha;ch<='Z';ch++)
            {
                System.out.print(ch+"\t");
            }
        }
        else
        {
            return;
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