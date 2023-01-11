import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LevelTwoButton here.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-09
 */
public class LevelTwoButton extends Actor
{
    /**
     * Act - do whatever the LevelTwoButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LevelTwoButton.this))
        {
            MyWorld gameWorldTwo = new MyWorld();
            Greenfoot.setWorld(gameWorldTwo);
        }
    }
}
