package baseballtest;
/**
 * Name: Chris Hitchcock <br>
 * Date: November 9th, 2016 <br>
 * Version: 1.0 <br>
 * Description: This class, which inherits the Sports class, creates a BaseballTeam
 * object which can have wins, losses and ties added to, and includes methods to
 * display the details of the team and show the points based on wins/losses/ties.
 * @author chhit5249
 */
public class BaseballTeam extends Sports implements Stats {
    //Variable declaration
    private int win,loss,tie, points;
    /**
     * Constructor method <p> pre: none <br> post: BaseballTeam created
     * @param tName Name of team
     * @param city City of team
     */
    public BaseballTeam(String tName, String city)
    {
        super(tName, 9, city);
    }
    
    /**
     * Default gameWon method; add 1 to wins <p> pre: none <br> post: 1 win added
     */
    public void gameWon()
    {
        win++;
    }
    
    /**
     * Overridden gameWon method; allows user to input multiple wins at once <p>
     * pre: wins inputted <br>
     * post: that amount of wins added.
     * @param wins Amount of wins
     */
    public void gameWon(int wins)
    {
        win+=wins;
    }
    
    /**
     * Default gameLost method; add 1 to losses <p> pre: none <br> post: 1 loss added
     */
    public void gameLost()
    {
        loss++;
    }
    
    /**
     * Overridden gameLost method; allows user to input multiple losses at once <p>
     * pre: losses inputted <br>
     * post: that amount of losses added.
     * @param losses Amount of losses
     */
    public void gameLost(int losses)
    {
        loss+=losses;
    }
    
    /**
     * Default gameTie method; add 1 to ties <p> pre: none <br> post: 1 tie added
     */
    public void gameTie()
    {
        tie++;
    }
    
    /**
     * Overridden gameTie method; allows user to input multiple ties at once <p>
     * pre: ties inputted <br>
     * post: that amount of ties added.
     * @param ties Amount of ties
     */
    public void gameTie(int ties)
    {
        tie+=ties;
    } 
    
    /**
     * Method that displays the details of the baseball team <p>
     * pre: none <br>
     * post: details displayed
     */
    public void details()
    {
        System.out.println("Team Name: "+super.getName()+"\nTeam City: "
                +super.getRegion()+"\nNumber of players: "+super.getPlayers()+"\nPoints: "+points);
    }
    
    /**
     * overallPoints method implemented from Stats interface <p>
     * pre: none <br>
     * post: points outputted as a String
     * @return pointsOut - total points
     */
    public String overallPoints()
    {
        points = (win*2)+tie+(0*loss);
        String pointsOut = "The "+super.getName()+" have "+points+" points";
        return pointsOut;
    }
}
