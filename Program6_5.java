/*
5. Write a program which accept number from user and display its table in reverse 
order. 
Input : 2
Output : 20 18 16 14 12 10 8 6 4 2

Input : 5
Output : 50 45 40 35 30 25 20 15 10 5

Input : -5
Output : 50 45 40 35 30 25 20 15 10 5
 */

import java.util.Scanner;

public class Program6_5 {
 public static void Table(int iNo)
 {
    System.out.println("Printing table of "+iNo+" in reverse order");
    for(int icnt=10;icnt>=1;icnt--)
    {
        System.out.println(iNo+" * "+icnt+" = "+iNo*icnt);
    }
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to print its table");
    int ival=sobj.nextInt();
    Table(ival);
 
    sobj.close();
 }
    
}
