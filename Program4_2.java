/*
2. Write a program which accept one number from user and check whether that 
number is greater than 100 or not.
Input : 101 
Output : Greater 
Input : 39 
Output : Smaller 
 */
import java.util.Scanner;
public class Program4_2 {

    public static Boolean CheckGreater(int ival)
    { 
      
        if(ival>100)
        {
            return true; 
        }
        else
        {
            return false;
        }
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter a number");
        int ino=sc.nextInt();
        boolean iret=CheckGreater(ino);
        if(iret==true)
        {
            System.out.println("Greater");
        }
        else
        {
            System.out.println("Smaller ");
        }
        

        sc.close();

        
    }
}
