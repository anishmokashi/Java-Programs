/*
3. Write a java program which accept two array from user and copy 
the contents of that array into another array in reverse order and 
return new array.
Output : 80      70      60      50      40      30      20      10
                */
import java.util.Scanner;

class Program34_3
{
     public static int[] CopyArrayRev(int arr1[], int arr2[])
    {    
        int new_arr_len=arr1.length+arr2.length,icnt=0;
        int arr[]=new int[new_arr_len],temp=0;

        for(icnt=0;icnt<arr1.length;icnt++)
        {
            arr[icnt]=arr1[icnt];
        }
        for(icnt=0;icnt<arr2.length;icnt++)
        {
            arr[arr1.length+icnt]=arr2[icnt];
        }// copied two arrays to one 
        
        for(icnt=0;icnt<arr.length/2;icnt++)
        {
            temp=arr[icnt];
            arr[icnt]=arr[(arr.length-1)-icnt];
            arr[(arr.length-1)-icnt]=temp;

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

        int arr_ret[]=CopyArrayRev(array1, array2);
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