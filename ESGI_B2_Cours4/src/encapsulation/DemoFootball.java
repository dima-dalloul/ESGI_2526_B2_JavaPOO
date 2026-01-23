package encapsulation;

public class DemoFootball {
    public static void main(String[] args){
        FootballGrenoble gf38 = new FootballGrenoble("Angers");

        gf38.homeTeamScored(2);
        gf38.awayTeamScored(1);
        gf38.homeTeamScored(1);
        gf38.awayTeamScored(2);

        System.out.println("Score final : ");
        System.out.println("Grenoble a marqué " + gf38.getHomeScore() + " but(s).");
        System.out.println(gf38.awayTeam +  " a marqué " + gf38.getAwayScore() + " but(s).");
    }
}
