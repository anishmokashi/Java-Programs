/*
2. Write Java program which accept array of characters from user and 
count number of vowels and return count of it.
Input : b N e B R b A i G i
Output : 4

*/
import java.util.Scanner;

class Program35_2
{
     public static int ArrayCountVowels(String str)
    {   char ch[]=str.toCharArray();
        int icnt=0,v_icnt=0;
        for(icnt=0;icnt<ch.length;icnt++)
        {
            if(ch[icnt]=='a' || ch[icnt]=='e' ||ch[icnt]=='i'||ch[icnt]=='o'||ch[icnt]=='u')
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
        
    
        System.out.println("Number of vowels in the given string are "+ArrayCountVowels(str));
        
        sobj.close();

    }
}
/*
 Note Assignment 35 in java is actual assignment 44 from pdf
 */