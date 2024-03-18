/*
4. Write Java program which accept two arrays from user and form 
new array which is combination of contents of first and second array.
Input : 12 57 28 3
99 23 54 58 6 67
Output : 12 57 28 3 99 23 54 58 6 67
                */
import java.util.Scanner;

class Program34_4
{
     public static int[] ArrayConcate(int arr1[], int arr2[])
    {    
        int new_arr_len=arr1.length+arr2.length,icnt=0;
        int arr[]=new int[new_arr_len];

        for(icnt=0;icnt<arr1.length;icnt++)
        {
            arr[icnt]=arr1[icnt];
        }
        for(icnt=0;icnt<arr2.length;icnt++)
        {
            arr[arr1.length+icnt]=arr2[icnt];
        }

        return arr;
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

        int arr_ret[]=ArrayConcate(array1, array2);
        for(icnt=0;icnt<arr_ret.length;icnt++)
        {
            System.out.print(arr_ret[icnt]+"\t");
        }
        
        
        
        sobj.close();

    }
}
/*
 Note Assignment 34 in java is actual assignment 43 from pdf
 */