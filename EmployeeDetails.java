import java.util.*;

class EMPLOYEE
{
    int EmployeeID;
    String EmployeeName;
    String depName;
    double basicPay;
    double grossPay;
    double netPay;
    
    double incomeTax, additionalCharge;
    void getEmployeeDetails()
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter Employee ID: ");
        EmployeeID= sc.nextInt();
        
        System.out.print("Enter Employee name: ");
        sc.nextLine();
        EmployeeName= sc.nextLine();
        
        System.out.print("Enter Department name: ");
        depName= sc.nextLine();
        
        System.out.print("Enter Basic Pay: ");
        basicPay= sc.nextDouble();
        
        grossPay();
        netPay();
    }
    
    void grossPay()
    {
        double DA= 0.58*basicPay;
        double HRA= 0.16*basicPay;
        grossPay= basicPay+DA+HRA;
    }
    
    void netPay()
    {
        
        if(grossPay<=200000)
        {
            incomeTax=0.0;
        }
        else if(grossPay<=300000)
        {
            incomeTax= 0.10*grossPay;
        }
        else if(grossPay<=500000)
        {
            incomeTax= 0.15*grossPay;
        }
        else
        {
            incomeTax=0.30*grossPay;
            additionalCharge=0.02*incomeTax;
            incomeTax+= additionalCharge;
        }
        
        netPay= grossPay-incomeTax;
    }
    
    void displayEmployeeDetails()
    {
        System.out.println("Employee ID: "+EmployeeID);
        System.out.println("Employee Name: "+EmployeeName);
        System.out.println("Department: "+depName);
        System.out.println("Basic Pay: "+basicPay);
        System.out.println("Gross Pay: "+grossPay);
        System.out.println("Total Tax: "+incomeTax);
        System.out.println("Net Pay: "+netPay);
        
        System.out.println();
    }
}

public class EmployeeDetails
{
    public static void main(String []args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter number of employees: ");
        int n= sc.nextInt();
        
        EMPLOYEE[] employee= new EMPLOYEE[n];
        
        for(int i=0; i<n; i++)
        {
            employee[i]= new EMPLOYEE();
            System.out.println("Enter details for employee-"+(i+1)+":");
            
            employee[i].getEmployeeDetails();
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Details for employee-"+(i+1)+":");
            
            employee[i].displayEmployeeDetails();
        }
    }
}
