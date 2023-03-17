public class Coach extends Team{
    private String coachName;

    public Coach(String c, String t, String s){
        super(t, s);
        coachName = c;
    }

    public String getCoachName(){
        return coachName;
    }
}
