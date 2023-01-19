import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to access level five.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlFiveBtn extends Actor
{
    /**
     * Act - do whatever the LvlFiveBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlFiveBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameWorld.level = 5;
            gameWorld.setLabel();
        }
    }
}
