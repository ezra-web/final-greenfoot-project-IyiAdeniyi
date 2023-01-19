import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to acces tutorial.
 * 
 * @author Iyi Adeniyi
 * @version 2023-01-18
 */
public class TutorialButton extends Actor
{
    /**
     * Act - do whatever the TutorialButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(TutorialButton.this))
        {
            Tutorial tutorialWorld = new Tutorial();
            Greenfoot.setWorld(tutorialWorld);
        }
    }
}
