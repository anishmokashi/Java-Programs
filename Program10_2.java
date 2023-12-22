/*
2. Accept N numbers from user and return difference between frequency of 
even number and odd numbers.
Input : N : 7
Elements :85 66 3 80 93 88 90
Output : 1 (4 -3)

 */

import java.util.Scanner;

public class Program10_2 {
   public static int Frequency(int[] Arr)
   { int even_icount=0,odd_icount=0;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%2==0))
            {
                  even_icount++;
            }
            else
            {
               odd_icount++;
            }
         } 
         
        return even_icount-odd_icount;
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

    System.out.println("Difference between even and odd numbers in the array is "+Frequency(Arr));






 
    sobj.close();
 }
    
}
