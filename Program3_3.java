/*
3.Write a program which accept number from user and display all its non factors.
Input : 12
Output : 5 7 8 9 10 11

Input : 13
Output : 2 3 4 5 6 7 8 9 10 11 12

Input : 10
Output : 3 4 6 7 8 9
*/
import java.util.Scanner;
class Factors
{
    private int num1;


    Factors(int ino1)
    {
        this.num1=ino1;
         
    }
    void NonFact()
    { 
        System.out.println("Displaying  Non Factors  for "+num1);
        for(int icnt=1;icnt<num1;icnt++)
         { 
            
            if((num1%icnt)!=0)
            {
            System.out.print(icnt+"\t");
          
            }
        } 

        
    }

}
public class Program3_3 
{
    public static void main (String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter one number");
        int ival=sobj.nextInt();
        Factors fact=new Factors(ival);
        fact.NonFact();
        

        sobj.close();
    }
}
