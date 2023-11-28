/*
4.Write a program which accept number from user and display its table. 
Input : 2
Output : 2 4 6 8 10 12 14 16 18 20

Input : 5
Output : 5 10 15 20 25 30 35 40 45 50

Input : -5
Output : 5 10 15 20 25 30 35 40 45 50
 */

import java.util.Scanner;

public class Program6_4 {
 public static void Table(int iNo)
 {
    System.out.println("Printing table of "+iNo);
    for(int icnt=1;icnt<=10;icnt++)
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
