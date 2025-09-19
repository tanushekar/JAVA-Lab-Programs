public class fibonacci
{
    public static void main(String args[])
    {
        int n= Integer.parseInt(args[0]);
        System.out.println("Fibonacci numbers upto "+n+ " is: ");
     
        int f=0, f1=0, f2=1;
        for(int i=0; i<n; i++)
        {
          System.out.println(f1);
          f=f1+f2;
          f1=f2;
          f2=f;
        }
    }
}

import java.util.*;
public class fibonacci
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter N: ");
        int n= sc.nextInt();
        
        System.out.println("Fibonacci numbers upto "+ n + " is: ");
     
        int f=0, f1=0, f2=1;
        for(int i=0; i<n; i++)
        {
          System.out.println(f1);
          f=f1+f2;
          f1=f2;
          f2=f;
        }
    }
}
