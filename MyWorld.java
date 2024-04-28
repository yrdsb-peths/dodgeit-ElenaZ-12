import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    //Sets variables
    Banana banana;
    Hero hero;
    Cherry cherry;
    Heart hp1,hp2,hp3;
    String instructions = "Avoid bananas and get cherries to gain points\nUse up and down key to move";
    
    /* Sets up the world and objects
     * Precondition: None
     * Postcondition: World and objects should appear
     */
    public MyWorld()
    {
        super(600, 400, 1);
        prepare();
    }
    
    /* Creates and places objects
     * Precondition: None
     * Postcondition: Objects should be placed
     */
    private void prepare()
    {
        Counter counter = new Counter();
        addObject(counter,555,147);
        counter.setLocation(300,20);

        hp1 = new Heart();
        addObject(hp1, 40, 30);

        hp2 = new Heart();
        addObject(hp2, 95, 30);

        hp3 = new Heart();
        addObject(hp3, 150, 30);
        
        showText(instructions, 300,200);
        
        hero = new Hero();
        addObject(hero, 100, 100);
        
        int random = Greenfoot.getRandomNumber(350);
        banana = new Banana();
        addObject(banana, 600, random);
        
        random = Greenfoot.getRandomNumber(350);
        cherry = new Cherry();
        addObject(cherry, 600, random);
    }
    
    /* These methods delete each respective object
     * Precondition: None
     * Postcondition: Respective object should be deleted
     */
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
