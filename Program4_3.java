/*
3. Write a program which accept two numbers and check whether numbers are 
equal or not. 

Input : 10 10 
Output : Equal 

Input : 10 12 
Output : Not Equal

Input : 10 -10 
Output : Not Equal 
 */
import java.util.Scanner;
public class Program4_3 {

    public static Boolean CheckEqual(int ival1,int ival2)
    { 
      
        if(ival1==ival2)
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
       
        System.out.println("Please enter two numbers");
        int ino1=sc.nextInt();
        int ino2=sc.nextInt();
        boolean iret=CheckEqual(ino1,ino2);
        if(iret==true)
        {
            System.out.println("Equal");
        }
        else
        {
            System.out.println("Not Equal");
        }
        

        sc.close();

        
    }
}
