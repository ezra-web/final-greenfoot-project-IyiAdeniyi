import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwo here.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-09
 */
public class LevelTwo extends World
{
    /**
     * Constructor for objects of class LevelTwo.
     * 
     */
    public LevelTwo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        
        Levels leveltwo = new Levels();
        
        BackButton backButton = new BackButton();

        if(Greenfoot.mousePressed(backButton))
        {
            leveltwo.setLevelTwo(true);
            
            Levels levelWorld = new Levels();
            Greenfoot.setWorld(levelWorld);
        }


        prepare();
    }
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        BackButton backButton = new BackButton();
        addObject(backButton,40,29);
    }
}
