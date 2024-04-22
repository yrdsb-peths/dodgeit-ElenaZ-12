import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Hero extends Actor
{
    boolean atTop = true;
    /**
     * Act - do whatever the Hero wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        if(Greenfoot.mouseClicked(null))
        {
            atTop = !atTop;
        }
        
        if (atTop)
        {
            setLocation(100,100);
        }
        else
        {
            setLocation(100,300);
        }
    }
}
