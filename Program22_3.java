/*
3. Write a program which accept string from user and return 
difference between frequency of small characters and frequency of 
capital characters.
Input : “MarvellouS”
Output : 6 (8-2)
 */
import java.util.Scanner;

class Program22_2
{
     public static int CountSmall(char ch[]) 
    { 
        int icount=0;
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='a'&&ch[icnt]<='z')
            {
                icount++;
            }
        }
        return icount;

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray(); 
        
        System.out.println("Small characters in the given string are "+CountSmall(ch));
        sobj.close();

    }
}