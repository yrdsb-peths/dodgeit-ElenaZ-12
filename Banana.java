import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

public class Banana extends Actor
{
    public int hits = 0;
    int speed = -5;
    public void act()
    {
        move(speed);
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
        int num = Greenfoot.getRandomNumber(350);
        setLocation(600,num);
    }
    
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
