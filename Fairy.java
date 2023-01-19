import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Main player of the game.
 * 
 * @author Iyi Adeniyi 
 * @version 2023-01-18
 */
public class Fairy extends Actor
{
    
    GreenfootImage idleRight[] = new GreenfootImage[5];
    GreenfootImage idleLeft[] = new GreenfootImage[5];
    
    GreenfootSound fairyTreeSound = new GreenfootSound("fairytree.mp3");
    
    GreenfootSound coinSound = new GreenfootSound("coinSound.mp3");
    
    String facing = "right";
    SimpleTimer animateTimer = new SimpleTimer();
    
    public int timer;
    
    public int speed;
    /**
     *Constructor = The code that gets run one time when object is created
     */
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
        
        animateTimer.mark();
        
        setImage(idleRight[0]);
    }
    
    /**
     * Act - do whatever the Fairy wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */     
    public void act()
    {
        move();
        
        animateFairy();  
        
        nextLevel();
        
        jump(); 
        
        coin();
    }

    /**
     * Checks for when the fairy is touching the fairy tree to proceed to hte next level.
     */
    public void nextLevel()
    {
        if(isTouching(FairyTree.class))
        {
            MyWorld world = (MyWorld) getWorld();
            if(world.coins % 3 == 0)
            {
                fairyTreeSound.play();
                
                world.setNextLevel();
                world.setLabel();
                world.setCoins();
                world.spawnIceFairy();
                      
                setLocation(95,340);
            }   
        }
    }
    
    int imageIndex = 0;
    public void animateFairy()
    {
        if(animateTimer.millisElapsed() < 200)
        {
            return;
        }
        animateTimer.mark();
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
    
    public void move()
    {
        //when left key is pressed moves the fairy right
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
    }
    
    /**
     * when space bar pressed fairy jumps
     */
    public void jump()
    {
        int ground = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == ground);
        
        //Checks for if the fairy is not on the ground.
        if(getY() != 340 )
        {
            if(speed == 0 && timer > 0)
            {
                timer--;
            }
            if(speed == 0 && timer > 0)
            {
                return;
            }
            speed++;
            setLocation(getX(), getY() + speed);
            //checks if the fairy is in the air, if so code to fall back to ground
            if(getY() >=ground )
            {
                setLocation(getX(), ground);
                Greenfoot.getKey();
            }
        }
        else
        {
            //checks if space bar is pressed to jump
            if("space".equals(Greenfoot.getKey()))
            {
                speed = -20;
                setLocation(getX(), getY() + speed);
                timer = 13;
            }
        }
    }
    
    /**
     * removes coin and plays sound when collected by the fairy
     */
    public void coin()
    {
        if(isTouching(Coin.class))
        {
            MyWorld world = (MyWorld) getWorld();
            world.increaseCoin();
            removeTouching(Coin.class);
            coinSound.play();
        }
    }
}
