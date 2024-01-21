/*
 2. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 4 
Output : A B C D 
 a b c d 
 A B C D 
 a b c d 
 */
import java.util.Scanner;

public class Program16_2 {
 public static void Pattern(int iRow,int iCol)
        {
            char ch_captial='A',ch_small='a';
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    if((icntr+1)%2!=0)
                    {
                        System.out.print((ch_captial)+"\t");
                        ch_captial++;
                    }
                    else
                    {
                        System.out.print((ch_small)+"\t");
                        ch_small++;
                    }

                }
                System.out.println();
                ch_captial='A';
                ch_small='a';
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
