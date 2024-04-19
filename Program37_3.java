/*
3. Write a program which accept matrix and return largest number from both the 
diagonals
Input : 3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output : 9

                */
import java.util.Scanner;


class Program37_3

{
     public static int  MaxDiagonal(int Arr[][])
    {  int imax=Integer.MIN_VALUE;
        
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr[i].length;j++)
            { 
             
                // if(Arr[i][j]>imax || ((i + j) == Arr.length))
                if(((i - j) == 0 || ((i + j) == Arr.length)))
                {
                    if(Arr[i][j]>imax)
                    {
                        imax=Arr[i][j];
                    }
                    
                }
             
               
            }

        }
      return imax;
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
        System.out.println("max from both the diagonal is "+ MaxDiagonal(Arr));
        sobj.close();

    }
}
/*
 Note Assignment 37 in java is actual assignment 47 from pdf
 */