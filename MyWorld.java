import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    Banana banana;
    Hero hero;
    Cherry cherry;
    Heart hp1,hp2,hp3;
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }
    
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,555,147);
        counter.setLocation(313,19);
        
        hero = new Hero();
        addObject(hero, 100, 100);

        banana = new Banana();
        addObject(banana, 600, 100);

        cherry = new Cherry();
        addObject(cherry, 600, 150);

        hp1 = new Heart();
        addObject(hp1, 40, 30);

        hp2 = new Heart();
        addObject(hp2, 95, 30);

        hp3 = new Heart();
        addObject(hp3, 150, 30);
    }
    void del_hp1()
    {
        removeObject(hp1);
    }
    void del_hp2()
    {
        removeObject(hp2);
    }
    void del_hp3()
    {
        removeObject(hp3);
    }
    void del_cherry()
    {
        removeObject(cherry);
    }
    void del_hero()
    {
        removeObject(hero);
    }
}
