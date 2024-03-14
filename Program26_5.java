/*
5.Write a program which accept number from user and return 
difference between summation of even digits and summation of odd 
digits.
Input : 2395 
Output : -15 (2 - 17)
Input : 1018
Output : 6 (8 - 2)
Input : 8440
Output : 16 (16 - 0)
Input : 5733
Output : -18 (0 - 18)
 */
import java.util.Scanner;

class Program26_5
{
     public static  int CountDiff(int iNo)
    { 
        int ino_bckup=iNo,idigit=0,icnt_even=0,icnt_odd=0;

        while(iNo!=0)
        {
            idigit=iNo%10;

            if(idigit%2==0)
            {
                icnt_even=icnt_even+idigit;
            }
            else if(idigit%2!=0)
            {
                icnt_odd=icnt_odd+idigit;
            }
            
            iNo=iNo/10;
        }
        return icnt_even-icnt_odd;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
    

        System.out.println("difference between summation of even digits and summation of odd \r\n" + //
                        "digits "+  CountDiff(inum));

        
        sobj.close();

    }
}
/*
 Note Assignment 26 in java is actual assignment 35 from pdf
 */