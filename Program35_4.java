/*
4. Write Java program which accept array of characters from user and 
return difference between frequency of capital and frequency of small 
characters.
Input : b N e B R b A I O G i
Output : 3 (7 - 4)
                */
import java.util.Scanner;

class Program35_4
{
     public static   int  Diffrence(String str)
    {  char ch[]=str.toCharArray();
        int icnt=0,c_icnt=0,s_icnt=0;
        for(icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='a' && ch[icnt]<='z')
            {
                s_icnt++;
            }
            else if(ch[icnt]>='A' && ch[icnt]<='Z')
            {
               c_icnt++;
            }
            
        }
        
       return c_icnt-s_icnt;
    }

     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int icnt=0;
        System.out.println("Enter string");
        String str=sobj.nextLine();

        System.out.println("Difference between captial and small characters is "+Diffrence(str));
        
        sobj.close();

    }
}
/*
 Note Assignment 35 in java is actual assignment 44 from pdf
 */