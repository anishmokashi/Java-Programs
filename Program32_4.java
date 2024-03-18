/*
4. Write Java program which accept String from user and display 
below pattern.
Input : Hello
Output :            H       e       l       l       o
                    H       e       l       l       *
                    H       e       l       *       *
                    H       e       *       *       *
                    H       *       *       *       *
                    H       e       *       *       *
                    H       e       l       *       *
                    H       e       l       l       *
                    H       e       l       l       o
                */
import java.util.Scanner;

class Program32_4
{
     public static  void Pattern(String str)
    { 
        char s1[]=str.toCharArray();
      int i=0,j=0;
      for(i=s1.length;i>0;i--)
        {
            for(j=0;j<s1.length;j++)
            {
                if(i>j)
                {
                        System.out.print("\t"+s1[j]);
                }
                else
                {
                    System.out.print("\t"+"*");
                }
            }
            System.out.println();
        }//pattern 1
      
        for(i=1;i<s1.length;i++)
        {
            for(j=0;j<s1.length;j++)
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
        }//pattern 2
          
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