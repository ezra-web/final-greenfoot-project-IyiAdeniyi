import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Snake here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Snake extends Actor
{
    /**
     * Act - do whatever the Snake wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    String facing = "right";
    public void act()
    {
     
        if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
        }
        //when right key is pressed moves the elephant right

        else if(Greenfoot.isKeyDown("right"))
        {
            move(4);
            facing = "right";
        }
    }
}
