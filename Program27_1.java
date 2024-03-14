/*
1. Write java program which accept N numbers from user and accept 
one another number as NO , check whether NO is present or not.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : TRUE
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : FALSE
 */
import java.util.Scanner;

class Program27_1
{
     public static  boolean Check(int Arr[],int no)
    { boolean bret=false;
        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            if(Arr[icnt]==no)
            {
                bret=true;
                break;
            }
        }
        return bret;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter size of array");
        int isize=sobj.nextInt();
        System.out.println("Please enter number you want to search in the array");
        int inum=sobj.nextInt();

        int Arr[]=new int[isize];
        System.out.println("Enter "+isize+" elements");
        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }
        System.out.println(Check(Arr,inum));


        

        
        sobj.close();

    }
}
/*
 Note Assignment 27 in java is actual assignment 36 from pdf
 */