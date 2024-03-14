/*
3. Write Java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 3 iCol = 5
Output : 5 4 3 2 1
        5 4 3 2 1
        5 4 3 2 1

 */
import java.util.Scanner;

class Program30_3
{
     public static  void Pattern(int iRow, int iCol)
    { int icnt=iCol;
        int i=0,j=0;
        for( i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                
                    System.out.print(icnt+"\t");
                    icnt--;
                
               
            }
            icnt=iCol;
          
            System.out.println();
            
        }
        
        
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
 Note Assignment 30 in java is actual assignment 39 from pdf
 */