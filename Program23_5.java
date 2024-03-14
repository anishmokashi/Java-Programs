/*
5. Write a program which accept string from user and count number of 
white spaces
Input : “MarvellouS”
Output : 0
Input : “MarvellouS Infosystems”
Output : 1
Input : “MarvellouS Infosystems by Piyush Manohar Khairnnar”
Output : 5 
 */
import java.util.Scanner;

class Program23_5
{
     public static int CountWhite(char ch[]) 
    { 
        int icount=0;    
        for(int icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]==' ' )
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
        System.out.println("Number of white spaces in the string are "+CountWhite(ch));
       
        
        
        
        sobj.close();

    }
}