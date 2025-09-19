import java.util.Arrays;
import java.util.Scanner;

class MergeArray
{
    int [] array1;
    int [] array2;
    
    MergeArray()
    {}
    
    MergeArray(int[] a, int[] b)
    {
        array1= a;
        array2= b;
    }
    
    public int[] Merging()
    {
        int aLength= array1.length;
        int bLength= array2.length;
        
        int [] c= new int[aLength+bLength];
        
        for(int i=0; i<aLength; i++)
        {
            c[i]= array1[i];
        }
        
        for(int i=0; i<bLength; i++)
        {
            c[aLength+i]= array2[i];
        }
        
        return c;
    }
    
    public int[] sortArray(int[] A)
    {
        Arrays.sort(A);
        return A;
    }
    
    public void display(int[] A)
    {
        for(int i:A)
           System.out.print(i+ " ");
        System.out.println();
    }
    
    public int[] takeInput(String statement, Scanner sc)
    {
        System.out.println(statement);
        int n= sc.nextInt();
        
        int[] arr= new int[n];
        
        System.out.println("Enter "+n+" elements in unsorted order: \n");
        for(int i=0; i<n; i++)
        {
            arr[i]= sc.nextInt();
        }
        return arr;
    }
    
    public static void main(String []args)
    {
        MergeArray obj1= new MergeArray();
        MergeArray obj2= new MergeArray();
        
        Scanner sc= new Scanner(System.in);
        
        int[] a= obj1.takeInput("Enter number of elements for array-1: ", sc);
        int[] b= obj2.takeInput("Enter number of elements for array-2: ", sc);
        
        MergeArray obj= new MergeArray(a, b);
        
        int[] d= obj.Merging();
        int[] sortedArray= obj.sortArray(d);
        
        System.out.print("The sorted array is: ");
        obj.display(sortedArray);
    }
}
