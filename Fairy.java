import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fairy here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fairy extends Actor
{
    /**
     * Act - do whatever the Fairy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    GreenfootImage idleRight[] = new GreenfootImage[5];
    GreenfootImage idleLeft[] = new GreenfootImage[5];
    
    String facing = "right";
    SimpleTimer animationTimer = new SimpleTimer();
    
    public int speed;

    public Fairy()
    {
        for(int i = 0; i < idleRight.length; i++)
        {
            idleRight[i] = new GreenfootImage("images/fairySprites/idle"+ i + ".png");
            idleRight[i].scale(100, 100);
        }
        
        for(int i = 0; i < idleLeft.length; i++)
        {
            idleLeft[i] = new GreenfootImage("images/fairySprites/idle"+ i + ".png");
            idleLeft[i].mirrorHorizontally();
            idleLeft[i].scale(100, 100);  
        }
        
        animationTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    int imageIndex = 0;
    public void animateFairy()
    {
        if(animationTimer.millisElapsed() < 200)
        {
            return;
        }
        animationTimer.mark();
        //changes the direction the fairy is facing
        if(facing.equals("right"))
        {
        setImage(idleRight[imageIndex]);
        imageIndex = (imageIndex + 1) % idleRight.length;
        }
        else
        {
        setImage(idleLeft[imageIndex]);
        imageIndex = (imageIndex + 1) % idleLeft.length;
        }
    }

    public void act()
    {
        // Add your action code here.
         if(Greenfoot.isKeyDown("left"))
        {
            move(-4);
            facing = "left";
        }
        //when right key is pressed moves the fairy right

        else if(Greenfoot.isKeyDown("right"))
        {
            move(4);
            facing = "right";
        }
        
        animateFairy();  
        
        nextLevel();
        
        Jump(); 

    }
    
    public void Jump()
    {
        int ground = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == ground);
        
        if(getY() != 340)
        {
            speed++;
            setLocation(getX(), getY() + speed);
            
            if(getY() >=ground)
            {
                setLocation(getX(), ground);
                Greenfoot.getKey();
            }
        }
        else
        {
            if("up".equals(Greenfoot.getKey()))
            {
                speed = -15;
                setLocation(getX(), getY() + speed);
            }
        }
    }
    
    public void nextLevel()
    {
        if(isTouching(FairyTree.class))
        {
            LevelTwo levelTwoWorld = new LevelTwo();
            Greenfoot.setWorld(levelTwoWorld);
        }
    }
}
