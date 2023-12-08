/*
5.Write a program which accept number from user and return difference between 
summation of even digits and summation of odd digits.

Input : 2395 
Output : -15 (2 - 17)

Input : 1018
Output : 6 (8 - 2)

Input : 8440
Output : 16 (16 - 0)

Input : 5733
Output : -18 (0 - 18)

 */

import java.util.Scanner;

public class Program8_5 {
 public static int CountDiff(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,icnt_even=0,icnt_odd=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit%2==0)
      {
         icnt_even=icnt_even+iDigit;
      }
      else
      {
         icnt_odd=icnt_odd+iDigit;
      }
      
      iNo_backup=iNo_backup/10;
   }


   return icnt_even-icnt_odd;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check difference between summation of even and odd digits");
    int ival=sobj.nextInt();
    System.out.println("Difference is  "+CountDiff(ival));

 
    sobj.close();
 }
    
}
