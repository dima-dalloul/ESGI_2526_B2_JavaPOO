package encapsulation;

public class FootballGrenoble implements Football{
    int homeScore;
    int awayScore;
    String homeTeam;
    String awayTeam;

    public FootballGrenoble(String awayTeam) {
        this.homeScore = 10;
        this.awayScore = 0;
        this.homeTeam = "Grenoble";
        this.awayTeam = awayTeam;
    }

    @Override
    public void homeTeamScored(int points) {
        homeScore += points;
    }

    @Override
    public void awayTeamScored(int points) {
        awayScore += points;
    }

    @Override
    public void endOfQuarter(int quarter) {
        System.out.println("End of quarter " + quarter + ": " + homeTeam + " " + homeScore + " - " + awayTeam + " " + awayScore);
    }

    @Override
    public void setHomeTeam(String homeTeam) {
        this.homeTeam = homeTeam;
    }

    @Override
    public void setAwayTeam(String awayTeam) {
        this.awayTeam = awayTeam;
    }

    @Override
    public String getHomeTeam() {
        return homeTeam;
    }

    @Override
    public String getAwayTeam() {
        return awayTeam;
    }

    public int getAwayScore() {
        return awayScore;
    }

    public int getHomeScore() {
        return homeScore;
    }
}
