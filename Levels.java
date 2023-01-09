import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Levels extends World
{

    /**
     * Constructor for objects of class Levels.
     * 
     */
    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    public void act()
    {
        LevelTwo levelTwo = new LevelTwo();
        
        if(levelTwo.leveltwo == true)
        {
            LevelTwoButton levelTwoButton = new LevelTwoButton();
            addObject(levelTwoButton,401,239);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelButton levelButton = new LevelButton();
        addObject(levelButton,148,238);
        
    }
}
