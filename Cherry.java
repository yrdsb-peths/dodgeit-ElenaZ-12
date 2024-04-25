import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Cherry extends Actor
{
    public void act()
    {
        move(-8);
        
        if(getX()<=0)
        {
            resetCherry();
        }
        
        if(isTouching(Hero.class))
        {
            // Add a gameover symbol
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }// Add your action code here.
    }
    
    public void resetCherry()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num==0)
        {
            setLocation(600,150);
        }
        else
        {
            setLocation(600,350);
        }
    }
}
