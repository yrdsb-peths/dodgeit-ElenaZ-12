import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
public class Cherry extends Actor
{
    int speed = -5;
    public void act()
    {
        move(speed);
        
        if(getX()<=0)
        {
            resetCherry();
        }
        else if(isTouching(Hero.class))
        {
            Counter counter = (Counter) getWorld().getObjects(Counter.class).get(0);
            counter.add(1);
            resetCherry();
            if (speed>-10)
            {
                speed -= 1;
            }
        }
    }
    
    public void resetCherry()
    {
        int num = Greenfoot.getRandomNumber(350);
        setLocation (600, num+20);
    }
}
