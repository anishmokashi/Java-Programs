/*
1. Write Java program which accept array of characters from user and 
replace each capital character with its corresponding small character.
Input : b N j B R b A d G G
Output : b n j b r b a d g g
                */
import java.util.Scanner;

class Program35_1
{
     public static  void ArrayReplace(String str)
    {   char ch[]=str.toCharArray();
        int icnt=0;
        for(icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]>='a' && ch[icnt]<='z')
            {
                ch[icnt]=(char)(ch[icnt]-32);
            }
            else if(ch[icnt]>='A' && ch[icnt]<='Z')
            {
                ch[icnt]=(char)(ch[icnt]+32); 
            }
        }
        
        for(icnt=0;icnt<ch.length;icnt++)
        {
            System.out.print(ch[icnt]+"\t");
        }
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        int icnt=0;
        System.out.println("Enter string");
        String str=sobj.nextLine();
        
    
         ArrayReplace(str);
        
        sobj.close();

    }
}
/*
 Note Assignment 35 in java is actual assignment 44 from pdf
 */