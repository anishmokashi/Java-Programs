/* Accept one number from user and print that number of * on the screen (using while loop)*/
import java.util.Scanner;
class Program2_2
{
    static void Display(int inum1)
    {
        // for (int icnt=1;icnt<=inum1;icnt++)
        // {
        //     System.out.println("*");
        // }
        while(inum1>0)
        {
             System.out.println("*");
             inum1--;
        }
    }
    public static void main(String arg[])
    {
        System.out.println("Please enter how many stars you want to see");
        Scanner sobj=new Scanner(System.in);
        int iVal=sobj.nextInt();

        Display(iVal);

        sobj.close();
    }
}