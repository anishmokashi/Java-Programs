/*
5. Accept number of rows and number of columns from user and display below 
pattern. 
Input : iRow = 4 iCol = 4  
Output :1       2       3       4
                2       3       4
                        3       4
                                4
 */
import java.util.Scanner;

class Program19_5
{ public static void Pattern(int iRow, int iCol) 
    { int icnt=1;
     for(int i=1;i<=iRow;i++)
     {
        for(int j=1;j<=iCol;j++)
        { if(j>=i)
            {
                System.out.print(icnt+"\t");
            }
            else
            {
                System.out.print("\t");   
            }
            icnt++;
      
            
        }
       
        System.out.println();
        icnt=1;
       
     }
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter row and column");
        int ival1=sobj.nextInt();
        int ival2=sobj.nextInt();

        Pattern(ival1,ival2);
        sobj.close();

    }
}