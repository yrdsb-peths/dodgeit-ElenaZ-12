import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public int hits = 0;
    int speed = -3;
    /* Makes the banana function; move, reset, lose hearts, determine if game over
     * Precondition: None
     * Postcondition: Banana should function
     */
    public void act()
    {
        move(speed);
        resetBanana();
        updateHearts();
        checkGameOver(); 
    }
    
    /* Resets the banana to a random height at the right side of the screen
     * Precondition: None
     * Postcondition: Banana should be along right edge at a random height each time
     */
    public void reset()
    {
        int num = Greenfoot.getRandomNumber(350);
        setLocation(600,num);
    }
    
    /* Resets banana if banana is at left edge or hits the hero/player
     * Precondition: None
     * Postcondition: Banana resets
     */
    public void resetBanana()
    {
        if(getX()<=0)
        {
            reset();
            if (speed>-10)
            {
                speed -=1;
            }
        }
        else if(isTouching(Hero.class))
        {
            hits += 1;
            reset();
        }
    }

    /* Removes a heart if banana hits hero/player
     * Precondition: None
     * Postcondition: Hearts should be removed if banana hits hero/player
     */
    public void updateHearts()
    {
        MyWorld myworld=(MyWorld)getWorld();
        if (hits == 1)
        {
            myworld.removeObject(myworld.hp3);
        }
        else if (hits == 2)
        {
            myworld.removeObject(myworld.hp2);
        }
        else if (hits == 3)
        {
            myworld.removeObject(myworld.hp1);
            myworld.removeObject(myworld.cherry);
            myworld.removeObject(myworld.hero);
        }
    }
    
    /* Checks if banana hits player 3 times (no hearts left) and shows game over
     * Precondition: None
     * Postcondition: SadFace and game over text should show up if banana hits player 3 times
     */
    public void checkGameOver()
    {
        if (hits==3)
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().showText("GAME OVER", 300, 150);
            getWorld().removeObject(this);
        }
    }
}
