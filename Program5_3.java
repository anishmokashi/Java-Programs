/*
3. Write a program which accept number from user and print its numbers line. 
Input : 4 
Output : -4 -3 -2 -1 0 1 2 3 4 
 */
import java.util.Scanner;
public class Program5_3 {

    public static void Display(int ino)
    {  
        int ino_negative=-ino;
        for(int icnt=ino_negative;icnt<=ino;icnt++)
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
