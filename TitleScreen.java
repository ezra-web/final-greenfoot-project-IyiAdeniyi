import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * beginning screen.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class TitleScreen extends World
{
    /**
     * Constructor for objects of class TitleScreen.
     */
    public TitleScreen()
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
        PlayButton playButton = new PlayButton();
        addObject(playButton,415,335);

        TutorialButton tutorialButton = new TutorialButton();
        addObject(tutorialButton,410,419);

        playButton.setLocation(399,321);
    }
}
