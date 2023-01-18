import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Levels here.
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
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1); 
        prepare();
    }
    
    public void act()
    {        
        if(MyWorld.level == 2)
        {
            LvlTwoBtn levelTwoButton = new LvlTwoBtn();
            addObject(levelTwoButton,391,171);
        }
        
        if(MyWorld.level == 3)
        {
            LvlThreeBtn levelThreeButton = new LvlThreeBtn();
            addObject(levelThreeButton,567,171);
        }
        
        if(MyWorld.level == 4)
        {
            LvlFourBtn levelFourButton = new LvlFourBtn();
            addObject(levelFourButton,147,329);
        }
        
        if(MyWorld.level == 5)
        {
            LvlFiveBtn levelFiveButton = new LvlFiveBtn();
            addObject(levelFiveButton,391,329);
        }
        
        if(MyWorld.level == 6)
        {
            LvlSixBtn levelSixButton = new LvlSixBtn();
            addObject(levelSixButton,391,329);
        }
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        LvlOneBtn levelOneButton = new LvlOneBtn();
        addObject(levelOneButton,146,171);
    }
}