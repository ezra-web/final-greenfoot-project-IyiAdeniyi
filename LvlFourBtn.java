import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to acces level four.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlFourBtn extends Actor
{
    /**
     * Act - do whatever the LvlFourBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlFourBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameWorld.level = 4;
            gameWorld.setLabel();
        }
    }
}
