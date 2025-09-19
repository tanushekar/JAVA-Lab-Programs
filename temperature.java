import java.util.*;

class temperatureInfo
{
    void input(double arr[][])
    {
        System.out.println("Enter the maximum temp(in celsius) for first 6 days of January ");
        Scanner sc= new Scanner(System.in);
        
        for(int i=0; i<5; i++)
        {
            System.out.print("\nFor City-"+(i+1)+":\n");
            for(int j=0; j<6; j++)
            {
                System.out.print("\nEnter temp on Day-"+(j+1)+": ");
                arr[j][i]= sc.nextDouble();
            }
        } 
    }
    
    void HighestAndLowest(double arr[][])
    {
        double high= arr[0][0];
        double low= arr[0][0];
        
        int cityH=0, cityL=0;
        int dayH=0, dayL=0;
        int i,j;
        
        for(i=0; i<6; i++)
        {
            for(j=0; j<5; j++)
            {
                if(arr[i][j]>= high)
                {
                    high= arr[i][j];
                    cityH= j+1;
                    dayH= i+1;
                }
                if(arr[i][j]<= low)
                {
                    low= arr[i][j];
                    cityL=j+1;
                    dayL=i+1;
                }
            }
        }
        
        System.out.println("Highest temperature is "+high+" on day-"+dayH+" in city-"+cityH);
        System.out.println("Lowest temperature is "+low+" on day-"+dayL+" in city-"+cityL);
    }
}


public class temperature
{
  public static void main (String args[])
    {
      double arr[][]= new double[10][10];
      temperatureInfo temp= new temperatureInfo();
      temp.input(arr);
      temp.HighestAndLowest(arr);
    }
}
