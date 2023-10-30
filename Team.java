import java.util.LinkedList;
public class Team {
    private String name;
    private Country Country;
    private Gender gender;
    private LinkedList<Player> players; 
    private int matches;
    private int noWins;
    private int ties;
    private int loses;
    private int goals_scored;
    private int goals_against;


    
    public Team(String n, Country c, Gender g, Player p){
        name = n;
        Country = c;
        gender = g;
        LinkedList<Player> players =  LinkedList<Player> ();
    }
    public Team(String string, Country country2, Gender male) {
    }
    public String getName(){
        return name;
    }
    public Country getCountry(){
        return Country;
    }
    public Gender getGender(){
        return gender;
    }
    public void addPlayer(Player p){
        if (p.getGender() == gender){
            players.add(p);
        }
    }
    public void removePlayer(Player p){
        players.remove(p);

    }

    public void mathces(int gFor, int gAgainst){
        if (goals_scored == goals_against){
            noWins++;
        } else if (goals_scored == goals_against){
            ties++;
        } else if (goals_scored < goals_against){
            loses++;
        }
        goals_scored += gFor;
        goals_against += gAgainst;
    }
    public void printStats(){
    }
    public void updateStats(Match match) {
        
    }
	public void simulatMatches() {
	}
    public Player[] getPlayers() {
        return null;
    }
    public String getGoalsAgainst() {
        return null;
    }
    public String getGoalsScored() {
        return null;
    }
    public String getLosses() {
        return null;
    }
    public String getTies() {
        return null;
    }
    public String getWins() {
        return null;
    }
     

    
}

 

