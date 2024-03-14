/*
1. Write a java program which accepts 2 strings from user and 
concat N characters of second string after first string.Value of N 
should be accepted from user.
Note : If third parameter is greater than the size of second string 
then concat whole string after first string.
Input : “Marvellous Infosystems”
“Logic Building”
5
Output : “Marvellous Infosystems Logic”

 */
import java.util.Scanner;

class Program28_1
{
     public static  String StrNCatX(String src, String dest,int ival)
    {   
       String s1=src;//backing up the main string 
       int destlen=dest.length();

       StringBuffer stringBuffer =new StringBuffer();
       // we have used string buffer because we can edit strings here 
       if(ival>destlen)
       {
            stringBuffer.append(s1);
            stringBuffer.append(" ");
            stringBuffer.append(dest);
            src=stringBuffer.toString();// retriving string from the stringbuffer object

       }
       else
       {
        char s2[]=dest.toCharArray();
            stringBuffer.append(s1);
            stringBuffer.append(" ");
            for(int icnt=0;icnt<=ival;icnt++)
            {
                stringBuffer.append(s2[icnt]);
            }
            src=stringBuffer.toString();
       }
       return src;
    }
        
       
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter first string");
        String str1=sobj.nextLine();
        

        System.out.println("Please enter second string");
        String str2=sobj.nextLine();

        System.out.println("Please enter how many characters you want to append");
        int ival=sobj.nextInt();
        
        String sret=StrNCatX(str1,str2,ival);
        System.out.println("string after concatenation is "+sret);
        
        sobj.close();

    }
}
/*
 Note Assignment 28 in java is actual assignment 37 from pdf
 */