/*
2.Write a program which accept number from user and display its factors in 
decreasing order.

Input : 12
Output : 6 4 3 2 1
 
Input : 13
Output : 1

Input : 10
Output : 5 2 1
*/
import java.util.Scanner;
class Factors
{
    private int num1;


    Factors(int ino1)
    {
        this.num1=ino1;
         
    }
    void FactRev()
    { 
        System.out.println("Displaying Factors in reverse order for "+num1);
        for(int icnt=num1-1;icnt>=1;icnt--)
         { 
            
            if((num1%icnt)==0)
            {
            System.out.print(icnt+"\t");
          
            }
        } 

        
    }

}
public class Program3_2 
{
    public static void main (String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter one number");
        int ival=sobj.nextInt();
        Factors fact=new Factors(ival);
        fact.FactRev();
        

        sobj.close();
    }
}
