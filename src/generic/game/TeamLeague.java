package generic.game;

import java.util.ArrayList;
import java.util.Collections;

public class TeamLeague<T extends Team> {
    private String name;
    private ArrayList<T> league= new ArrayList<>();

    public TeamLeague(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }
    public void addTeam(T team){
        int findTeam= league.indexOf(team);
        if(findTeam >=0){
            System.out.println("team already exist");
            return;
        }
        league.add(team);
        System.out.println("generic.game.Team added successfully");
    }

    public void inOrder(){
        Collections.sort(league);
        for(T t: league){
            System.out.println(t.getName()+ " : " + t.ranking());
        }

    }
}
