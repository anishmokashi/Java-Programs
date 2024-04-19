/*
2. Write a program which accept matrix and one number from user and return 
frequency of that number
Input : 3 2 5 9
        4 3 2 2
        8 4 1 5
        3 9 7 5
Output : 3

                */
import java.util.Scanner;


class Program37_2

{
     public static int Ret_Freq(int Arr[][],int ino)
    {  int isum =0;
        
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            { 
               if(Arr[i][j]==ino)
               {
                isum++;
               }
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
        System.out.println("Enter number to count the frequency of it in the matrix");
        int inum=sobj.nextInt();
        Display(Arr);
        System.out.println("frequency of "+inum+" is "+Ret_Freq(Arr,inum));
        sobj.close();

    }
}
/*
 Note Assignment 37 in java is actual assignment 47 from pdf
 */