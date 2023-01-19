import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to access level two.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlTwoBtn extends Actor
{
    /**
     * Act - do whatever the LvlTwoBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlTwoBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            gameWorld.level = 2;
            Greenfoot.setWorld(gameWorld);
            gameWorld.setLabel();
        }
    }
}
