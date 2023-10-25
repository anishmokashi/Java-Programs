/*Accept one number and check whether number is divisible by 5 or not */
import java.util.Scanner;
public class Program1_5 
{
    static  void Accept(int inum)
    {
        for(int icnt=1;icnt<=inum;icnt++)
        {
            System.out.println("*\n");
        }
    }
    public static void main(String Args[])
    {
        System.out.println("Enter a number to print that many number of starts on screen");
       Scanner sobj=new Scanner(System.in);

       int ival=sobj.nextInt();
        Accept(ival);


       sobj.close();
    }
}
