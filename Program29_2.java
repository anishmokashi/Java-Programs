/*
2. Write Java program which accept number of rows and number of columns 
from user and display below pattern.
Input : iRow = 4 iCol = 4
Output : A B C D
        a b c d
        A B C D
        a b c d

 */
import java.util.Scanner;

class Program29_2
{
     public static  void Pattern(int iRow, int iCol)
    { char ch_cap='A',ch_small='a';
        int i=0,j=0;
        for( i=1;i<=iRow;i++)
        {
            for(j=1;j<=iCol;j++)
            {
                if(i%2==0)
                {
                    System.out.print(ch_small+"\t");
                    ch_small++;
                }
                else
                {
                    System.out.print(ch_cap+"\t");
                    ch_cap++;
                }
               
            }
            ch_cap='A';
            ch_small='a';
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
 Note Assignment 29 in java is actual assignment 38 from pdf
 */