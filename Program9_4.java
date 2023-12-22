/*
4. Accept N numbers from user and display all such elements which are 
divisible by 3 and 5.
Input : N : 6
Elements :85 66 3 15 93 88
Output : 15

 */

import java.util.Scanner;

public class Program9_4 {
   public static void  Divisible_by_3_and_5(int[] Arr)
   { int count=0;
      
    System.out.println(" numbers from the array which are divisible by 3 & 5 are   ");
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]%3==0)&&(Arr[icnt]%5==0))
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

    Divisible_by_3_and_5(Arr);






 
    sobj.close();
 }
    
}
