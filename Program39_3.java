/*
3.Write a program which number from user and display below pattern. 
Input : 7846
Output :    7 6 5 4 3 2 1
            8 7 6 5 4 3 2 1
            4 3 2 1
            6 5 4 3 2 1
                */
import java.util.Scanner;


class Program39_3

{
     public static void Pattern(int ino)
    {  int ino_bckup=ino,idigit=0;
       while(ino!=0)
       {
            idigit=ino%10;
            for(int icnt=idigit;icnt>=0;icnt--)
            {
                System.out.print("\t "+(icnt+1));
            }
            System.out.println();
            ino=ino/10;
       }
       ino=ino_bckup;                       
    }
    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter a number ");
        int ival=sobj.nextInt();
        Pattern(ival);
        sobj.close();

    }
}
/*
 Note Assignment 39 in java is actual assignment 49 from pdf
 */