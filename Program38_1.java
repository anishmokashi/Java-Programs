/*
1.Write a program which accept matrix from user and display transpose of the 
matrix.
The transpose of a given matrix is formed by interchanging the rows and 
columns of a matrix
Input :
        3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output :
        3 4 8 3
        2 3 4 9
        5 2 1 7
        9 2 5 5
                */
import java.util.Scanner;


class Program38_1

{
     public static void Transpose(int Arr[][])
    {  int temp=0;
        
        for(int i=0;i<Arr.length;i++)
                {
            for( int j=0;j<Arr.length;j++)
            { 
                System.out.print(Arr[j][i]+"\t");
                //in normal matrix we print i j that is row and column but 
                //in the transpose of the matrix rows become column and column become
                //rows so we just print j i 
                
            }
            System.out.println();
        }
            
            

        
     
            
        }
    public static void Display(int Arr[][])
    {  
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();

        }
    
        
    }

     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter elements from left to right ");
        int Arr[][]=new int[4][4];
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
 
        Display(Arr);
        Transpose(Arr);
        
        sobj.close();

    }
}
/*
 Note Assignment 38 in java is actual assignment 48 from pdf
 */