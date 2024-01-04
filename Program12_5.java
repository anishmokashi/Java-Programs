/*
5. Accept N numbers from user and display summation of digits of each 
number.
Input : N : 6
Elements :8225 665 3 76 953 858
Output : 17 17 3 13 17 21
 */

import java.util.Scanner;

public class Program12_5
 {
   public static void Digits(int[] Arr)
   {    
      int inum=0,isum=0,idigit=0;
      for(int icnt=0;icnt<Arr.length;icnt++){
         inum=Arr[icnt];
         while(inum!=0)
         {
            
           idigit=inum%10;
           isum=idigit+isum;
           inum=inum/10;
             
         }
         System.out.print(isum+"\t");
       
   
         isum=0;
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
   

      Digits(Arr);







 
    sobj.close();
 }
    
}
