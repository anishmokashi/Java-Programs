/*
4. We have to design application for tourist company. 
Tourist company provides cars on rent. 
Depends on the running of car they apply rent. 
If running is less than 100 kilometres then they charge 25 rupees per kilometre . 
And if running is more than 100 kilometres then they apply 15 rupees per kilometre after 
100 kilometres. 
We have to accept number of kilometres from user and return the estimated rent.
Input : 73 Output : 1825
Input : 132 Output : 2980
Input : 189 Output : 3835
 */

import java.util.Scanner;
 class Tourist_Company
{

    private int running;
    Tourist_Company(int running)
    {
        this.running=running;
    }
    int kilometer_driven()
    {
        int estimated_rent=0; 
        if(running<=100)
        {
            estimated_rent=running*25;
        }
        else if(running>100)
        {
            estimated_rent=running*15;
        }
        return estimated_rent;
    }



}
public class Program13_4 {
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter how much your running will be ");

        int running=sobj.nextInt();

        Tourist_Company tourist_Company=new Tourist_Company(running);

        System.out.println("rent for "+running+" kms is "+tourist_Company.kilometer_driven());
        
        
    }
    
}
