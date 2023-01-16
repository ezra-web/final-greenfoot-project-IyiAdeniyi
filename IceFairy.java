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
    
    GreenfootImage idle[] = new GreenfootImage[6];

    SimpleTimer animationTimer = new SimpleTimer();
    
    int speed = -5;
    
    public IceFairy()
    {
        for(int i = 0; i < idle.length; i++)
        {
            idle[i] = new GreenfootImage("images/iceFairySprites/icefairy"+ i + ".png");
            idle[i].scale(40, 40);
        }
        
        animationTimer.mark();
        
        setImage(idle[0]);
    }
    
    int imageIndex = 0;
    public void animation()
    {
        if(animationTimer.millisElapsed() < 100)
        {
            return;
        }
        animationTimer.mark();
        
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        
    }

    public void act()
    {
        // Add your action code here.
        animation();
        
        int x = getX() + speed;
        int y = 363;
        setLocation(x, y);
        
        if(this.isAtEdge())
        {
            setLocation(710 ,372);
        }
        
        if(Levels.levelTwo == true)
        {
            speed = -1;
        }
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
