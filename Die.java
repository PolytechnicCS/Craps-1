
/**
 * Creates and returns a random die for the craps game
 *
 * @author Streak Honey
 * @version  2-11-2021
 */
public class Die
{
    // instance variables
    private int roll;

    /**
     * Constructor for objects of class Die
     */
    public Die()
    {
        // initialise instance variables
        roll = this.roll();
    }

    public int roll()
    {
        //random roll of a dice
        roll = (int) (Math.random() * 6 + 1);
        return roll;
    }
     
    public int getResult()
    {
        //return value of the roll
        return roll;
    }
}
