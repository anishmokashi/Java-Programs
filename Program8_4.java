/*
4.Write a program which accept number from user and return multiplication of all 
digits.
Input : 2395 
Output : 270

Input : 1018
Output : 8

Input : 9440
Output : 144

Input : 922432
Output : 864

 */

import java.util.Scanner;

public class Program8_4 {
 public static int MultDigits(int iNo)
 { 
    int iNo_backup=iNo,iDigit=0,imult=1;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      if(iDigit==0){iDigit=1;}
      imult=imult*iDigit;
      iNo_backup=iNo_backup/10;
   }


   return imult;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to check multiplication of all digits");
    int ival=sobj.nextInt();
    System.out.println("multiplication of all digits is  "+MultDigits(ival));

 
    sobj.close();
 }
    
}
