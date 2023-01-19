import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to play.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class PlayButton extends Actor
{
    /**
     * Act - do whatever the PlayButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(PlayButton.this))
        {
            Levels levelsWorld = new Levels();
            Greenfoot.setWorld(levelsWorld);
        }
    }
}
