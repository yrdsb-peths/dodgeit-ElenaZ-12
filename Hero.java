import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    /* Allows the player to move around
     * Precondition: None
     * Postcondition: Player moves
     */
    public void act()
    {
        moveAround(); 
    }
    
    /* Moves player up or down if up or down key is pressed
     * Precondition: None
     * Postcondition: Player should move if up or down key is pressed
     */
    public void moveAround()
    {
        if(Greenfoot.isKeyDown("down"))
        {
            setLocation(getX(),getY()+5);
        }
        if(Greenfoot.isKeyDown("up"))
        {
            setLocation(getX(), getY()-5);
        }
    }
}
