/*
1. Accept N numbers from user and return frequency of even numbers.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 3

 */

import java.util.Scanner;

public class Program10_1 {
   public static int CountEven(int[] Arr)
   { int even_icount=0;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%2==0))
            {
                  even_icount++;
            }

         } 
         
        return even_icount;
   }


  
  public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Please tell us how many numbers you are going to enter : ");

    int iSize=sobj.nextInt();
    
    
    int Arr[]=new int[iSize];
    System.out.println("Please enter "+iSize+" numbers");

    
    for (int icnt=0;icnt<iSize;icnt++)
    {
     
      Arr[icnt]=sobj.nextInt();
        
    }

    System.out.println("Frequency of even numbers in the array is "+CountEven(Arr));






 
    sobj.close();
 }
    
}
