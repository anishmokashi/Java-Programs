/*
3.Write a program to find factorial of given number. 
Input : 5 
Output : 120 (5 * 4 * 3 * 2 * 1)

Input : -5 
Output : 120 (5 * 4 * 3 * 2 * 1)

Input : 4 
Output : 24 (4 * 3 * 2 * 1)
 */

import java.util.Scanner;

public class Program6_3 {
 public static int Factorial(int iNo)
 {
        int ifact=1;
        if(iNo<0)
        {
                iNo=-iNo;
        }
    for(int icnt=iNo;icnt>=1;icnt--)
    {
        ifact=ifact*icnt;
    }
    return ifact;
 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a  number to find its factorial");
    int ival=sobj.nextInt();
    int iret=Factorial(ival);
    System.out.println("Factorial of "+ival+" is "+iret);
    sobj.close();
 }
    
}
