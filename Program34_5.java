/*
5. Write a java program which accept two array from user and check 
whether that array and its elements are palindrome or not.
Input : 11 252 387783 252 11
Output : TRUE
Input : 11 252 387783 77 11
Output : FALSE
Input : 11 252 786 252 11
Output : FALSE
Input : 11 252 786 253 11
Output : FALSE
                */
import java.util.Scanner;

class Program34_5
{
     public static boolean ChkPallindrome(int arr1[])
    {   int var=0,idigit=0,ireverse=0,icnt=0;
        for(icnt=0;icnt<arr1.length;icnt++)
        {
            var=arr1[icnt];
            while(var!=0)
            {
                idigit=var%10;
                ireverse=ireverse*10+idigit;
                var=var/10;

            }
            if((arr1[icnt]!=ireverse )||( arr1[icnt]!=arr1[(arr1.length-1)-icnt]))
            {
                break;
            }
            ireverse=0;
        }
        if(icnt==arr1.length)
        {
            return true;
        }
        else
        {
            return false;
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


        
    
         System.out.print(ChkPallindrome(array1));
      
        
        
        
        sobj.close();

    }
}
/*
 Note Assignment 34 in java is actual assignment 43 from pdf
 */