/*
2. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output :    H e l l o
            H e l l
            H e l
            H e
            H
 */
import java.util.Scanner;

class Program31_2
{
     public static  void Pattern(String str)
    { 
      char s1[]=str.toCharArray();
      int i=0,j=0;
        for(i=0;i<s1.length;i++)
        {
            for(j=0;j<s1.length-i;j++)
            {
                System.out.print(s1[j]+"\t");
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
 Note Assignment 31 in java is actual assignment 40 from pdf
 */