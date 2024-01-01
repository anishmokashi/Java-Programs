/*
1. Accept N numbers from user and return the largest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 93
 */

import java.util.Scanner;

public class Program12_1 {
   public static int  Maximum(int[] Arr)
   { int imax=Arr[0];
      for(int icnt=0;icnt<Arr.length;icnt++){
         if(Arr[icnt]>imax)
         {
            imax=Arr[icnt];
         }
      }
      
      
       return imax; 
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

      System.out.println("Maximum number from array is "+ Maximum(Arr));







 
    sobj.close();
 }
    
}
