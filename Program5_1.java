/*
1.Write a program which accept number from user and print that number of $ & * 
on screen.

Input : 5
Output : $ * $ * $ * $ * $ *

Input : 3
Output : $ * $ * $ *

Input : -3
Output : $ * $ * $ * 
 */
import java.util.Scanner;
public class Program5_1 {

    public static void Pattern(int ino)
    {  
        if(ino<0)
        {
            ino=-ino;
        }
        for(int icnt=1;icnt<=ino;icnt++)
        {
            System.out.print("$\t*\t");
        }
 
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter a number");
        int ino=sc.nextInt();
        
       
        Pattern(ino);
       

        sc.close();

        
    }
}
