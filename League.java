import java.util.LinkedList;

public class League {
    private LinkedList<Team> teams;

    public League(LinkedList<Team> teams) {
        this.teams = teams;
    }

    public void generateMatches() {
        
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team homeTeam = teams.get(i);
                Team awayTeam = teams.get(j);

                
                Match homeMatch = new Match(homeTeam, awayTeam);
                Match awayMatch = new Match(awayTeam, homeTeam);

                
                homeMatch.simulateMatch();
                awayMatch.simulateMatch();

                
                homeTeam.updateStats(homeMatch);
                awayTeam.updateStats(awayMatch);
            }
        }
    }
    

    
    public void simulateMatches() {
        
        for (Team team : teams) {
            team.simulatMatches();
        }
    }
}
