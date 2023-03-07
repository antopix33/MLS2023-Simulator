

/**
 *  A Team represents an MLS team consisting of a team label, it's corresponding conference (Western or Eastern),
 *  and it's current standing in it's corresponding conference table.
 */

public final class Team {

    /**
     *  Team name
     */
    private final String name;

    /**
     * Name of the Team's corresponding conference
     */
    private final String conference;

    /**
     * Team's standing in it's corresponding conference
     */
    private int points;

    // AF:
    // Team t represents a team containing a name, conference, and a numerical standing
    //
    // RI:
    // name is not empty
    // conference is not empty
    // standing is not negative

    /**
     * Constructs a new Team
     * @param name team name
     * @param conference team's conference
     * @param points team's conference standing
     */
    public Team(String name, String conference, int points){
        this.name = name;
        this.conference = conference;
        this.points = points;
        checkRep();
    }

    /**
     * Throws an exception if the representation invariant is violated
     */
    private void checkRep(){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Team name is empty");
        }
        if (conference.isEmpty() ){
            throw new IllegalArgumentException("Conference name is empty");
        }
        if(points < 0){
            throw new IllegalArgumentException("Team points cannot be negative");
        }
    }

    /**
     *
     * @return conference of this
     */
    public String getConference(){
        return this.conference;
    }

    /**
     *
     * @return points of a team
     */
    public int getPoints(){ return this.points; };

    /**
     *
     * @param numPoints number of points we wish to add
     */
    public void addPoints(int numPoints){
        checkRep();
        this.points += numPoints;
        checkRep();
    }
}
