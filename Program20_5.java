/*
5. Accept division of student from user and depends on the division 
display exam timing. There are 4 divisions in school as A,B,C,D. Exam 
of division A at 7 AM, B at 8.30 AM, C at 9.20 AM and D at 10.30 AM. 
(Application should be case insensitive)
Input : C
Output : Your exam at 9.20 AM
Input : d
Output : Your exam at 10.30 AM
 */
import java.util.Scanner;

class Program20_5
{
     public static void DisplaySchedule(char chdiv) 
    { 
        
       
            switch(chdiv)
            {
                case 'a': System.out.println("Your exam is at 7 AM");
                        break;
                case 'b': System.out.println("Your exam is at 8.30 AM");
                        break;
                case 'c': System.out.println("Your exam is at 9.20 AM");
                        break;
                case 'd': System.out.println("Your exam is at 10.30 AM");
                        break;
                default : System.out.println("Please enter a valid choice");
        

            }
   
    } 
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        System.out.println("Enter your division ");
        String str=sobj.nextLine().toLowerCase();
        char ch=str.charAt(0);
        
        DisplaySchedule(ch);
        sobj.close();

    }
}