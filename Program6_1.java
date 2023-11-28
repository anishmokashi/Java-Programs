/*
 1. Write a program which accept number from user and if number is less than 50 
then print small , if it is greater than 50 and less than 100 then print medium, if it is 
greater than 100 then print large.
Input : 75 
Output : Medium 
 */

import java.util.Scanner;

public class Program6_1 {
 public static void Number(int iNo)
 {
    if(iNo<50)
    {
        System.out.println("Small");
    }
    else if(iNo>50&&iNo<100)
    {
        System.out.println("Medium");
    }
    else
    {
        System.out.println("Large");
    }
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a number");
    int ival=sobj.nextInt();
    Number(ival);
    sobj.close();
 }
    
}
