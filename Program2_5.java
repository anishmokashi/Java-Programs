/*
 Accept number from user and check whether number is even or odd
 */
import java.util.Scanner;;
public class Program2_5 
{
    static boolean ChkEven(int ino)
    {
        if(ino%2==0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    public static void main(String arg[])
    {
        System.out.println("Please enter a number");
        Scanner sobj=new Scanner(System.in);
        int iVal=sobj.nextInt();
        
        if(ChkEven(iVal))
        {
            System.out.println("Number you entered is even");
        }
        else
        {
            System.out.println("Number you entered is odd");
        }
        

        sobj.close();
    } 
}
