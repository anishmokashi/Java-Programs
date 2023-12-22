/*
5. Accept N numbers from user and accept one another number as NO , 
return frequency of NO form it.

Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 2

Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : 0

 */

import java.util.Scanner;

public class Program10_5{
   public static int Frequency(int[] Arr,int search_num)
   { int ifreq=0;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]==search_num))
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

    System.out.println("Please tell us which number you want to search from the array");
    int search_num=sobj.nextInt();
      
      System.out.println("Frequency of "+search_num+" in array is "+Frequency(Arr,search_num));
    






 
    sobj.close();
 }
    
}
