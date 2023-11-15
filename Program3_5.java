/*
5.Write a program which accept number from user and return difference between 
summation of all its factors and non factors.
 
Input : 12
Output : -34 (16 - 50)

Input : 10
Output : -29 (8 - 37)
*/
import java.util.Scanner;
class Factors
{
    private int num1=0,NonFactsum=0,Factsum=0;


    Factors(int ino1)
    {
        this.num1=ino1;
         
    }
    int FactDiff()
    { 
      
        for(int icnt=1;icnt<num1;icnt++)
         { 
            
            if((num1%icnt)!=0)
            {
            NonFactsum=NonFactsum+icnt;
          
            }
            else
            {
                
                Factsum=Factsum+icnt;
            }
        } 
            return Factsum-NonFactsum;
        
    }

}
public class Program3_5 
{
    public static void main (String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter one number");
        int ival=sobj.nextInt();
        Factors fact=new Factors(ival);
        int iret=fact.FactDiff();
        System.out.println("Difference between factors and non factors is "+iret);
        

        sobj.close();
    }
}
