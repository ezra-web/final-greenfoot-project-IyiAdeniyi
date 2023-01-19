import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to access level three.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlThreeBtn extends Actor
{
    /**
     * Act - do whatever the LvlThreeBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlThreeBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameWorld.level = 3;
            gameWorld.setLabel();
        }
    }
}
