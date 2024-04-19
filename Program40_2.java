/*
2.Write a program which number from user and display below pattern. 
Input : 7846
Output : 7 8 4 6
        7 8 4 6
        7 8 4 6
        7 8 4 6
                */
import java.util.Scanner;


class Program40_2


{
   
     public static void Pattern(int ino)
    {  int ino_bckup=ino,iDigit=0,icnt=0,irev=0,irev_backup=0;
        while(ino!=0)
        {
            iDigit=ino%10;
            irev=irev*10+iDigit;
            icnt++;
            ino=ino/10;
        }  
        ino=ino_bckup;
        irev_backup=irev;
        for(int i=0;i<icnt;i++)
        {
            for(int j=0;j<icnt;j++)
            {
                iDigit=irev%10;
                System.out.print("\t"+iDigit);
                irev=irev/10;
            }
            ino=ino_bckup;
            irev=irev_backup;
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