/*
5. Accept number of rows and number of columns from user and display below 
pattern.
Input : iRow = 5 iCol = 5
Output : 
        1       2       3       4       5
        1       2                       5
        1               3               5
        1                       4       5
        1       2       3       4       5
 */
import java.util.Scanner;

class Program25_5
{
     public static void Pattern(int iRow, int iCol)
    { int icnt=1;
        for(int irow=1;irow<=iRow;irow++)
        {
            for(int icol=1;icol<=iCol;icol++)
            {
                if(irow==icol || irow==1 || icol==1 || irow==iRow || icol==iCol)
                {
                    System.out.print(icnt+"\t");
                    
                }
                else
                {
                    System.out.print("\t");
                }
                
                icnt++;
                
            }
            icnt=1;
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