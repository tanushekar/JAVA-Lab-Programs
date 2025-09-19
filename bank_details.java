import java.util.*;

abstract class Bank
{
    char bankType;
    double interest;
    boolean offerCreditCard;
    
    abstract void getRoi();
    
    void deposit()
    {
        bankType='v';
        interest=0.0;
        offerCreditCard= false;
    }
}

class BankDetails extends Bank
{
    Scanner sc= new Scanner(System.in);
    
    double termDeposit=0;
    int term=0;
    
    void getRoi()
    {
        if(bankType=='n')
        {
            offerCreditCard=false;
            if(term>=3)
               interest=0.07*termDeposit*term;
        }
        else
        {
            offerCreditCard=true;
            if(term>=3)
               interest= 0.08*termDeposit*term;
        }
    }
    //override
    void deposit()
    {
        System.out.print("Enter type of bank:\n'n' for nationalised\n'i'for international\n");
        
        bankType= sc.next().charAt(0);
        
        if(bankType=='i'||bankType=='n')
        {
            System.out.print("Enter amount to be deposited: ");
            termDeposit=sc.nextDouble();
            
            System.out.print("Enter the term for which money is to be deposited(in yrs): ");
            term=sc.nextInt();
            
            getRoi();
        }
        else
            System.out.println("Invalid bank type..");
    }
    
    void display()
    {
        String bank;
        
        if(bankType=='n')
           bank="Nationalised Bank";
        else if(bankType=='i')
           bank="International Bank";
        else
           bank="Invalid bank type";
           
        System.out.println("Type of bank: "+bank);
        System.out.println("Amount deposited: "+termDeposit);
        System.out.print("Interest accrued over "+term+" years: ");
        System.out.printf("%.3f", interest);
        
        if(offerCreditCard)
           System.out.println("\nEligible for platinum card");
        else
           System.out.println("\nNOT eligible for platinum card");
    }
}

public class BANKDETAILS{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of banks: ");
        int n=sc.nextInt();
        
        BankDetails[] bank=new BankDetails[n];
        
        for(int i=0; i<n; i++)
        {
            bank[i]= new BankDetails();
            System.out.println("Enter details for bank-"+(i+1));
            bank[i].deposit();
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.println("\nDetails of bank-"+(i+1)+":");
            bank[i].display();
        }
    }
}
