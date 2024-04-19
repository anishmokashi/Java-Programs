/*
2. Write a program which number from user and display below 
pattern. 
Input : 7846
Output :    1 2 3 4 5 6 7
            1 2 3 4 5 6 7 8 
            1 2 3 4
            1 2 3 4 5 6
                */
import java.util.Scanner;


class Program39_2

{
     public static void Pattern(int ino)
    {  int ino_bckup=ino,idigit=0;
       while(ino!=0)
       {
            idigit=ino%10;
            for(int icnt=0;icnt<idigit;icnt++)
            {
                System.out.print("\t "+(icnt+1));
            }
            System.out.println();
            ino=ino/10;
       }                       
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