/*
2. Write a java program which accept two two arrays from user and 
display minimum element of each array.
Input : 2 9 7 5 2 3
9 3 5 5
Output : 2 3
                */
import java.util.Scanner;

class Program34_2
{
     public static void  DiffArray(int arr1[], int arr2[])
    {    int icnt=0,imin1=Integer.MAX_VALUE,imin2=Integer.MAX_VALUE;
        
        for(icnt=0;icnt<arr1.length;icnt++)
        { 
               if(arr1[icnt]<imin1)
               {
                    imin1=arr1[icnt];
               }
            
            
        }
        System.out.print(imin1+"\t");
 
        for(icnt=0;icnt<arr2.length;icnt++)
        {
            if(arr2[icnt]<imin2)
            {
                 imin2=arr2[icnt];
            }
        }
        System.out.print(imin2+"\t");
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

        DiffArray(array1, array2);
        
        
        
        
        sobj.close();

    }
}
/*
 Note Assignment 34 in java is actual assignment 43 from pdf
 */