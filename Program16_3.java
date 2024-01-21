/*
3. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 3 iCol = 5 
Output : A A A A A 
         B B B B B 
         C C C C C 
 */
import java.util.Scanner;

public class Program16_3 {
 public static void Pattern(int iRow,int iCol)
        {
            char ch='A';
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    System.out.print((ch)+"\t");
                    
                }
                System.out.println();
                ch++;
                
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
