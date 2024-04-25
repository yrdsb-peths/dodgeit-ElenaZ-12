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
            resetCherry();
            if (speed>-10)
            {
                speed -= 1;
            }
        }
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
