/*
1.Write a java program which accept number from user and return the 
count of even digits.
Input : 2395 
Output : 1

Input : 1018
Output : 2

Input : -1018
Output : 2

Input : 8462
Output : 4
 */
import java.util.Scanner;

class Program26_1
{
     public static int CountEven(int iNo)
    { 
        int ino_bckup=iNo,idigit=0,icnt_even=0;

        while(iNo!=0)
        {
            idigit=iNo%10;
            if(idigit%2==0)
            {
                icnt_even++;
            }
            iNo=iNo/10;
        }
        return icnt_even;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
    

        System.out.println(" Number of even digits are "+CountEven(inum));

        
        sobj.close();

    }
}
/*
 Note Assignment 26 in java is actual assignment 35 from pdf
 */