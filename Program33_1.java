/*
1. Write Java program which accept two arrays from user and display 
contents of each array.
Input : 2 9 7 5 2 3
9 3 5 5
Output : 2 9 7 5 2 3
9 3 5 5
                */
import java.util.Scanner;

class Program33_1
{
     public static  void Display(int arr1[], int arr2[])
    {    int icnt=0;
        System.out.println("Printing array1");
        for(icnt=0;icnt<arr1.length;icnt++)
        {
            System.out.print(arr1[icnt]+"\t");
        }
        System.out.println("Printing array2");
        for(icnt=0;icnt<arr2.length;icnt++)
        {
            System.out.print(arr2[icnt]+"\t");
        }
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int icnt=0;
        System.out.println("Enter how many numbers you want to eneter in array 1");
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

        Display(array1, array2);
        
        
        
        
        sobj.close();

    }
}
/*
 Note Assignment 33 in java is actual assignment 42 from pdf
 */