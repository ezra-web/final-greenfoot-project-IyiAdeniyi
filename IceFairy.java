import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class IceFairy here.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-10
 */
public class IceFairy extends Actor
{
    /**
     * Act - do whatever the IceFairy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    GreenfootImage idle[] = new GreenfootImage[5];

    SimpleTimer animationTimer = new SimpleTimer();
    
    private int speed;
    
    public IceFairy()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/iceFairySprites/icefairy"+ i + ".png");
            idle[i].scale(100, 100);
        }
        
        animationTimer.mark();
        
        setImage(idle[0]);
    }
    
    public void animation()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
    }

    public void act()
    {
        // Add your action code here.
        animation();
    }
}
