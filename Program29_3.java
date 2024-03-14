/*
3. Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : A A A A A
        B B B B B
        C C C C C

 */
import java.util.Scanner;

class Program29_3
{
     public static  void Pattern(int iRow, int iCol)
    { char ch_cap='A';
        int i=0,j=0;
        for( i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                
                    System.out.print(ch_cap+"\t");
                    
                
               
            }
            ch_cap++;
          
            System.out.println();
            
        }
        ch_cap='A';
        
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter number for row");
        int irow=sobj.nextInt();
        System.out.println("Please enter number for col");
        int icol=sobj.nextInt();

       
        
        Pattern(irow,icol);
        
        sobj.close();

    }
}
/*
 Note Assignment 29 in java is actual assignment 38 from pdf
 */