/*
4. Write a program which accepts N from user and print all odd numbers up to N.
Input : 18 
Output : 1 3 5 7 9 11 13 

 */
import java.util.Scanner;
public class Program5_5 {

    public static void oddDisplay(int ino)
    {  
        
        for(int icnt=1;icnt<=5;icnt++)
        { 
           
                System.out.print(ino*icnt+"\t");
          
            
        }
 
       
    }
    public static void main(String Args[])
    {
        Scanner sc=new Scanner(System.in);
       
        System.out.println("Please enter a number");
        int ino=sc.nextInt();
        
       
       oddDisplay(ino);
       

        sc.close();

        
    }
}
