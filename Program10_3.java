/*
3. Accept N numbers from user check whether that numbers contains 11 in 
it or not.

Input : N : 6
Elements :85 66 11 80 93 88
Output : 11 is present

Input : N : 6
Elements :85 66 3 80 93 88
Output : 11 is absent

 */

import java.util.Scanner;

public class Program10_3 {
   public static boolean Check(int[] Arr)
   { boolean bret=false;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]==11))
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

   //  System.out.println("Please tell us which number you want to search from the array");
   //  int search_num=sobj.nextInt();
      if(Check(Arr))
      {
         System.out.println(" 11 is present in the array");
      }
      else{
         System.out.println(" 11 is not present in the array");
      }
    






 
    sobj.close();
 }
    
}
