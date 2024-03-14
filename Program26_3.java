/*
3.Write a program which accept number from user and return the 
count of digits in between 3 and 7.
Input : 2395 
Output : 1
Input : 1018
Output : 0
Input : 4521
Output : 2
Input : 9922
Output : 0
 */
import java.util.Scanner;

class Program26_3
{
     public static int  CountRange(int iNo)
    { 
        int ino_bckup=iNo,idigit=0,icnt=0;

        while(iNo!=0)
        {
            idigit=iNo%10;
            if(idigit>3&&idigit<7)
            {
                icnt++;
            }
            iNo=iNo/10;
        }
        return icnt;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
    

        System.out.println(" count of digits in between 3 and 7 : "+ CountRange(inum));

        
        sobj.close();

    }
}
/*
 Note Assignment 26 in java is actual assignment 35 from pdf
 */