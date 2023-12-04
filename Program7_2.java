/*
2.Write a program which accept number from user and check whether it contains 0 
in it or not.

Input : 2395 
Output : There is no Zero

Input : 1018
Output : It Contains Zero

Input : 9000
Output : It Contains Zero

Input : 10687
Output : It Contains Zero

 */

import java.util.Scanner;

public class Program7_2 {
 public static boolean ChkZero(int iNo)
 { boolean bret=false;
    int iNo_backup=iNo,iDigit=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit==0)
      {
         bret=true;
         break;
      }
      iNo_backup=iNo_backup/10;
   }
  

   return bret;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check if it contains zero or not");
    int ival=sobj.nextInt();
    boolean bret=ChkZero(ival);
    if(bret)
    {
      System.out.println("It contains zero");
    }
    else
    {
       System.out.println("It dosen't contains zero");  
    }
 
    sobj.close();
 }
    
}
