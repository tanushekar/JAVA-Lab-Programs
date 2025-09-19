import java.util.*;

class Book
{
    String name;
    int code, quantity;
    double price, totalPrice;
    
    Scanner sc= new Scanner(System.in); 
    
    void inputData()
    {
        System.out.print("\nEnter the name of the book: ");
        name= sc.nextLine();
        
        System.out.print("Enter the code of the book: ");
        code= sc.nextInt();
        
        System.out.print("Enter the price of the book: ");
        price= sc.nextDouble();
        
        System.out.print("Enter the number of the books required: ");
        quantity= sc.nextInt();
        
        totalPrice= quantity*price;
    }
    void outputData()
    {
        System.out.print(name+"\t\t"+code+"\t\t"+price+"\t\t"+quantity+"\t\t"+totalPrice);
        System.out.println();
    }
}

public class BookDetails
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int n= sc.nextInt();
        
        Book[] books= new Book[n];
        
        for(int i=0; i<n; i++)
        {
            books[i]= new Book();
            books[i].inputData();
        }
        
        System.out.println("\nNAME\t\tCODE\t\tUNIT PRICE\tQUANTITY\tTOTAL PRICE");
        
        for(int i=0; i<n; i++)
        {
            books[i].outputData();
        }
    } 
}
