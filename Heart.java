import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Heart here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Heart extends Actor
{
    /* Just makes instructions disappear when game starts
     * Precondition: None
     * Postcondition: Instructions disappear 
     */
    public void act()
    {
        getWorld().showText(null, 300,200);
    }
}
