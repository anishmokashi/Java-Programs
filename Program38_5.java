/*
5. /Write a program which accept matrix and check whether the matrix is 
Sparse matrix or not.
Sparse matrix is a matrix with the majority of its elements equal to zero.
Input :
        1 0 3 0
        0 6 0 0
        0 0 1 0
        9 0 0 9
Output :
        True
                */
import java.util.Scanner;


class Program38_5

{
     public static  boolean ChkSparse(int Arr[][])
    {  boolean bret=false;int icnt=0;int total=Arr.length*Arr.length;// row * col
        
        for(int i=0;i<Arr.length;i++)
        {
            for( int j=0;j<Arr.length;j++)
            { 
               
               if(Arr[i][j]==0)
               {
                icnt++;
               }
            }
            
        }
        if(icnt>=(total)/2)
        {
             bret=true;
        }
        else
        {
             bret=false;
        }
        return bret;
            
            

        
     
            
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
        System.out.println(ChkSparse(Arr));
        sobj.close();

    }
}
/*
 Note Assignment 38 in java is actual assignment 48 from pdf
 */