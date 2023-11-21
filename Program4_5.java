/*
5. Write a program which accept total marks & obtained marks from user and 
calculate percentage. 
Input : 1000 745 
Output : 74.5% 
 */
import java.util.Scanner;
public class Program4_5 {

    public static float Percentage(float Total_Mks,float Scored_Mks)
    { 
      System.out.println(Scored_Mks);
      System.out.println(Total_Mks);
        System.out.println(((Scored_Mks/Total_Mks)*100));
        
        return ((Scored_Mks/Total_Mks)*100);
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter total marks and scored marks");
        float ino1=sc.nextFloat();
        float ino2=sc.nextFloat();
       
        float iret=Percentage(ino1,ino2);
        System.out.println(iret+"%");

        sc.close();

        
    }
}
