import java.util.*;

public final class Table {
     private final int EAST_MAX_STANDING = 15;
     private final int WEST_MAX_STANDING = 14;
     private final List<Team> eastConf;
     private final List<Team> westConf;

     public Table(){
         this.eastConf = new ArrayList<>();
         this.westConf = new ArrayList<>();
     }

     private void addTeam(Team t){
         if (!t.getConference().equals("West") && !t.getConference().equals("East")){
             throw new IllegalArgumentException("Invalid conference, choose either East or West");
         } else if (t.getConference().equals("East")){
             eastConf.add(t);
         } else {
             westConf.add(t);
         }
     }

}
