import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Button to access menu.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class MenuButton extends Actor
{
    /**
     * Act - do whatever the MenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
        if(Greenfoot.mousePressed(MenuButton.this))
        {
            TitleScreen titleWorld = new TitleScreen();
            Greenfoot.setWorld(titleWorld);
        }
    }
}
