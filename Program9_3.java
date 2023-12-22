/*
3. Accept N numbers from user and display all such elements which are 
even and divisible by 5.
Input : N : 6
Elements :85 66 3 80 93 88
Output : 80

 */

import java.util.Scanner;

public class Program9_3 {
   public static void  Even_and_Divisible_by_5(int[] Arr)
   { int count=0;
      
    System.out.println("even numbers from the array which are divisible by 5 are   ");
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%2==0)&&(Arr[icnt]%5==0))
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

    Even_and_Divisible_by_5(Arr);






 
    sobj.close();
 }
    
}
