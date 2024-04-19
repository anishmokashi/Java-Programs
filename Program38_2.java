/*
2. Write a program which accept matrix and reverse the contents of each row.

Input :
        3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output :
        9 5 2 3
        2 2 3 4
        9 1 4 8
        5 7 9 3
                */
import java.util.Scanner;


class Program38_2

{
     public static void ReverseRow(int Arr[][])
    {  int temp=0,arrlen=Arr.length;
        
        for(int i=0;i<Arr.length;i++)
                {
            for( int j=0;j<Arr.length/2;j++)
            { 
                temp=Arr[i][(arrlen-1)-j];
                Arr[i][(arrlen-1)-j]=Arr[i][j];
                Arr[i][j]=temp;

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
        ReverseRow(Arr);
        System.out.println("Reverse of the matrix is ");
        Display(Arr);
        sobj.close();

    }
}
/*
 Note Assignment 38 in java is actual assignment 48 from pdf
 */