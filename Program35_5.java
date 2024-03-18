/*
5. Write Java program which accept array from user and display below 
pattern.
Input : 8 9 7 6 4 2 4
Output :
            * * * * * * * *
            * * * * * *
            * * * *
            * *
            * * * *
                */
import java.util.Scanner;
import java.util.regex.Pattern;

class Program35_5
{
     public static void Pattern(int arr[])
    {  
        int i=0,c_icnt=0,s_icnt=0;
        for(i=0;i<arr.length;i++)
        {   
                for(int j=0;j<arr[i];j++)
                {
                    System.out.print("*\t");
                }
                System.out.println();
            }
            
           
        }
        


     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int icnt=0;
        System.out.println("Enter how many numbers you want to enter in array 1");
        int isize1=sobj.nextInt();
        int array1[]=new int[isize1];
        System.out.println("Enter "+isize1+" numbers");
        for(icnt=0;icnt<isize1;icnt++)
        {
            array1[icnt]=sobj.nextInt();
        }
            Pattern(array1);
        sobj.close();

    }
}
/*
 Note Assignment 35 in java is actual assignment 44 from pdf
 */