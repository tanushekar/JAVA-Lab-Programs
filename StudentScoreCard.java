import java.util.*;
class Student
{
    int rollNumber;
    
    void readNumber(int n)
    {
        rollNumber= n;
    }
    
    void printNumber()
    {
        System.out.println("Roll No: "+rollNumber);
    }
}

class Test extends Student
{
    int sub1, sub2;
    
    void readMarks(int m1, int m2)
    {
        sub1= m1;
        sub2= m2;
    }
    
    void printMarks()
    {
        System.out.println("Marks in Subject-1: "+sub1);
        System.out.println("Marks in Subject-2: "+sub2);
    }
}

interface Sports 
{
    void readWt(double n);
    void printWt();
}

class Results extends Test implements Sports
{
    double SportWt, total;
    
   public void readWt(double n)
    {
        SportWt=n;
    }
    
    public void printWt()
    {
        System.out.println("Sports Weightage: "+SportWt);
    }
    
    void display()
    {
        total= sub1+sub2+SportWt;
        printNumber();
        printMarks();
        printWt();
        System.out.println("Total Marks: "+total);
    }
}

public class StudentScoreCard
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int n= sc.nextInt();
        
        Results[] student= new Results[n];
        
        for(int i=0; i<n; i++)
        {
            student[i]= new Results();
            
            System.out.println("Enter details of student-"+(i+1));
            System.out.print("Enter roll number: ");
            student[i].readNumber(sc.nextInt());
            
            System.out.print("Enter marks in Test-1: ");
            int m1= sc.nextInt();
            
            System.out.print("Enter marks in Test-2: ");
            int m2= sc.nextInt();
            
            student[i].readMarks(m1, m2);
            
            System.out.print("Enter sports weightage: ");
            student[i].readWt(sc.nextDouble());
            
            System.out.println();
        }
        
        for(int i=0; i<n; i++)
        {
            System.out.println("Details of student-"+(i+1));
            student[i].display();
        }
    }
}
