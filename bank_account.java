import java.util.*;
class ACCOUNT
{
    private int AccNo;
    private String name;
    private double balance;
    private String AccType;
    
    Scanner sc= new Scanner(System.in);
    
    ACCOUNT()
    {
        this.AccNo=0;
        this.name= " ";
        this.balance=0.0;
        this.AccType= " ";
    }
    
    void getDetails()
    {
        System.out.println("Enter the account number: ");
        AccNo= sc.nextInt();
        
        System.out.println("Enter the account holder's name: ");
        name= sc.next();
        
        System.out.println("Enter the balance amount: ");
        balance= sc.nextDouble();
        
        System.out.println("Enter the account type: ");
        AccType= sc.next();
    }
    
    void printDetails()
    {
        System.out.println("Account Number\t\tName\t\tBalance\t\tAcc Type");
        System.out.println(AccNo+"\t\t"+name+"\t\t"+balance+"\t\t"+AccType);
    }
    
    void deposit()
    {
        double amt;
        System.out.println("Enter amt to be deposited: ");
        amt= sc.nextDouble();
        balance+= amt;
        System.out.println("Amt deposited..\nCurrent Balance:Rs. "+balance);
    }
    
    void withdrawal()
    {
        double amt;
        System.out.println("Enter amt to be withdrwan: ");
        amt= sc.nextDouble();
        if(balance>=amt)
        {
            balance-=amt;
            System.out.println("Transaction successful..\nCurrent Balance: Rs."+balance);
        }
        else
        {
            System.out.println("Insufficient balance..Transaction failed\n");
        }
    }
    
    boolean search(int acn)
    {
        if(acn==AccNo)
        {
            printDetails();
            return true;
        }
        else
          return false;
    }  
}

public class EXECUTEACCOUNT
{
    public static void main(String args[])
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter the number of acc holders: ");
        int n= sc.nextInt();
        
        ACCOUNT holder[]= new ACCOUNT[n];
        
        for(int i=0; i<n; i++)
        {
            holder[i]= new ACCOUNT();
            System.out.println("For account-"+ (i+1) +":");
            holder[i].getDetails();
        }
        
        int choice;
        do{
            System.out.println("MAIN MENU\n1.Display details of all holders\n2.Search details by acc number\n");
            System.out.println("3.Deposit\n4.Withdraw\n5.EXIT\n");
            
            System.out.println("Enter choice: ");
            choice= sc.nextInt();
            
            switch(choice)
            {
                case 1: for(int i=0; i<n; i++)
                           holder[i].printDetails();
                        break;
                
                case 2: System.out.print("\nEnter acc number: ");
                        int acn= sc.nextInt();
                        
                        boolean found= false;
                        
                        for(int i=0; i<n; i++)
                        {
                            found= holder[i].search(acn);
                            
                            if(found)
                               break;
                        }
                        
                        if(!found)
                        {
                           System.out.println("Account number doesn't exist\n");
                        }
                        break;
                        
                case 3: System.out.print("Enter account number: ");
                        int ac= sc.nextInt();
                        
                        boolean dep= false;
                        for(int i=0; i<n; i++)
                        {
                            dep= holder[i].search(ac);
                            if(dep)
                            {
                                holder[i]. deposit();
                                break;
                            }
                        }
                        if(!dep)
                        {
                          System.out.println("\nSearch failed...Account doesn't exist\n");
                        }
                        break;
                        
                case 4: System.out.println("Enter account number: ");
                        int acc=sc.nextInt();
                        
                        boolean fou= false;
                        for(int i=0; i<n; i++)
                        {
                            fou= holder[i].search(acc);
                            
                            if(fou)
                            {
                                holder[i].withdrawal();
                                break;
                            }
                        }
                        if(!fou)
                        {
                           System.out.print("\nSearch failed...Account doesn't exist\n");
                        }
                        break;
                        
                case 5: System.out.println("Thank you");
                        break;
            }
        }while(choice!=5);
    }
}
