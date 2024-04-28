import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public int hits = 0;
    
    public void act()
    {
        move(-5);
        resetBanana();
        updateHearts();
        checkGameOver(); 
    }
    
    public int getHits()
    {
        return hits;
    }
    
    public void reset()
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
    
    public void resetBanana()
    {
        if(getX()<=0)
        {
            reset();
        }
        else if(isTouching(Hero.class))
        {
            hits += 1;
            reset();
        }
    }

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
