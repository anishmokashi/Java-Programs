/*
4. Accept Character from user and check whether it is special symbol 
or not (!, @, #, $, %, ^, &, *).
Input : %
Output : TRUE
Input : d
Output : FALSE
 */
import java.util.Scanner;

class Program21_4
{
     public static boolean ChkSpecial(char ch) 
    { boolean bret=false;
       
        if(ch=='!' || ch=='@' || ch=='#' || ch=='$' || ch=='%' || ch=='^' || ch=='&'||ch=='*')
        {

        
            bret=true;
        }
        return bret;
        
    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.print("Please enter a character ");
        String str=sobj.nextLine();
        char ch=str.charAt(0); 
        
        System.out.print(ChkSpecial(ch));
        sobj.close();

    }
}