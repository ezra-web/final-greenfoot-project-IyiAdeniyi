import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 *Button to access level one.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-17
 */
public class LvlOneBtn extends Actor
{
    /**
     * Act - do whatever the LvlOneBtn wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(LvlOneBtn.this))
        {
            MyWorld gameWorld = new MyWorld();
            Greenfoot.setWorld(gameWorld);
            
        }
    }
}