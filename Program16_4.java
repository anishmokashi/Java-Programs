/*
4. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 5 
Output : 4 4 4 4 4 
         3 3 3 3 3 
         2 2 2 2 2 
         1 1 1 1 1  
 */
import java.util.Scanner;

public class Program16_4 {
 public static void Pattern(int iRow,int iCol)
        {
            int inum=iRow;
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    System.out.print((inum)+"\t");
                }
                System.out.println();
                inum--;
                
                
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
