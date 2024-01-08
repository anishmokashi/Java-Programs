/*
2. Design application for income tax department to calculate tax amount. According to the 
income tax department there is no income tax for the income less than 5 lakhs. 
If income is in between 5 to 10 lakhs then there will be 10% tax. 
If income is in between 10 to 20 lakhs then there will be 20% tax. 
And for more than 20 lakhs there will be 30% tax. 
We have to accept gross income from user and return the tax amount.
Input : 600000 Output : 10000 (0 + 10000)
Input : 450000 Output : 0
Input : 1200000 Output : 90000 (0 + 50000 + 40000)
Input : 8200000 Output : 2110000 (0 + 50000 + 200000 + 1860000)
 */

import java.util.Scanner;
 class ITD
{
    private double income;
    
   

    public ITD(double annual_income)
    {
        
        this.income=annual_income;
      
    }
    public double IncomeTax()
    {
        double taxAmount=0.00;

    
    if (income <= 500000) {
            // No tax for income less than or equal to 5 lakhs
            taxAmount = 0;
        } else if (income <= 1000000) {
            // 10% tax for income between 5 to 10 lakhs
            taxAmount = 0.1 * (income - 500000);
        } else if (income <= 2000000) {
            // 10% on first 5 lakhs + 20% tax for income between 10 to 20 lakhs
            taxAmount = 0.1 * 500000 + 0.2 * (income - 1000000);
        } else {
            // 10% on first 5 lakhs + 20% on next 10 lakhs + 30% tax for income more than 20 lakhs
            taxAmount = 0.1 * 500000 + 0.2 * 1000000 + 0.3 * (income - 2000000);
        }
        

        return taxAmount;
    }




}
public class Program13_2 {
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Please enter your gross annual income in lakhs");
        double gross_income=sobj.nextDouble();

        ITD IncomeTaxDepartment=new ITD(gross_income);
        double dret=IncomeTaxDepartment.IncomeTax();

        System.out.println("Taxable amount from your income is "+dret);
    }
    
}
