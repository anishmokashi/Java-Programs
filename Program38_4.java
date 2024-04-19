/*
4. Write a program which accept matrix and check whether the matrix is 
identity matrix or not.
Identity matrix is a square matrix with 1’s along the diagonal from upper left to 
lower right and 0’s in all other positions. 
If it satisfies the structure as explained before then the matrix is called as 
identity matrix.
Input :
        1 0 0 0
        0 1 0 0
        0 0 1 0
        0 0 0 1
Output :
        True
                */
import java.util.Scanner;


class Program38_4

{
     public static  boolean ChkIdentity(int Arr[][])
    {  boolean bret=false;
        
        for(int i=0;i<Arr.length;i++)
        {
            for( int j=0;j<Arr.length;j++)
            { 
               
               if(i==j)
               {
                bret=true;
               }
                
            }
            
        }
        return bret;
            
            

        
     
            
        }
    public static void Display(int Arr[][])
    {  
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                System.out.print(Arr[i][j]+"\t");
            }
            System.out.println();

        }
    
        
    }

     

    

    
    public static void main(String arg[])
    {
        Scanner sobj=new Scanner(System.in);
        
        System.out.println("Enter elements from left to right ");
        int Arr[][]=new int[4][4];
        for(int i=0;i<Arr.length;i++)
        {
            for(int j=0;j<Arr.length;j++)
            {
                Arr[i][j]=sobj.nextInt();
            }
        }
 
        Display(Arr);
        System.out.println(ChkIdentity(Arr));
        
        Display(Arr);
        sobj.close();

    }
}
/*
 Note Assignment 38 in java is actual assignment 48 from pdf
 */