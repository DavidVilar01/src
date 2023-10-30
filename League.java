import java.util.LinkedList;

public class League {
    private LinkedList<Team> teams;

    public League(LinkedList<Team> teams) {
        this.teams = teams;
    }

    public void generateMatches() {
        // Iterate over all pairs of teams in a double loop to create matches
        for (int i = 0; i < teams.size(); i++) {
            for (int j = i + 1; j < teams.size(); j++) {
                Team homeTeam = teams.get(i);
                Team awayTeam = teams.get(j);

                // Create home and away matches
                Match homeMatch = new Match(homeTeam, awayTeam);
                Match awayMatch = new Match(awayTeam, homeTeam);

                // Simulate the matches
                homeMatch.simulateMatch();
                awayMatch.simulateMatch();

                // Update statistics for participating teams
                homeTeam.updateStats(homeMatch);
                awayTeam.updateStats(awayMatch);
            }
        }
    }
    

    
    public void simulateMatches() {
        // Simulate all matches in the league
        for (Team team : teams) {
            team.simulatMatches();
        }
    }
}
