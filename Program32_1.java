/*
1. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output :    H * * * *
            H e * * *
            H e l * *
            H e l l *

    */
import java.util.Scanner;

class Program32_1
{
     public static  void Pattern(String str)
    { 
        char s1[]=str.toCharArray();
      int i=0,j=0,len=s1.length;
      
        for(i=0;i<s1.length-1;i++)
        {
            for(j=0;j<s1.length-1;j++)
            {
                if(i>=j)
                {
                        System.out.print("\t"+s1[j]);
                }
                else
                {
                    System.out.print("\t"+"*");
                }
            }
            System.out.println();
        }
          
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter string");
        String str=sobj.nextLine();
        Pattern(str);
        
        sobj.close();

    }
}
/*
 Note Assignment 32 in java is actual assignment 41 from pdf
 */