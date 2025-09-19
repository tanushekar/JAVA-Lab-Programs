import java.util.*;

class StackException extends Exception
{
    StackException(String str)
    {
        super(str);
    }
}

class Stack
{
    private final int[] stk;
    private int top;
    
    Stack(int size)
    {
        stk= new int[size];
        top=-1;
    }
    
    void push(int item) throws StackException
    {
        if(top==stk.length-1)
           throw new StackException("Stack overflow!");
        else
           stk[++top]=item;
           System.out.println("Element pushed onto stack");
    }
    
    int pop() throws StackException
    {
        if(top==-1)
           throw new StackException("Stack underflow!");
        else
           return stk[top--];
    }
    
    void peek()
    {
        if(top==-1)
           System.out.println("Stack underflow!");
        else
           System.out.println("Peek element: "+stk[top]);
    }
    
    void display()
    {
        if(top>-1)
        {
            System.out.println("The stack elements are: ");
            for(int i=top; i>=0; i--)
               System.out.print(stk[i]+"\n");
        }
        else
           System.out.println("Stack undeflow!");
    }
}

public class StackImplementation
{
    public static void main(String[] args)
    {
        Scanner sc= new Scanner(System.in);
        System.out.print("Enter stack size: ");
        int size= sc.nextInt();
        
        Stack StkObj= new Stack(size);
        int ch;
        
        do
        {
            System.out.println("MENU\n1.Push\n2.Pop\n3.Peek\n4.Display\n0.Exit");
            System.out.print("Enter choice: ");
            ch= sc.nextInt();
            
            switch(ch)
            {
                case 1: try
                        {
                          System.out.print("Enter element to be pushed: ");
                          StkObj.push(sc.nextInt());
                        }
                        catch(StackException e)
                        {
                          System.out.println("Exception caught: "+e); 
                        }
                        break;
                        
                case 2: try
                        {
                            System.out.print("Popped element: "+StkObj.pop());
                        }
                        catch(StackException e)
                        {
                            System.out.println("Exception caught: "+e);
                        }
                        break;
                
                case 3: StkObj.peek();
                        break;
                        
                case 4: StkObj.display();
                        break;
                
                case 0: break;
                
                default: System.out.println("Invalid choice..");
                           
            }
        }while(ch!=0);
    }
}
