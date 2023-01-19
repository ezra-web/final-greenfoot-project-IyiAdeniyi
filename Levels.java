import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * World that displays and provides acces to cleared levels.
 * 
 * @author Iyi Adeniyi
 * @version 2023-01-15
 */
public class Levels extends World
{
    /**
     * Constructor for objects of class Levels.
    */
    public Levels()
    {    
        // Create a new MyWorld.levels with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    /**
     * Checks if level has been cleared, then add the button to acces said levels
     */
    public void act()
    {        
        if(MyWorld.levels >= 2)
        {
            LvlTwoBtn levelTwoButton = new LvlTwoBtn();
            addObject(levelTwoButton,391,171);
        }
        
        if(MyWorld.levels >= 3)
        {
            LvlThreeBtn levelThreeButton = new LvlThreeBtn();
            addObject(levelThreeButton,652,171);
        }
        
        if(MyWorld.levels >= 4)
        {
            LvlFourBtn levelFourButton = new LvlFourBtn();
            addObject(levelFourButton,147,329);
        }
        
        if(MyWorld.levels >= 5)
        {
            LvlFiveBtn levelFiveButton = new LvlFiveBtn();
            addObject(levelFiveButton,391,329);
        }
        
        if(MyWorld.levels >= 6)
        {
            LvlSixBtn levelSixButton = new LvlSixBtn();
            addObject(levelSixButton,652,329);
        }
    }
    
    /**
     * Prepare the MyWorld.levels for the start of the program.
     * That is: create the initial objects and add them to the MyWorld.levels.
     */
    private void prepare()
    {
        LvlOneBtn levelOneButton = new LvlOneBtn();
        addObject(levelOneButton,146,171);
    }
}