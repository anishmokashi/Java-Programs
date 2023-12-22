/*
1. Accept N numbers from user and return difference between summation 
of even elements and summation of odd elements.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 53 (234 - 181)

 */

import java.util.Scanner;

public class Program9_1 {
   public static int Difference(int[] Arr)
   { int even_sum=0,odd_sum=0;
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
               if((Arr[icnt]%2)==0)
               {
                  even_sum=even_sum+Arr[icnt];
               }
               else
               {
                  odd_sum=odd_sum+Arr[icnt];
               }
         } 
         
         return even_sum-odd_sum;
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



         int iret=Difference(Arr);


    System.out.println(" Difference between summation \r\n" + 
          "of even elements and summation of odd elements is  "+iret);

 
    sobj.close();
 }
    
}
