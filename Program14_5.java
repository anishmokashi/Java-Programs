/*
5. Accept number from user and display below pattern.
Input : 8
Output : 2 4 6 8 10 12 14 16
 */

import java.util.Scanner;

class Program14_5
{ 
        public static void Pattern(int iNo)
        {
            
            for(int icnt=1;icnt<=iNo;icnt++)
            {    
                System.out.print(icnt*2+"\t");
            
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