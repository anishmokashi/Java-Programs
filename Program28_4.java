/*
4. Accept sing from user and reverse the contents of that string 
by toggling the case.
Input : “aCBdef”
Output : “FEDcbA”

 */
import java.util.Scanner;

class Program28_4
{
     public static String StrToggle(String str)
    {   char s1[]=str.toCharArray();
        for(int icnt=0;icnt<s1.length;icnt++)
        {
            if(s1[icnt]>='A' && s1[icnt]<='Z')
            {
                s1[icnt]=(char)(s1[icnt]+32);
            }
            else if(s1[icnt]>='a' && s1[icnt]<='z')
            {
                s1[icnt]=(char)(s1[icnt]-32);
            }
        }
        return new String(s1);
    }
    public static String StrRevX(String str)
    {
        char s1[]=str.toCharArray();
        char ctemp=' ';
        int istart=0,iend=s1.length-1;
        while(istart<iend)
        {
            ctemp=s1[istart];
            s1[istart]=s1[iend];
            s1[iend]=ctemp;
            istart++;
            iend--;
        }
        return new String(s1);
    }
        
    public static String StrRevToggleX(String str)
    { String str1="";
       str1=StrRevX(str);
       str1=StrToggle(str1);
       return str1;
   
    }
     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter  string");
        String str1=sobj.nextLine();

        // String strRet="";
        // strRet=StrToggle(str1);
        // strRet=StrRevX(strRet);
        
        System.out.println(StrRevToggleX(str1));
        
        sobj.close();

    }
}
/*
 Note Assignment 28 in java is actual assignment 37 from pdf
 */