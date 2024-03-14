/*
4.Write a program which accept number from user and return 
multiplication of all digits.
Input : 2395 
Output : 270
Input : 1018
Output : 8
Input : 9440
Output : 144
Input : 922432
Output : 864
 */
import java.util.Scanner;

class Program26_4
{
     public static  int Multiply(int iNo)
    { 
        int ino_bckup=iNo,idigit=0,imul=1;

        while(iNo!=0)
        {
            idigit=iNo%10;
            if(idigit==0)
            {
                idigit=1;
            }
            imul=idigit*imul;
            iNo=iNo/10;
        }
        return imul;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a number");
        int inum=sobj.nextInt();
    

        System.out.println(" multiplication of all digits is "+  Multiply(inum));

        
        sobj.close();

    }
}
/*
 Note Assignment 26 in java is actual assignment 35 from pdf
 */