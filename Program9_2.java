/*
2.Write a program which accept number from user and return the count of odd 
digits.

Input : 2395 
Output : 3
 
Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Output : 0

 */

import java.util.Scanner;

public class Program9_2 {
   public static void  Divisible_by_5(int[] Arr)
   { int count=0;
      
    System.out.println("numbers from the array which are divisible by 5 are   ");
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if(Arr[icnt]%5==0)
            {
               System.out.print(Arr[icnt]+"\t");
            }
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

    Divisible_by_5(Arr);






 
    sobj.close();
 }
    
}
