import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to acces level six.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlSixBtn extends Actor
{
    /**
     * Act - do whatever the LvlSixBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlSixBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            gameWorld.level = 6;
            gameWorld.setLabel();
        }
    }
}
