/*
3. Accept number from user and display below pattern.
Input : 5
Output : 1 * 2 * 3 * 4 * 5 *
 */

import java.util.Scanner;

class Program14_3
{ 
        public static void Pattern(int iNo)
        {
            
            for(int icnt=0;icnt<iNo;icnt++)
            {    
                System.out.print((icnt+1)+"\t"+"#"+"\t");
            
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