/*
1.Write a program which accept number from user and display its digits in reverse 
order.
   Input : 2395 
   Output : 5
            9
            3
            2
   
   Input : 1018
   Output : 8
            1
            0
            1

Input : -1018
Output : 8
1
0
1

Input : 9000
Output : 0
0
0
9


 */

import java.util.Scanner;

public class Program7_1 {
 public static void Display_Digit(int iNo)
 {
    int iNo_backup=iNo,iDigit=0;
   while(iNo_backup!=0)
   {
      iDigit=iNo_backup%10;
      System.out.print(iDigit);
      iNo_backup=iNo_backup/10;
   }

 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to see its digits in reverse");
    int ival=sobj.nextInt();
    Display_Digit(ival);
 
    sobj.close();
 }
    
}
