/*Accept one number and check whether number is divisible by 5 or not */
import java.util.Scanner;
public class Program1_4 
{
    static  boolean Check(int inum)
    {
        if(inum%5==0)
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
        System.out.println("Enter a number to check whether it is divisible by 5 or not");
       Scanner sobj=new Scanner(System.in);

       int ival=sobj.nextInt();
       boolean iRet=Check(ival);
       if(iRet==true)
       {
        System.out.println("number is divisible by 5");
       }
       else
       {
         System.out.println("number is not divisible by 5");
       }

       sobj.close();
    }
}
