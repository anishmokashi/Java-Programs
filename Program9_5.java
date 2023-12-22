/*
5. Accept N numbers from user and display all such elements which are 
multiples of 11.
Input : N : 6
Elements :85 66 3 55 93 88
Output : 66 55 88

 */

import java.util.Scanner;

public class Program9_5 {
   public static void  Divisible_by_11(int[] Arr)
   { 
      
    System.out.println(" numbers from the array which are divisible by 11 are   ");
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%11==0))
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

    Divisible_by_11(Arr);






 
    sobj.close();
 }
    
}
