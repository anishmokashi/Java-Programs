/*Write a program to print five times marvellous on screen*/
import java.util.Scanner;

public class Program1_2 
{
    static void Display(int icount)
    {
        for(int icnt=1;icnt<=icount;icnt++)
        {
            System.out.println("Marvellous\n");
        }
    }
    public static void main(String Args[])
    {
        Scanner sobj=new Scanner(System.in);
         System.out.println("Enter the number to display that many times marvellous on screen");
         int iVal1=sobj.nextInt();

         Display(iVal1);

         sobj.close();

    }
}
