/*
2. Accept single digit number from user and print it into word. 
Input : 9 
Output : Nine

Input : -3
Output : Three 

Input : 12
Output : Invalid Number
 */

import java.util.Scanner;

public class Program6_2 {
 public static void Display(int iNo)
 {
    if(iNo<10)
    {
        
        switch(iNo)
        {
            case 1:System.out.println("One");
                    break;
            case 2:System.out.println("Two");
                    break;
            case 3:System.out.println("Three");
                    break;
            case 4:System.out.println("Four");
                    break;
            case 5:System.out.println("Five");
                    break;
            case 6:System.out.println("Six");
                    break;
            case 7:System.out.println("Seven");
                    break;
            case 8:System.out.println("Eight");
                    break;
            case 9:System.out.println("Nine");
                    break;
            // default : System.out.println("Invalid Number");
        }
    }

 }
 public static void main(String Arg[])
 {
    Scanner sobj=new Scanner(System.in);
    System.out.println("Enter a single digit number");
    int ival=sobj.nextInt();
    Display(ival);
    sobj.close();
 }
    
}
