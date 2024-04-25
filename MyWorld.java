import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{

    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1); 
        
        Hero hero = new Hero();
        addObject(hero, 100, 100);
        
        Banana banana = new Banana();
        addObject(banana, 600, 100);
        
        Cherry cherry = new Cherry();
        addObject(cherry, 600, 150);
        
        Heart hp1 = new Heart();
        addObject(hp1, 40, 30);
                
        Heart hp2 = new Heart();
        addObject(hp2, 95, 30);
                
        Heart hp3 = new Heart();
        addObject(hp3, 150, 30);
        
        if (banana.getHits() == 1)
        {
            removeObject(hp3);
        }
        else if (banana.getHits() == 2)
        {
            removeObject(hp2);
        }
        else if (banana.getHits() == 3)
        {
            removeObject(hp1);
        }
    }
}
