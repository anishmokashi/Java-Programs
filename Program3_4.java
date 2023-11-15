/*
4.Write a program which accept number from user and return summation of all its 
non factors.
Input : 12
Output : 50

Input : 10
Output : 37
*/
import java.util.Scanner;
class Factors
{
    private int num1=0,NonFactsum=0;


    Factors(int ino1)
    {
        this.num1=ino1;
         
    }
    int SumNonFact()
    { 
      
        for(int icnt=1;icnt<num1;icnt++)
         { 
            
            if((num1%icnt)!=0)
            {
            NonFactsum=NonFactsum+icnt;
          
            }
        } 
            return NonFactsum;
        
    }

}
public class Program3_4 
{
    public static void main (String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter one number");
        int ival=sobj.nextInt();
        Factors fact=new Factors(ival);
        int iret=fact.SumNonFact();
        System.out.println("Summation of non factors of "+ival+" is "+iret);
        

        sobj.close();
    }
}
