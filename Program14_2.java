/*
2. Accept number from user and display below pattern.
Input : 5
Output : 5 # 4 # 3 # 2 # 1 #
 */

import java.util.Scanner;

class Program14_2
{ 
        public static void Pattern(int iNo)
        {
            int inum=iNo;
            for(int icnt=0;icnt<iNo;icnt++)
            {    
                System.out.print(inum+"\t"+"#"+"\t");
                inum--;
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