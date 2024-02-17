/*
4. Write a program which accept string from user and check whether 
it contains vowels in it or not.
Input : “marvellous”
Output : TRUE
Input : “Demo”
Output : TRUE
Input : “xyz”
Output : FALSE
 */
import java.util.Scanner;

class Program22_4
{
     public static boolean ChkVowel(char ch[]) 
    { boolean bret=false;
        
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]=='a' ||ch[icnt]=='e'|| ch[icnt]=='i' || ch[icnt]=='o'|| ch[icnt]=='u')
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
        String str=sobj.nextLine().toLowerCase();
        char ch[]=str.toCharArray(); 
        
        if(ChkVowel(ch))
        {
            System.out.println(" vowels  are present in the given string  ");
        }
        else
        {
            System.out.println(" vowels  are not present in the given string  ");
        }
        
        sobj.close();

    }
}