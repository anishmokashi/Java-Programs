/*
5.Write a program which accept number from user and count frequency of such a 
digits which are less than 6.

Input : 2395 
Output : 3

Input : 1018
Output : 3

Input : 9440
Output : 3

Input : 96672
Output : 1

 */

import java.util.Scanner;

public class Program7_5 {
 public static int Count(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,iFreq=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit<=6)
      {
         iFreq++;
      }
      iNo_backup=iNo_backup/10;
   }


   return iFreq;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check if it is less than 6 or not");
    int ival=sobj.nextInt();
    System.out.println("Number of digits less than 6 are "+Count(ival));

 
    sobj.close();
 }
    
}
