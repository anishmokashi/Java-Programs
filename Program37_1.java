/*
1.Write a program which accept matrix from user and return addition of diagonal 
elements.
Input : 3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output : 12

                */
import java.util.Scanner;


class Program37_1

{
     public static int AddDiagonal(int Arr[][])
    {  int isum =0;
        
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            { 
               if(i==j){isum=isum+Arr[i][j];} 
            }

        }
      return isum;
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
        System.out.println("Sum of diagonal elements is "+AddDiagonal(Arr));
        sobj.close();

    }
}
/*
 Note Assignment 37 in java is actual assignment 47 from pdf
 */