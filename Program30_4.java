/*
4. Write Java program which accept number of rows and number of 
columns from user and display below pattern.
Input : iRow = 3 iCol = 4
Output : * # * #
        * # * #
        * # * #
 */
import java.util.Scanner;

class Program30_4
{
     public static  void Pattern(int iRow, int iCol)
    { 
        int i=0,j=0;
        for( i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(j%2==0)
                {
                    System.out.print("# \t");
                }
                else{ System.out.print("* \t");}   
                   
                
               
            }
   
          
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