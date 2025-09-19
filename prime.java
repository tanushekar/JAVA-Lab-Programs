public class prime{
    public static void main(String args[])
    {
        int n1= Integer.parseInt(args[0]);
        int n2= Integer.parseInt(args[1]);
        System.out.println("The prime numbers between "+n1+" and "+n2+" is: ");
        
        for(int n=n1; n<=n2; n++)
        {
            int flag=1;
            for(int i=2; i<=(n/2); i++)
            {
                if(n%i ==0)
                {
                    flag=0;
                    break;
                }
            }
            if(flag==1)
            {
                System.out.print(n+" ");
            }
        }
    }
}
