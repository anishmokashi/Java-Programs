/*
1. Accept number of rows and number of columns from user and display 
below pattern. 
Input : iRow = 4 iCol = 3 
Output : * * * 
         * * * 
         * * * 
         * * * 
 */

import java.util.Scanner;

class Program15_1
{ 
        public static void Pattern(int iRow,int iCol)
        {
            
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
                
            }
        }
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number for row and column");
        int irow=sobj.nextInt();
        int iCol=sobj.nextInt();
        Pattern(irow,iCol);

    }
}