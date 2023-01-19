import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *PlayAgainButton.
 * 
 * @author Iyi Adeniyi
 * @version 2023-01-18
 */
public class PlayAgainButton extends Actor
{
    /**
     * Act - do whatever the PlayAgainButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // When pressed restarts game.
        if(Greenfoot.mousePressed(PlayAgainButton.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
        }
    }
}