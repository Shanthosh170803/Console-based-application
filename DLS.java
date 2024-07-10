import java.util.*;
public class DLS {
    public static void main(String args[]){
        ResourceTable obj=new ResourceTable();
        Scanner sc=new Scanner(System.in);
        System.out.println("!!!............This is a 10 Overs Cricket match so Enter the details suitable for 10 overs............!!!");
        System.out.println("Enter Team 1 name:");
        String team1=sc.nextLine();
        System.out.println("Enter Team 2 name:");
        String team2=sc.nextLine();
        //team 1 details
        System.out.println("Enter runs scored by "+team1);
        int team1runs=sc.nextInt();
        System.out.println("Enter overs left for "+team1);
        int overleft1=sc.nextInt();
        System.out.println("Enter wickets lost by "+team1);
        int wicketlost1=sc.nextInt();
        //team 2 details
        System.out.println("Enter runs scored by "+team2);
        int team2runs=sc.nextInt();
        System.out.println("Enter overs left for "+team2);
        int overleft2=sc.nextInt();
        System.out.println("Enter wickets lost by "+team2);
        int wicketlost2=sc.nextInt();
        double demoResource1=obj.table[overleft1][wicketlost1-1];
        double demoResource2=obj.table[overleft2][wicketlost2-1];
        double Resource1=(100.0-demoResource1);
        double Resource2=(100.0-demoResource2);
        System.out.println(Resource1);
        System.out.println(Resource2);
        double demoresult= team1runs*(Resource2/Resource1);
        int result=(int)(demoresult);
        System.out.println(result);
        //takeyouforward
        if(result-1==team1runs){
            System.out.println("Draw Match");
        }
        else if(result >team1runs){
            System.out.println(team2+" has won the match by"+(10-wicketlost2)+" Wickets");
        }
        else if(result < team1runs){
            System.out.println(team1+" has won the match by "+(result-team2runs)+" runs");
        }

    }
    
}
