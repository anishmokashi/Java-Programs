/*
1. Write a program which displays ASCII table. Table contains symbol, 
Decimal, Hexadecimal and Octal representation of every member from 
0 to 255.
 */
import java.util.Scanner;

class Program21_1
{
     public static void  DisplayASCII() 
    {  System.out.printf("Dec\t Hex\t Oct \n");
        for(int icnt=0;icnt<=255;icnt++)
        {
        System.out.printf(icnt+"\t 0"+Integer.toHexString(icnt)+"\t 0X"+Integer.toOctalString(icnt)+"\n"); 
        }
   
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        DisplayASCII();
        sobj.close();

    }
}