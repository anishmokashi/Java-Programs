/*
3.Write a program which accept string from user and toggle the case.
Input : “Marvellous Multi OS”
Output : mARVELLOUS mULTI os
 */
import java.util.Scanner;

class Program23_3
{
     public static void strtogglex(char ch[]) 
    { 
    
        
        int itemp=0;
        
        
        for(int icnt=0;icnt<ch.length-1;icnt++)
        {
            if(ch[icnt]>='A' && ch[icnt]<='Z')
            {
                itemp=ch[icnt];//type casting character to integer 
                itemp=itemp+32;//converting capital to small using ascii value
               
                ch[icnt]=(char)itemp;//typecasting integer ascii value to character and putting back in the array

            }
            else if(ch[icnt]>='a' && ch[icnt]<='z')
            {
                itemp=ch[icnt];//type casting character to integer 
                itemp=itemp-32;//converting small to captial using ascii value
               
                ch[icnt]=(char)itemp;//typecasting integer ascii value to character and putting back in the array

            }
            
        
          
        
            
        }
       
           System.out.println(ch);

     

    }

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Please enter a string ");
        String str=sobj.nextLine();
        char ch[]=str.toCharArray(); 
         strtogglex(ch);
       
        
        
        
        sobj.close();

    }
}