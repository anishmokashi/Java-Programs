/*
1. Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 4 iCol = 4
Output : * * * #
         * * # *
         * # * * 
         # * * *
 */
import java.util.Scanner;

class Program25_1
{
     public static void Pattern(int iRow, int iCol)
      
    { 
        for(int irow=1;irow<=iRow;irow++)
        {
            for(int icol=iCol;icol>=1;icol--)
            {
                if(irow==icol)
                {
                    System.out.print("#\t");
                }
                else
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
        System.out.println("Please enter a count for row and colum");
        int row=sobj.nextInt();
        int col=sobj.nextInt();

        Pattern(row,col);

        
        sobj.close();

    }
}