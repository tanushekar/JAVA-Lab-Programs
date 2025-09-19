import java.util.*;
class CUBE
{
    float side;
    
    void Read()
    {
        System.out.print("\nEnter the side of the cube: ");
        Scanner sc= new Scanner(System.in);
        side= sc.nextFloat();
    }
    
    void Display()
    {
        System.out.println("VOLUME= "+(side*side*side));
        System.out.print("OUTER AREA=" +(6*side*side));
    }
}

public class  Main 
{
    public static void main(String []args)
    {
        CUBE[] A= new CUBE[3];
        int i;
        for(i=0; i<3; i++)
        {
            A[i]= new CUBE();
            
            A[i].Read();
            A[i].Display();
        }
    }
}
