import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * IceFairy actor. If fairy actor touches the icefairy then gameover.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-10
 */
public class IceFairy extends Actor
{
    //Images to animate IceFairy
    GreenfootImage idle[] = new GreenfootImage[6];

    SimpleTimer animationTimer = new SimpleTimer();
    
    int speed = -1;
    
    /**
     * constructor for IceFairy
     */
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
        //animates fairy
        setImage(idle[imageIndex]);
        imageIndex = (imageIndex + 1) % idle.length;
        
    }

    /**
     * Act - do whatever the IceFairy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        MyWorld gameWorld = new MyWorld();
        // Add your action code here.
        animation();
        
        int x = getX() + speed;
        int y = 363;
        setLocation(x, y);
        
        if(this.isAtEdge())
        {
            setLocation(710 ,372);
        }
        
        if(isTouching(Fairy.class))
        {
            GameOver gameOverWorld = new GameOver();
            Greenfoot.setWorld(gameOverWorld);
        }
    }
    
    public void setPosition()
    {
        setLocation(710 ,370);
        
    }
    
    public void setSpeed(int spd)
    {
        speed = spd;
    }
}
