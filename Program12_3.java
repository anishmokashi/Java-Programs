/*
3. Accept N numbers from user and return the difference between largest 
and smallest number.
Input : N : 6
Elements :85 66 3 66 93 88
Output : 90 (93 -3)
 */

import java.util.Scanner;

public class Program12_3
 {
   public static int Difference(int[] Arr)
   { int imin=Arr[0],imax=Arr[0];
      for(int icnt=0;icnt<Arr.length;icnt++){
         if(Arr[icnt]<imin)
         {
            imin=Arr[icnt];
         }
         else if(Arr[icnt]>imax){
            imax=Arr[icnt];
         }
      }
      
      
       return imax-imin; 
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

      System.out.println(" Difference between largest and smallest number is  "+   Difference(Arr));







 
    sobj.close();
 }
    
}
