public class Player {
    private Gender gender;
    private String name;
    private int age;
    private Country nationality;
    private int no_shots;
    private int no_matches;
    private int no_tackles;
    private int no_passes;
    private int no_assists;
    private int no_goals;

    public Player(Gender g, String n, int a, Country nat ){
        gender = g;
        name = n;
        age = a;
        nationality = nat;

    }
    
    public Gender getGender(){
        return gender;
    }

    public String getName(){
        return name;
    }

    public int getAge(){
        return age;
    }

    public Country getNationality(){
        return nationality;
    }

    public void update(int t, int p, int s, int as, int g){
        no_matches ++;
        no_tackles += t;
        no_passes += p;
        no_shots += s;
        no_assists += as;
        no_goals += g;

    }
    public void printStats(){
        System.out.println("Player" + name + "statistics:");
        System.out.println("Matches played:" + no_matches);
        System.out.println("Tackles:" +no_tackles);
        System.out.println("Passes:" + no_passes);
        System.out.println("Shots:" + no_shots);
        System.out.println("Assists:" + no_assists);
        System.out.println("Goals:" + no_goals);
    }
        

    
}
