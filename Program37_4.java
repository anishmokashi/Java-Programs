/*
4. Write a program which accept matrix and display addition of elements From each 
column.
Input : 3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output : 18 18 15 25

                */
import java.util.Scanner;


class Program37_4

{
     public static void Addcolumn(int Arr[][])
    {  int isum=0;
        
        
            for(int j=0;j<Arr.length;j++)
            { for(int i=0;i<Arr[j].length;i++)
                {
                isum=isum+Arr[i][j];
                }
                System.out.print(isum+"\t"); 
                isum=0;
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
        Addcolumn(Arr);
        sobj.close();

    }
}
/*
 Note Assignment 37 in java is actual assignment 47 from pdf
 */