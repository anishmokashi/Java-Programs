/*
2.Write a program which accept number from user and print numbers till that 
number. 
Input : 8 
Output : 1 2 3 4 5 6 7 8  
 */
import java.util.Scanner;
public class Program5_2 {

    public static void Display(int ino)
    {  
        if(ino<0)
        {
            ino=-ino;
        }
        for(int icnt=1;icnt<=ino;icnt++)
        {
            System.out.print(icnt+"\t");
        }
 
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter a number");
        int ino=sc.nextInt();
        
       
        Display(ino);
       

        sc.close();

        
    }
}
