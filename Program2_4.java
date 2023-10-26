/* Accept two numbers from user and display first number in secind number of times.
 Input : 12 5
 Output : 12 12 12 12 12
 */
import java.util.Scanner;

public class Program2_4
{
    static void Display(int inum1,int iFreq)
    {
        for (int icnt=1;icnt<=iFreq;icnt++)
        {
            System.out.println(inum1);
        }
    }
    public static void main(String arg[])
    {
        System.out.println("Please enter a number");
        Scanner sobj=new Scanner(System.in);
        int iVal=sobj.nextInt();
        System.out.println("Please enter how many times you want to see that number");
        int ifreq=sobj.nextInt();
        Display(iVal,ifreq);

        sobj.close();
    } 
}
