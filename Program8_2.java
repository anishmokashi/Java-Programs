/*
2.Write a program which accept number from user and return the count of odd 
digits.

Input : 2395 
Output : 3
 
Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Output : 0

 */

import java.util.Scanner;

public class Program8_2 {
 public static int CountOdd(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,icnt_odd=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit%2!=0)
      {
         icnt_odd++;
      }
      iNo_backup=iNo_backup/10;
   }


   return icnt_odd;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check how many odd digits it has");
    int ival=sobj.nextInt();
    System.out.println("Count of odd number in digit is "+CountOdd(ival));

 
    sobj.close();
 }
    
}
