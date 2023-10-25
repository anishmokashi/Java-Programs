/*Program to divide two numbers */
import java.util.Scanner;
class Program1_1
{  
static float Divide(int iNo1,int iNo2)
 {
    if(iNo2==0)
    {
        return -1;
    }
    return iNo1/iNo2;
 }
    public static void main(String Args[])
    {
        Scanner Sobj=new Scanner(System.in);
        System.out.println("Enter first number ");
        int iVal1=Sobj.nextInt();
        System.out.println("Enter second number ");
        int iVal2=Sobj.nextInt();

        float iRet=Divide(iVal1,iVal2);
        System.out.println("Division of numbers is "+iRet);
        Sobj.close();
    }
}