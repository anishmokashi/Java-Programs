/*
5. Write a program which accept matrix and swap the contents of consecutive rows.
Input : 3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output :    4 3 2 2
            3 2 5 9
            3 9 7 5
            8 4 1 9

                */
import java.util.Scanner;


class Program37_5

{
     public static void SwapRows(int Arr[][])
    {  int temp=0;
        
        for(int i=0;i<Arr.length;i=i+2)
                {
            for(int j=0;j<Arr.length;j++)
            { 
                temp=Arr[i][j];
                Arr[i][j]=Arr[i+1][j];
                Arr[i+1][j]=temp;
                
            }
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
        SwapRows(Arr);
        System.out.println();
        Display(Arr);
        sobj.close();

    }
}
/*
 Note Assignment 37 in java is actual assignment 47 from pdf
 */