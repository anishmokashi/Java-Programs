/*
5. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 3 iCol = 4 
Output : 1 2 3 4 
         5 6 7 8 
         9 10 11 12   
 */
import java.util.Scanner;

public class Program16_5 {
 public static void Pattern(int iRow,int iCol)
        {
            int inum=1;
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    System.out.print((inum)+"\t");
                    inum++;
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
