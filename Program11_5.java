/*
5. Accept N numbers from user and return product of all odd elements.

Input : N : 6
Elements :15 66 3 70 10 88
Output : 45

Input : N : 6
Elements :44 66 72 70 10 88
Output : 0

 */

import java.util.Scanner;

public class Program11_5 {
   public static int Product(int[] Arr)
   { int iproduct=1;
      
      
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%2!=0))
            {
                 iproduct=iproduct*Arr[icnt];
            }

            

         } 
         if(iproduct==1)
         {
            return 0;
         }
         else{
            return iproduct;
         }
      
        
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

      System.out.println("Product of all odd numbers is "+Product(Arr));







 
    sobj.close();
 }
    
}
