import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Cherry extends Actor
{
    int speed = -5;
    /* Makes the cherry move and reset
     * Precondition: None
     * Postcondition: Cherry should move and reset
     */
    public void act()
    {
        move(speed);
        resetCherry();
    }
    
    /* Resets cherry
     * Precondition: None
     * Postcondition: Cherry should be reset at right edge at a random height
     */
    public void reset()
    {
        int num = Greenfoot.getRandomNumber(350);
        setLocation (600, num);
    }
    
    /* Resets cherry if conditions are met
     * Precondition: None
     * Postcondition: Cherry should reset if at left edge or touching player
     */
    public void resetCherry()
    {
        if(getX()<=0)
        {
            reset();
        }
        else if(isTouching(Hero.class))
        {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            reset();
            if (speed>-10)
            {
                speed -= 1;
            }
        }
    }
}
