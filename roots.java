public class roots
{
    public static void main(String args[])
    {
        double a= Integer.parseInt(args[0]);
        double b= Integer.parseInt(args[1]);
        double c= Integer.parseInt(args[2]);
        
        double disc, r1, r2;
        disc= (Math.pow(b, 2))-(4*a*c);
        
        if(disc>0)
        {
            System.out.println("Roots are real and distinct");
            r1= (-b +Math.sqrt(disc))/ (2*a);
            r2= (-b -Math.sqrt(disc))/ (2*a);
            System.out.println("Root-1: " +r1+ "\nRoot-2: "+r2);
        }
        else if(disc==0)
        {
            System.out.println("Roots are real and equal");
            r1= r2= (-b)/(2*a);
            System.out.println("Root-1= Root-2= "+r1);
        }
        else
          System.out.println("Imaginary roots..");
        
    }
}
