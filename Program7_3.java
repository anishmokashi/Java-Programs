/*
3.Write a program which accept number from user and count frequency of 2 in it.
Input : 2395 
Output : 1

Input : 1018
Output : 0

Input : 9000
Output : 0

Input : 922432
Output : 3

 */

import java.util.Scanner;

public class Program7_3 {
 public static int CountTwo(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,iFreq=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit==2)
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
    System.out.println("Enter a  number to check if it contains two or not");
    int ival=sobj.nextInt();
    System.out.println("Number of 2 in the digit is "+CountTwo(ival));

 
    sobj.close();
 }
    
}
