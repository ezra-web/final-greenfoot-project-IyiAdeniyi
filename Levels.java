import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
 * 
 * @author Iyi Adeniyi
 * @version 2023-01-15
 */
public class Levels extends World
{
    public static boolean levelTwo = false;
    /**
     * Constructor for objects of class Levels.
    */
    public Levels()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    public void act()
    {        
        if(levelTwo == true)
        {
            LevelTwoButton levelTwoButton = new LevelTwoButton();
            addObject(levelTwoButton,567,238);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LevelButton levelButton = new LevelButton();
        addObject(levelButton,236,236);
    }
    
    public static void setLevelTwo(boolean leveltwo)
    {
        levelTwo = leveltwo;
    }
}