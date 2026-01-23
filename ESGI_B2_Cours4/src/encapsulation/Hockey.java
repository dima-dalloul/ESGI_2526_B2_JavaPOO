package encapsulation;

public interface Hockey extends Sports {
    public void homeGoalScored();
    public void guestGoalScored();
    public int getHomeTeamScore();
    public int getGuestTeamScore();
    public void endPeriod(int period);
    public void overTimePeriod(int overtimePeriod);
}
