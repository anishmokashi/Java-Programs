/*
1. Write a java program which accept two arrays from user and return 
difference between summation of arrays.
Input : 2 9 7 5 2 3
9 3 5 5
Output : 6
                */
import java.util.Scanner;

class Program34_1
{
     public static   int  DiffArray(int arr1[], int arr2[])
    {    int icnt=0,sum1=0,sum2=0;
        System.out.println("Printing array1");
        for(icnt=0;icnt<arr1.length;icnt++)
        { 
               sum1=sum1+arr1[icnt];
            
            
        }
        System.out.print(sum1+"\t");
        for(icnt=0;icnt<arr2.length;icnt++)
        {sum2=sum2+arr2[icnt];
          
        }
        System.out.print(sum2+"\t");
        return sum1-sum2;
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


        System.out.println("Enter how many numbers you want to enter in array 2");
        int isize2=sobj.nextInt();
        int array2[]=new int[isize2];
        System.out.println("Enter "+isize2+" numbers");
        for(icnt=0;icnt<isize2;icnt++)
        {
            array2[icnt]=sobj.nextInt();
        }

        System.out.println(DiffArray(array1, array2));
        
        
        
        
        sobj.close();

    }
}
/*
 Note Assignment 33 in java is actual assignment 42 from pdf
 */