import java.util.*;
class Student
{
    int rollNumber;
    void readNumber(int n)
    {
        rollNumber=n;
    }
    void printNumber()
    {
        System.out.println("Roll number: "+rollNumber);
    }
}

class Test extends Student
{
    int sub1, sub2, sub3;
    
    void readMarks(int m1, int m2, int m3)
    {
        sub1= m1;
        sub2= m2;
        sub3= m3;
    }
    
    void printMarks()
    {
        System.out.println("Marks in Subject-1: "+sub1);
        System.out.println("Marks in Subject-2: "+sub2);
        System.out.println("Marks in Subject-3: "+sub3);
    }
}

class Results extends Test
{
    int total;
    
    static int highestTotal=0;
    static int highestTotalRollNo;
    
    static int highestSub1=0;
    static int highestSub1RollNo;
    
    static int highestSub2=0;
    static int highestSub2RollNo;
    
    static int highestSub3=0;
    static int highestSub3RollNo;
    
    void display()
    {
        total= sub1+sub2+sub3;
        printNumber();
        printMarks();
        System.out.print("Total marks: "+total);
        
        updateHighestMarks();
    }
    
    void updateHighestMarks()
    {
        if(total>highestTotal)
        {
            highestTotal=total;
            highestTotalRollNo=rollNumber;
        }
        if(sub1>highestSub1)
        {
            highestSub1=sub1;
            highestSub1RollNo=rollNumber;
        }
        if(sub2>highestSub1)
        {
            highestSub2=sub2;
            highestSub2RollNo=rollNumber;
        }
        if(sub1>highestSub3)
        {
            highestSub3=sub3;
            highestSub3RollNo=rollNumber;
        }
    }
    
    static void displayHighestMarks()
    {
        System.out.println("\nHighest total marks: "+highestTotal+"\nRoll no: "+highestTotalRollNo);
        System.out.println("\nHighest Sub-1 marks: "+highestSub1+"\nRoll no: "+highestSub1RollNo);
        System.out.println("\nHighest Sub-2 marks: "+highestSub2+"\nRoll no: "+highestSub2RollNo);
        System.out.println("\nHighest Sub-3 marks: "+highestSub3+"\nRoll no: "+highestSub3RollNo);
    }
}

public class StudentScore
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        
        System.out.print("Enter number of students: ");
        int n= sc.nextInt();
        
        Results[] students=new Results[n];
        
        for(int i=0; i<n; i++)
        {
            students[i]= new Results();
            System.out.print("\nEnter details of student-"+(i+1)+":");
            System.out.print("\nRoll number: ");
            students[i].readNumber(sc.nextInt());
            
            System.out.print("\nSUB-1 marks: ");
            int m1= sc.nextInt();
            System.out.print("\nSUB-2 marks: ");
            int m2= sc.nextInt();
            System.out.print("\nSUB-3 marks: ");
            int m3= sc.nextInt();
            
            students[i].readMarks(m1, m2, m3);
        }
        
        for(int i=0; i<n; i++)
        {
            students[i].display();
        }
        
        Results.displayHighestMarks();
    }
}
