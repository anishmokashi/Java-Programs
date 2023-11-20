/*
4. Write a program which accept three numbers and print its multiplication. 
Input : 5 4 7 
Output : 140 

Input : 5 0 7 
Output : 35 

Input : 5 0 0 
Output : 5 

Input : 0 0 0 
Output : 0
 */
import java.util.Scanner;
public class Program4_4 {

    public static int multiply(int ival1,int ival2,int ival3)
    { 
      
        if(ival1==0)
        {
            ival1=1; 
        }
        if(ival2==0)
        {
            ival2=1; 
        }
         if(ival3==0)
        {
            ival3=1;
        }
 
        
        return ival1*ival2*ival3;
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter three numbers");
        int ino1=sc.nextInt();
        int ino2=sc.nextInt();
        int ino3=sc.nextInt();
        int iret=multiply(ino1,ino2,ino3);
        System.out.println("Multiplication of three numbers is "+iret);

        sc.close();

        
    }
}
