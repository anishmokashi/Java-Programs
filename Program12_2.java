/*
2. Accept N numbers from user and return the smallest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 3
 */

import java.util.Scanner;

public class Program12_2 {
   public static int Minimum(int[] Arr)
   { int imin=Arr[0];
      for(int icnt=0;icnt<Arr.length;icnt++){
         if(Arr[icnt]<imin)
         {
            imin=Arr[icnt];
         }
      }
      
      
       return imin; 
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

      System.out.println(" Minimum number from array is "+  Minimum(Arr));







 
    sobj.close();
 }
    
}
