/*
4. Accept number of rows and number of columns from user and display 
below pattern. 
Input : iRow = 5 iCol = 5 
Output : 1 2 3 4 5 
        -1 -2 -3 -4 -5 
         1 2 3 4 5
        -1 -2 -3 -4 -5 
         1 2 3 4 5  
 */
import java.util.Scanner;
public class Program17_4 {
 public static void Pattern(int iRow,int iCol)
        {
            int inum_even=-1;
            int inum_odd=1;
            for(int icntr=0;icntr<iRow;icntr++)
            {
                for(int icntc=0;icntc<iCol;icntc++)
                {
                    
                    
                    if((icntr+1)%2==0)
                    {
                        System.out.print((inum_even)+"\t");
                        inum_even--;
                    }
                    else
                    {
                        System.out.print(inum_odd+"\t");
                        inum_odd++;
                        
                        
                    }
                    
                    
                }
                
                inum_even=-1;
                inum_odd=1;
              
                
                
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
