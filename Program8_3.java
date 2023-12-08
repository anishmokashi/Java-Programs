/*
3.Write a program which accept number from user and return the count of digits in 
between 3 and 7.

Input : 2395 
Output : 1

Input : 1018
Output : 0

Input : 4521
Output : 2

Input : 9922
Output : 0

 */

import java.util.Scanner;

public class Program8_3 {
 public static int CountRange(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,icnt=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit>3 && iDigit <7)
      {
         icnt++;
      }
      iNo_backup=iNo_backup/10;
   }


   return icnt;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check how many digits are between 3 and 7");
    int ival=sobj.nextInt();
    System.out.println("Count  digits between 3 and 7  is "+CountRange(ival));

 
    sobj.close();
 }
    
}
