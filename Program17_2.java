/*
2. Accept number of rows and number of columns from user and display 
below pattern. 
Input : iRow = 4 iCol = 4 
Output : 2 4 6 8 10 
         1 3 5 7 9 
         2 4 6 8 10 
         1 3 5 7 9    
 */
import java.util.Scanner;
public class Program17_2 {
 public static void Pattern(int iRow,int iCol)
        {
            int inum_even=1,inum_odd=2;
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    
                    
                    if((icntr+1)%2!=0)
                    {
                        System.out.print((inum_odd)+"\t");
                        inum_odd=inum_odd+2;
                    }
                    else
                    {
                        System.out.print(inum_even+"\t");
                        inum_even=inum_even+2;
                    }
                    
                    
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
