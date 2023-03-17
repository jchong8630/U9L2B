public class Player extends Team{
    private String playerName;
    private String playerNumber;

    public Player(String p, String n, String t, String s){
        super(t, s);
        playerName = p;
        playerNumber = n;
    }

    public String getPlayerName() {
        return playerName;
    }

    public String getPlayerNumber() {
        return playerNumber;
    }

    public void playFor(){
        System.out.println(playerName + " plays for " + getTeamName());
    }
}
