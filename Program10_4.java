/*
4. Accept N numbers from user and return frequency of 11 form it.

Input : N : 6
Elements :85 66 3 15 93 88
Output : 0

Input : N : 6
Elements :85 11 3 15 11 111
Output : 2


 */

import java.util.Scanner;

public class Program10_4 {
   public static int Frequency(int[] Arr)
   { int ifreq=0;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]==11))
            {
               ifreq++;
            }

         } 
         
        return ifreq;
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

    System.out.println("Frequency of 11 in the array is "+Frequency(Arr));






 
    sobj.close();
 }
    
}
