/*
4. Accept N numbers from user and display all such numbers which contains 
3 digits in it.
Input : N : 6 
Elements :8225 665 3 76 953 858
Output : 665 953 858
 */

import java.util.Scanner;

public class Program12_4
 {
   public static void Digits(int[] Arr)
   {    System.out.println("Numbers which have 3 digits are : ");
      int inum=0,icount=0;
      for(int icnt=0;icnt<Arr.length;icnt++){
         inum=Arr[icnt];
         while(inum!=0)
         {
            
            inum=inum/10;
            icount++;
             
         }
       
         if(icount==3)
         {

            System.out.print(Arr[icnt]+"\t");
         }
         icount=0;
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
