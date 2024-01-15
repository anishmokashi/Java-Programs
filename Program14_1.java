/*
1. Accept number from user and display below pattern.
Input : 5
Output : A B C D E
 */

import java.util.Scanner;

class Program14_1
{ 
        public static void Pattern(int iNo)
        {
            char alphabet='A';
            for(int icnt=0;icnt<iNo;icnt++)
            {    
                System.out.print("\t"+alphabet);
                alphabet++;
            }
        }
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
        Pattern(inum);

    }
}