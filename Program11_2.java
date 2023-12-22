/*
2. Accept N numbers from user and accept one another number as NO , 
return index of first occurrence of that NO.

Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 1

Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1

 */

import java.util.Scanner;

public class Program11_2 {
   public static int FirstOcc(int[] Arr,int search_num)
   { int iret=-1;
      
    
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]==search_num))
            {
                 iret=icnt;
                 break;
            }

         } 
         
        return iret;
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

         System.out.println("First occurence of "+search_num+" is at index "+FirstOcc(Arr,search_num));







 
    sobj.close();
 }
    
}
