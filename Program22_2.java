/*
2. Write a program which accept string from user and count number of 
small characters.
Input : “Marvellous”
Output : 9
 */
import java.util.Scanner;

class Program22_3
{
     public static int Difference(char ch[]) 
    { 
        int icount_cap=0,icount_small=0;
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='a'&&ch[icnt]<='z')
            {
                icount_small++;
            }
            else if(ch[icnt]>='A'&&ch[icnt]<='Z')
            {
                icount_cap++;
            }
        }
        return icount_small-icount_cap;

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray(); 
        
        System.out.println("Difference between small and capital characters in the given string are "+Difference((ch)));
        sobj.close();

    }
}