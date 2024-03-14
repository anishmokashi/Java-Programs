/*
4. Write java program which accept N numbers from user and accept 
Range, Display all elements from that range
Input : N : 6
Start: 60
End : 90
Elements :85 66 3 76 93 88
Output : 66 76 88
Input : N : 6
Start: 30
End : 50
Elements :85 66 3 76 93 88
Output :
 */
import java.util.Scanner;

class Program27_4
{
     public static  void Display(int Arr[],int istart, int iend)
    { int icnt=0;
        for(icnt=0;icnt<Arr.length;icnt++)
        {
            if(Arr[icnt]>istart &&Arr[icnt]<iend)
            {
                System.out.print(Arr[icnt]+"\t");

            }
        }
       
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter size of array");
        int isize=sobj.nextInt();
        System.out.println("Please enter start number ");
        int start=sobj.nextInt();

        System.out.println("Please enter end number ");
        int end=sobj.nextInt();


        int Arr[]=new int[isize];
        System.out.println("Enter "+isize+" elements");
        for(int icnt=0;icnt<Arr.length;icnt++)
        {
            Arr[icnt]=sobj.nextInt();
        }
        Display(Arr,start,end);


        

        
        sobj.close();

    }
}
/*
 Note Assignment 27 in java is actual assignment 36 from pdf
 */