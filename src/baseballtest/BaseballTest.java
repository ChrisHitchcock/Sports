package baseballtest;
/**
 * Name: Chris Hitchcock <br>
 * Date: November 9th, 2016 <br>
 * Version: 1.0 <br>
 * Description: This program tests the Sports/BaseballTeam classes.
 * @author chhit5249
 */
public class BaseballTest {

    /**
     * All the testing happens here.
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //Declare a test BaseballTeam
        BaseballTeam Jays = new BaseballTeam("Blue Jays", "Toronto");
        
        //Methods to test the new object
        Jays.gameWon();
        Jays.gameWon(4);
        Jays.gameTie(3);
        Jays.gameLost(3);
        System.out.println(Jays.overallPoints());
        Jays.details();
    }
    
}
