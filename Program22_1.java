/*
1.Write a program which accept string from user and count number of 
capital characters.
Input : “Marvellous Multi OS”
Output : 4

 */
import java.util.Scanner;

class Program22_1
{
     public static int CountCapital(char ch[]) 
    { 
        int icount=0;
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='A'&&ch[icnt]<='Z')
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
        
        System.out.println("Capital characters in the given string are "+CountCapital(ch));
        sobj.close();

    }
}