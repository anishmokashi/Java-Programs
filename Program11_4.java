/*
4. Accept N numbers from user and accept Range, Display all elements from 
that range

Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 66 76 88

Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :

 */

import java.util.Scanner;

public class Program11_4 {
   public static void Range(int[] Arr,int start_inum,int end_inum)
   { 
      
      System.out.print("Elements : ");
         for(int icnt=0;icnt<Arr.length;icnt++)
         {
            if((Arr[icnt]>start_inum)&&(Arr[icnt]<end_inum))
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
      System.out.println("Please enter start and end number to print numbers between them");
      int start_inum=sobj.nextInt();
      int end_inum=sobj.nextInt();
      Range(Arr,start_inum,end_inum);







 
    sobj.close();
 }
    
}
