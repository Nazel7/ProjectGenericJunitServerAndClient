package generic.game;

import java.util.ArrayList;

public class Team<T extends Player> implements Comparable<Team<T>>  {
    private String name;
    private int won= 0;
    private int lose= 0;
    private int played= 0;
    private int tied= 0;
    private ArrayList<T> member= new ArrayList<>();

    public Team(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getWon() {
        return won;
    }

    public int getLose() {
        return lose;
    }

    public int getPlayed() {
        return played;
    }

    public int getTied() {
        return tied;
    }

    public void addFootballPlayer(T player){
        int findPlayer= member.indexOf(player);
        if(findPlayer >= 0){
            System.out.println(player.getName()+ " already exist for this team "+ this.getName());
            return;
        }
        this.member.add(player);
        System.out.println(player.getName()+ " added successfully to team "+this.getName());
    }

    public void matchResult(Team<T> opponent, int ourScore, int theirScore){
        String printOut;
        if(ourScore > theirScore){
            this.won++;
            printOut= " won against ";
        }
        else if(ourScore < theirScore){
            this.lose++;
            printOut= " lose against ";
        }
        else{
            printOut= " draw against ";
            this.tied++;
        }
        this.played++;
        if(opponent!= null){
            System.out.println(this.name +printOut+ opponent.getName() + " "+ ourScore+ ":" + theirScore );
        }
    }
    public void numberOfTeam(){
        System.out.println(this.member.size());
    }
public int ranking(){
        int rank;
     rank= (this.won * 2) +tied;
   return rank;
}

    @Override
    public int compareTo(Team<T> team) {
        if(this.ranking() > team.ranking()){
            return -1;
        }
        else if(this.ranking() < (team.ranking()) ){

            return 1;
        }
        else{
            return 0;
        }

    }
}
