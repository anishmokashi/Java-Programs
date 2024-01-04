/*
 1. Design application for hotel. According to the management team of hotel they are giving 
discount on total bill amount of customer. 
If bill bill amount is less than 500 then there is no discount , if bill amount is less than 1500 
and more than 500 they give 10% discount. 
And if the bill amount is more than 1500 then they give 15% discount. 
Our application should accept total bill amount and depends on the discount policy we have 
to return the amount after applying discount.

Input : 1200 Output : 1080
Input : 290 Output : 290
Input : 3700 Output : 3145
 */

import java.util.Scanner;
 class hotel
{
    private int total_bill_amt;

    public hotel(int total_bill_amt)
    {
        this.total_bill_amt=total_bill_amt;
    }
    public double Display_amount_after_discount()
    {
        double bret=0.00;
        if(total_bill_amt<500)
        {
            bret= this.total_bill_amt;
        }
        
        else if((total_bill_amt>500) &&( total_bill_amt<1500))
        {
            bret=(this.total_bill_amt) -(this.total_bill_amt*0.1);
        }
        else if(total_bill_amt>1500)
        {
            bret=(this.total_bill_amt) -(this.total_bill_amt*0.15);
        }
        return bret;
    }




}
public class Program13_1 {
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Please enter the total bill amount");
        int bill_amt=sobj.nextInt();

        hotel hotel_obj=new hotel(bill_amt);
        double dret=hotel_obj.Display_amount_after_discount();

        System.out.println("Total bill after discount is "+dret);
    }
    
}
