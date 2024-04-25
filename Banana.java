import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public int hits = 0;
    public void act()
    {
        move(-5);
        
        if(getX()<=0)
        {
            resetBanana();
        }
        
        if(isTouching(Hero.class))
        {
            hits += 1;
            resetBanana();
        }
        
        if (hits>=3)
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
        }
        int hit = hits;
    }
    
    public void resetBanana()
    {
        int num = Greenfoot.getRandomNumber(2);
        if (num==0)
        {
            setLocation(600,100);
        }
        else
        {
            setLocation(600,300);
        }
    }
    
    public int getHits()
    {
        return hits;
    }
}
