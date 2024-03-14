/*
5. Write java program which accept N numbers from user and return 
product of all odd elements.
Input : N : 6
Elements :15 66 3 70 10 88

Output : 45
Input : N : 6
Elements :44 66 72 70 10 88
Output : 0
 */
import java.util.Scanner;

class Program27_5
{
     public static  int Product(int Arr[])
    { int icnt=0,odd_product=1;
        for(icnt=0;icnt<Arr.length;icnt++)
        {
            if(Arr[icnt]%2!=0)
            {
                odd_product=odd_product*Arr[icnt];

            }
        }
        if(odd_product==1)
        {
            return 0;
        }
        else
        {
            return odd_product;
        }
       
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter size of array");
        int isize=sobj.nextInt();
        

        int Arr[]=new int[isize];
        System.out.println("Enter "+isize+" elements");
        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }
        System.out.println("product is "+Product(Arr));


        

        
        sobj.close();

    }
}
/*
 Note Assignment 27 in java is actual assignment 36 from pdf
 */