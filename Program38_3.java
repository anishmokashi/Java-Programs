/*
3. Write a program which accept matrix and reverse the contents of each 
column.
Input :
        3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output :
        3 9 7 5
        8 4 1 9
        4 3 2 2
        3 2 5 9
                */
import java.util.Scanner;


class Program38_3

{
     public static void ReverseCol(int Arr[][])
    {  int temp=0,arrlen=Arr.length;
        
        for(int i=0;i<Arr.length/2;i++)
        {
            for( int j=0;j<Arr.length;j++)
            { 
               
                temp=Arr[(arrlen-1)-i][j];
                Arr[(arrlen-1)-i][j]=Arr[i][j];
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
        ReverseCol(Arr);
        System.out.println("ReverseCol of the matrix is ");
        Display(Arr);
        sobj.close();

    }
}
/*
 Note Assignment 38 in java is actual assignment 48 from pdf
 */