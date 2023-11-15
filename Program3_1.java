/*
1.Write a program which accept number from user and display its multiplication of factors 
 Input : 12 (1*2*6*24)
 Output :144

 Input : 13 (1)
 Output :1

 Input : 10 (1*2*10)
 Output :10
*/
import java.util.Scanner;
class Factors
{
    private int num1,imult_fact=1;


    Factors(int ino1)
    {
        this.num1=ino1;
         
    }
    int MultiFact()
    {
        for(int icnt=1;icnt<num1;icnt++)
         { 
          
            if((num1%icnt)==0)
            {
            this.imult_fact=this.imult_fact*icnt;
          
            }
        } 

        return this.imult_fact;
    }

}
public class Program3_1 
{
    public static void main (String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter one number");
        int ival=sobj.nextInt();
        Factors fact=new Factors(ival);
        int iret=fact.MultiFact();
        System.out.println("Multiplication of factors is "+iret);

        sobj.close();
    }
}
