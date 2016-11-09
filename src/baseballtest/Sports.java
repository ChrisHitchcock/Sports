package baseballtest;
/**
 * Name: Chris Hitchcock <br>
 * Date: November 9th, 2016 <br>
 * Version: 1.0 <br>
 * Description: Creates a basic Sports team object; contains methods
 * to return name, # of players and region of the team.
 * @author chhit5249
 */
public class Sports {
    //Variable/object declaration
    private String name, rgn;
    private int plyrs;
    
    /**
     * Constructor method <p>
     * pre: name, # of players, and region passed through <br>
     * post: Sports team created
     * @param tName Name of team
     * @param players # of players on team
     * @param region Region of team
     */
    public Sports(String tName, int players, String region)
    {
        name = tName;
        rgn = region;
        plyrs = players;
    }
    
    /**
     * This method returns the name of the Sports team <p>
     * pre: none <br>
     * post: name returned
     * @return name - name of team
     */
    public String getName()
    {
        return name;
    }
    
    /**
     * This method returns the amount of players that the Sports team has <p>
     * pre: none <br>
     * post: # of players returned
     * @return plyrs - number of players team has
     */
    public int getPlayers()
    {
        return plyrs;
    }
    
    /**
     * This method returns the region of the Sports team <p>
     * pre: none <br>
     * post: region returned
     * @return rgn - region of team
     */
    public String getRegion()
    {
        return rgn;
    }
    
}
