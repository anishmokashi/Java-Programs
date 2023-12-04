/*
4.Write a program which accept number from user and count frequency of 4 in it.
Input : 2395 
Output : 0

Input : 1018
Output : 0

Input : 9440
Output : 2

Input : 922432
Output : 1

 */

import java.util.Scanner;

public class Program7_4 {
 public static int CountFour(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,iFreq=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit==4)
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
    System.out.println("Enter a  number to check if it contains four or not");
    int ival=sobj.nextInt();
    System.out.println("Number of 4 in the digit is "+CountFour(ival));

 
    sobj.close();
 }
    
}
