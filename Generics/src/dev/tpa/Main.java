package dev.tpa;

interface Player {}

record BaseballPlayer (String name, String position)  implements Player{};
record FootballPlayer (String name, String position)  implements Player{};

public class Main {
    public static void main(String[] args) {
        BaseballTeam philles1 = new BaseballTeam("Philadelphia phillies");
        BaseballTeam astros1 = new BaseballTeam("Houston Astros");
        scoreResult(philles1,3, astros1, 5);

        SportsTeam philles = new SportsTeam("Philadelphia phillies");
        SportsTeam astros = new SportsTeam("Houston Astros");
        scoreResult(philles,3, astros, 5);

        Team philles2 = new Team("Philadelphia phillies");
        Team astros2 = new Team("Houston Astros");
        scoreResult(philles2,3, astros2, 5);

        var harper = new BaseballPlayer("B Harper", "Right Fielder");
        var marsh = new BaseballPlayer("B Marsh", "Right Fielder");
        philles.addTeamMember(harper);
        philles.addTeamMember(marsh);
        philles.listTeamMembers();

        SportsTeam afc1 = new SportsTeam("Adelide crows");
        Team afc = new Team("Adelide crows");
        var tex = new FootballPlayer("Tex harper", "Mid Fielder");
        afc.addTeamMember(tex);
        var rory = new FootballPlayer("rory harper", "Forward");
        afc.addTeamMember(rory);
        afc.listTeamMembers();

        Team<String> adelide = new Team<>("SF Giants");
        adelide.addTeamMember("Robert");
        adelide.listTeamMembers();

        Team<String> canberra = new Team<>("Oakland Athletics");
        canberra.addTeamMember("Ford");
        canberra.listTeamMembers();
        scoreResult(adelide, 1, canberra, 0);
    }

    public static void scoreResult(BaseballTeam team1, int t1_score, BaseballTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(SportsTeam team1, int t1_score, SportsTeam team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }

    public static void scoreResult(Team team1, int t1_score, Team team2, int t2_score){
        String message = team1.setScore(t1_score,t2_score);
        team2.setScore(t2_score, t1_score);
        System.out.printf("%s %s %s %n", team1, message, team2);
    }
}
