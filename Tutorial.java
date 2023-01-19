import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Instructions screen.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class Tutorial extends World
{
    /**
     * Constructor for objects of class Tutorial.
     */
    public Tutorial()
    {    
        // Create a new world with 800x450 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fairy fairy = new Fairy();
        addObject(fairy,611,255);
        fairy.setLocation(525,399);
        BackButton backButton = new BackButton();
        addObject(backButton,42,31);
    }
}
