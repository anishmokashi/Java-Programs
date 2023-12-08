/*
1.Write a program which accept number from user and return the count of even 
digits.
Input : 2395 
Output : 1

Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Output : 4

 */

import java.util.Scanner;

public class Program8_1 {
 public static int CountEven(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,icnt_even=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit%2==0)
      {
         icnt_even++;
      }
      iNo_backup=iNo_backup/10;
   }


   return icnt_even;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check how many even digits it has");
    int ival=sobj.nextInt();
    System.out.println("Count of even number in digit is "+CountEven(ival));

 
    sobj.close();
 }
    
}
