public class Team {
    private String teamName;
    private String sport;

    public Team(String n, String s){
        teamName = n;
        sport = s;
    }

    public String getTeamName(){
        return teamName;
    }

    public String getSport(){
        return sport;
    }

    public void win(){
        System.out.println("We won!");
    }
}
