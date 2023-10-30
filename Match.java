import java.util.LinkedList;
import java.util.Random;

public class Match {
    private LinkedList<String> homeScorers;
    private LinkedList<String> awayScorers;
    private Team homeTeam;
    private Team awayTeam;

    public Match(Team homeTeam, Team awayTeam) {
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
    }

    public void simulateMatch() {
       
    }

    public Match() {
        homeScorers = new LinkedList<>();
        awayScorers = new LinkedList<>();
    }

    public void simulateMatch(LinkedList<String> homeTeam, LinkedList<String> awayTeam) {
        Random random = new Random();

       
        int n = 6;
        int homeGoals = random.nextInt(n);
        int awayGoals = random.nextInt(n);

       
        for (int i = 0; i < homeGoals; i++) {
            int scorerIndex = random.nextInt(homeTeam.size());
            String scorer = homeTeam.get(scorerIndex);
            homeScorers.add(scorer);
        }

       
        for (int i = 0; i < awayGoals; i++) {
            int scorerIndex = random.nextInt(awayTeam.size());
            String scorer = awayTeam.get(scorerIndex);
            awayScorers.add(scorer);
        }

        
        System.out.println("Match Result:");
        System.out.println("Home Team " + homeGoals + " - " + awayGoals + " Away Team");
        System.out.println("Home Team Scorers: " + homeScorers);
        System.out.println("Away Team Scorers: " + awayScorers);
    }

    public static void main(String[] args) {
        
        LinkedList<String> homeTeam = new LinkedList<>();
        homeTeam.add("Player1");
        homeTeam.add("Player2");
        homeTeam.add("Player3");

        LinkedList<String> awayTeam = new LinkedList<>();
        awayTeam.add("Player4");
        awayTeam.add("Player5");
        awayTeam.add("Player6");

        Match match = new Match();
        match.simulateMatch(homeTeam, awayTeam);
    }
}


    

