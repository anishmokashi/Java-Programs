/*
2.Write a program which accept number from user and return the 
count of odd digits.
Input : 2395 
Output : 3
Input : 1018
Output : 2
Input : -1018
Output : 2
Input : 8462
Output : 0
 */
import java.util.Scanner;

class Program26_2
{
     public static int  CountOdd(int iNo)
    { 
        int ino_bckup=iNo,idigit=0,icnt_odd=0;

        while(iNo!=0)
        {
            idigit=iNo%10;
            if(idigit%2!=0)
            {
                icnt_odd++;
            }
            iNo=iNo/10;
        }
        return icnt_odd;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
    

        System.out.println(" Number of odd digits are "+ CountOdd(inum));

        
        sobj.close();

    }
}
/*
 Note Assignment 26 in java is actual assignment 35 from pdf
 */