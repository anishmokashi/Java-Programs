/*
1. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 4 
Output : *
         *       *
         *       *       *
         *       *       *       *

 */
import java.util.Scanner;

class Program19_1
{ public static void Pattern(int iRow, int iCol) 
    { 
     for(int i=1;i<=iRow;i++)
     {
        for(int j=1;j<=iCol;j++)
        {
            if(i>=j)
            {
                System.out.print("*\t");
                
            }
      
            
        }
       
        System.out.println();
       
     }
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter row and column");
        int ival1=sobj.nextInt();
        int ival2=sobj.nextInt();

        Pattern(ival1,ival2);
        sobj.close();

    }
}