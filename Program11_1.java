/*
1. Accept N numbers from user and accept one another number as NO , 
check whether NO is present or not.

Input : N : 6
   NO: 66
   Elements :85 66 3 66 93 88
Output : TRUE

Input : N : 6
   NO: 12
   Elements :85 11 3 15 11 111
Output : FALSE

 */

import java.util.Scanner;

public class Program11_1 {
   public static boolean Check(int[] Arr,int search_num)
   { boolean bret=false;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]==search_num))
            {
                  bret=true;
            }

         } 
         
        return bret;
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
      System.out.println("Please tell us which number you want to search from the array");
      int search_num=sobj.nextInt();

         System.out.println(Check(Arr,search_num));







 
    sobj.close();
 }
    
}
