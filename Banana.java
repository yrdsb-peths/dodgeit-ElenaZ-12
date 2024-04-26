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
        //Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
        //counter.add(1);
        Actor hp1 = getOneObjectAtOffset(-getX()+40, -getY()+30, Heart.class);
        Actor hp2 = getOneObjectAtOffset(-getX()+95, -getY()+30, Heart.class);
        Actor hp3 = getOneObjectAtOffset(-getX()+150, -getY()+30, Heart.class);
        if (hits == 1)
        {
            getWorld().removeObject(hp3);
        }
        else if (hits == 2)
        {
            getWorld().removeObject(hp2);
        }
        else if (hits == 3)
        {
            getWorld().removeObject(hp1);
        }
    }
    
    public void checkGameOver()
    {
        if (hits>=3)
        {
            SadFace sadFace = new SadFace();
            getWorld().addObject(sadFace, 300, 200);
            getWorld().removeObject(this);
            
        }
    }
}
