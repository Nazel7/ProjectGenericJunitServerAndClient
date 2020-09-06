package generic.game;

public class LeagueMain {
    public static void main(String[] args) {
            TeamLeague<Team<SoccerPlayer>> championsLeague= new TeamLeague<>("Champions League");
            SoccerPlayer joe= new SoccerPlayer("Joe");
            SoccerPlayer ade=new SoccerPlayer("Ade");
            Team<SoccerPlayer> eyimba= new Team<>("Eyimba");
            eyimba.addFootballPlayer(joe);
            eyimba.addFootballPlayer(ade);
            SoccerPlayer ojo= new SoccerPlayer("Ojo");
            SoccerPlayer lade=new SoccerPlayer("Lade");
            Team<SoccerPlayer> kanoPillar= new Team<>("Kano Pillar");
            kanoPillar.addFootballPlayer(ojo);
            kanoPillar.addFootballPlayer(lade);
            kanoPillar.numberOfTeam();
            Team<SoccerPlayer> sunshineStar= new Team<>("Sunshine Star");
            sunshineStar.addFootballPlayer(joe);
            sunshineStar.matchResult(eyimba, 3, 1);
            kanoPillar.matchResult(eyimba, 2, 1);
            eyimba.matchResult(kanoPillar, 0, 3);
            kanoPillar.matchResult(eyimba, 1, 1);
            eyimba.matchResult(kanoPillar, 1, 0);
            int compareTo= kanoPillar.compareTo(eyimba);
            System.out.println(compareTo);
            championsLeague.addTeam(eyimba);
            championsLeague.addTeam(kanoPillar);
            championsLeague.addTeam(sunshineStar);
            championsLeague.inOrder();
    }

}
