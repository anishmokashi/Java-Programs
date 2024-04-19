/*
5.Write a program which number from user and display below pattern. 
Input : 7846
Output :    6
            6 4
            6 4 8
            6 4 8 7
                */
import java.util.Scanner;


class Program40_5


{
   
     public static void Pattern(int ino)
    {  int ino_bckup=ino,iDigit=0,icnt=0,irev=0,irev_backup=0;
        while(ino!=0)
        {
            iDigit=ino%10;
        
            icnt++;
            ino=ino/10;
        }  
        ino=ino_bckup;
       
        
        for(int i=0;i<icnt;i++)
        { 
            for(int j=0;j<(i+1);j++)
            { 
                if(ino!=0)
                {iDigit=ino%10;
                System.out.print("\t"+iDigit);
                ino=ino/10;
                }
            }
            ino=ino_bckup;
         
            System.out.println();
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
 Note Assignment 40 in java is actual assignment 51 from pdf
 */