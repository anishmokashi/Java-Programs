/*
 1. Write a program which accept name from user and print that name. 
Input : Piyush Khairnar 
Output : Piyush Khairnar 
 */
import java.util.Scanner;
public class Program4_1 {
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter name");
        String Name=sc.nextLine();

        System.out.println("Name is "+Name);

        sc.close();

        
    }
}
