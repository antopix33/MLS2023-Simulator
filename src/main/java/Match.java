public class Match {
    private final Team homeTeam;

    private final Team awayTeam;

    private final String result;

    /**
     * Constructs a new Math
     *
     * @param homeTeam the home team
     * @param awayTeam the away team
     * @param result the result of the match (relative to the home team)
     */
    public Match(Team homeTeam, Team awayTeam, String result){
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.result = result;
    }

    /**
     * Simulates a match between two teams
     *
     * @param homeTeam the home team
     * @param awayTeam the away team
     * @param result the result of the match (relative to the home team)
     */
    public void simMatch(Team homeTeam, Team awayTeam, String result){
        if (result.equals("W")){
            homeTeam.addPoints(3);
        } else if (result.equals("L")) {
            awayTeam.addPoints(3);
        } else if (result.equals("D")){
            homeTeam.addPoints(1);
            awayTeam.addPoints(1);
        } else {
            throw new IllegalArgumentException("Given result must be W, L, or D(win, loss, or draw");
        }
    }
}
