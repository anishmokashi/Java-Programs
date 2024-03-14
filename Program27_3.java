/*
3. Write java program which accept N numbers from user and accept 
one another number as NO , return index of last occurrence of that NO.
Input : N : 6
NO: 66
Elements :85 66 3 66 93 88
Output : 3
Input : N : 6
NO: 93
Elements :85 66 3 66 93 88
Output : 4
Input : N : 6
NO: 12
Elements :85 11 3 15 11 111
Output : -1
 */
import java.util.Scanner;

class Program27_3
{
     public static int LastOcc(int Arr[],int no)
    { int icnt=0,iret=-1;
        for(icnt=Arr.length-1;icnt>=0;icnt--)
        {
            if(Arr[icnt]==no)
            {
                iret=icnt;
                break;
            }
        }
        return iret;
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
        System.out.println("last occurence of the "+inum+" is at "+LastOcc(Arr,inum));


        

        
        sobj.close();

    }
}
/*
 Note Assignment 27 in java is actual assignment 36 from pdf
 */