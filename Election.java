import java.util.*;

class voteCounter
{
    int totalVotes=0;
    int spoiltBallot=0;
    
    void counting(int[] count)
    {
        Scanner sc= new Scanner(System.in);
        System.out.println("(Enter '0' to exit voting)\n");
        
        while(true)
        {   
            System.out.print("Enter the candidate number for whom you wish to vote: ");
            int vote= sc.nextInt();
            if(vote>=1 && vote<=5)
            {
                totalVotes++;
                System.out.println("Valid vote!");
                switch(vote)
                {
                    case 1: count[0]++;
                            break;
                    case 2: count[1]++;
                            break;
                    case 3: count[2]++;
                            break;
                    case 4: count[3]++;
                            break;
                    case 5: count[4]++;
                            break;
                }
            }
            else if(vote==0)
            {
                break;
            }
            else
            {
                totalVotes++;
                System.out.println("Spoilt ballot!");
                spoiltBallot++;
            }
        }
    }
    
    void display(int[] count)
    {
        System.out.println("\n****ELECTION RESULTS*****\n");
        System.out.println("Total number of votes: "+totalVotes);
        
        for(int i=0; i<5; i++)
        {
            System.out.println("Candidate-"+(i+1)+" has got "+count[i]+" votes");
            System.out.println();
        }
        
        System.out.println("Number of spoilt ballots: "+spoiltBallot);
    }
}

public class Election
{
    public static void main(String [] args)
    {
        int[] candidates= new int[5];
        voteCounter obj= new voteCounter();
        
        obj.counting(candidates);
        obj.display(candidates);
    }
}
