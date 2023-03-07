

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
    private final int standing;

    /**
     * Constructs a new Team
     * @param name team name
     * @param conference team's conference
     * @param standing team's conference standing
     */
    public Team(String name, String conference, int standing){
        this.name = name;
        this.conference = conference;
        this.standing = standing;
        checkRep();
    }

    /**
     * Throws and exception if the representation invariant is violated
     */
    private void checkRep(){
        if (name.isEmpty()){
            throw new IllegalArgumentException("Team name is empty");
        }
        if (conference.isEmpty() ){
            throw new IllegalArgumentException("Conference name is empty");
        }
        if(standing < 0){
            throw new IllegalArgumentException("Team standing is out of bounds");
        }
    }
}
