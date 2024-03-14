/*
5. Accept string from user and check whether the string is 
palindrome or not without considering its case.
Input : “1abccBA1”
Output : TRUE

 */
import java.util.Scanner;

class Program28_5
{
     public static  boolean StrPallindrome(String str)
    { boolean bret=true;
        str=str.toLowerCase();
        char s1[]=str.toCharArray();
        int iEnd=s1.length-1;
        for(int icnt=0;icnt<s1.length/2;icnt++,iEnd--)
        {
            if(s1[icnt]!=s1[iEnd])
            {
                bret=false;
                break;
            }
        }
        return bret;
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter  string");
        String str1=sobj.nextLine();

       
        
        System.out.println(StrPallindrome(str1));
        
        sobj.close();

    }
}
/*
 Note Assignment 28 in java is actual assignment 37 from pdf
 */