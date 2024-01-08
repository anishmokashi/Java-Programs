/*
3. Design application for school management system. 
As school is primary there are 4 standards from 1 to 4. 
School fees of each standard is different. 
For first standard fees are 8900, for second standard 12790, for third standard 21000 and 
for fourth standard fees are 23450. 

Input : 2 Output : 12790
Input : 4 Output : 23450
Input : 6 Output : Wrong input
 */

import java.util.Scanner;
 class School
{

    private int standard;
    School(int standard)
    {
        this.standard=standard;
    }
    double s_m_s()
    { 
        int iret=0;
        switch (standard) {
            case 1:
                iret=8900;
                break;
            case 2:
                iret=12790;
                break;
            case 3:
                iret=21000;
                break;
            case 4:
                iret=23450;
                break;
            default:System.out.println("Please enter valid input");
                break;
        }

    }



}
public class Program13_3 {
    public static void main(String Arg[])
    {
        Scanner sobj=new Scanner(System.in);

        System.out.println("Please enter in which class");

        int standard=sobj.nextInt();
        School school=new School(standard);

        System.out.println("Fees for "+standard+" is "+school.s_m_s());
        
        
    }
    
}
