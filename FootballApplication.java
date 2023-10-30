import java.util.LinkedList;

public class FootballApplication {
    public static void main(String[] args) {
        
        Player player1 = new Player(Gender.MALE, "Player1", 25, new Country("Spain"));
        Player player2 = new Player(Gender.MALE, "Player2", 28, new Country("Spain"));
        Player player3 = new Player(Gender.MALE, "Player3", 30, new Country("France"));
        Player player4 = new Player(Gender.MALE, "Player4", 26, new Country("France"));

       
        Team team1 = new Team("Team1", new Country("Spain"), Gender.MALE);
        Team team2 = new Team("Team2", new Country("France"), Gender.MALE);

        
        team1.addPlayer(player1);
        team1.addPlayer(player2);
        team2.addPlayer(player3);
        team2.addPlayer(player4);

        
        LinkedList<Team> teams = new LinkedList<>();
        teams.add(team1);
        teams.add(team2);
        League league = new League(teams);

        
        league.generateMatches();
        league.simulateMatches();

        
        for (Team team : teams) {
            System.out.println("Team: " + team.getName());
            System.out.println("Wins: " + team.getWins());
            System.out.println("Ties: " + team.getTies());
            System.out.println("Losses: " + team.getLosses());
            System.out.println("Goals Scored: " + team.getGoalsScored());
            System.out.println("Goals Against: " + team.getGoalsAgainst());
            System.out.println("Players:");
            for (Player player : team.getPlayers()) {
                System.out.println(player.getName() + "'s stats:");
                player.printStats();
            }
        }
    }
}

