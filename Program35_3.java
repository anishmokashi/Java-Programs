/*
3. Write Java program which accept array of characters from user and 
accept one character. Return occurrence of that character without 
considering case.
Input : b N e B R b A i G i B
b
Output : 4
                */
import java.util.Scanner;

class Program35_3
{
     public static int Search(String str, char var)
    {   char ch[]=str.toCharArray();
        int icnt=0,v_icnt=0;
        for(icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]==var)
            {
                v_icnt++;
            }
            
        }
        
       return v_icnt;
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int icnt=0;
        System.out.println("Enter string");
        String str=sobj.nextLine().toLowerCase();
        System.out.println("Enter which character you want to see occurence");
        char ch=sobj.next().charAt(0);

        
    
        System.out.println(ch+" is occured "+Search(str,ch)+" times");
        
        sobj.close();

    }
}
/*
 Note Assignment 35 in java is actual assignment 44 from pdf
 */