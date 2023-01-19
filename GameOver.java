import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Gameover screen.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class GameOver extends World
{
    /**
     * Constructor for objects of class GameOver.
     */
    public GameOver()
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
        MenuButton menuButton = new MenuButton();
        addObject(menuButton,211,387);
        
        PlayAgainButton playAgainButton = new PlayAgainButton();
        addObject(playAgainButton,600,387);
    }
}
