/*
2. Write a program which 2 strings from user and check whether 
contents of two strings are equal or not.
Input : “Marvellous Infosystems”
“Marvellous Infosystems”
Output : TRUE

 */
import java.util.Scanner;

class Program28_2
{
     public static boolean StrCmpX(String src, String dest)
    {   boolean bret=true;
       char s1[]=src.toCharArray();
       char s2[]=dest.toCharArray();
        for(int icnt=0;icnt<s1.length;icnt++)
        {
            if(s1[icnt]!=s2[icnt])
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
        System.out.println("Please enter first string");
        String str1=sobj.nextLine();
        

        System.out.println("Please enter second string");
        String str2=sobj.nextLine();

    
        
     
        System.out.println(StrCmpX(str1,str2));
        
        sobj.close();

    }
}
/*
 Note Assignment 28 in java is actual assignment 37 from pdf
 */