/* Accept one number from user and if number is less than 10 then print "Hello otherwise print "Demo" */
import java.util.Scanner;

public class Program2_3 
{
    static void Display(int inum1)
    {
        if(inum1<10)
        {
           System.out.println("Hello"); 
        }
        else
        {
            System.out.println("Demo");
        }
    }
    public static void main(String arg[])
    {
        System.out.println("Please enter a number");
        Scanner sobj=new Scanner(System.in);
        int iVal=sobj.nextInt();

        Display(iVal);

        sobj.close();
    } 
}
