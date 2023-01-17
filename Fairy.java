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
    
    GreenfootSound fairyTreeSound = new GreenfootSound("fairytree.mp3");
    
    GreenfootSound coinSound = new GreenfootSound("coinSound.mp3");
    
    String facing = "right";
    SimpleTimer animateTimer = new SimpleTimer();
    
    SimpleTimer treeTimer = new SimpleTimer();
    
    public int timer;
    
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
        
        animateTimer.mark();
        
        setImage(idleRight[0]);
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

    public void act()
    {
        // Add your action code here.
        move();
        
        animateFairy();  
        
        nextLevel();
        
        jump(); 
        
        coin();
        
        if(isTouching(IceFairy.class))
        {
            GameOver gameOverWorld = new GameOver();
            Greenfoot.setWorld(gameOverWorld);
        }
    }
    
    public void move()
    {
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
    
    public void jump()
    {
        int ground = getWorld().getHeight() - getImage().getHeight()/2;
        boolean onGround = (getY() == ground);
        
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
            
            if(getY() >=ground )
            {
                setLocation(getX(), ground);
                Greenfoot.getKey();
            }
        }
        else
        {
            if("space".equals(Greenfoot.getKey()))
            {
                speed = -20;
                if(Levels.levelTwo == true)
                {
                    speed = -20;
                }
                setLocation(getX(), getY() + speed);
                timer = 13;
            }
        }
    }
    
    public void nextLevel()
    {
        if(isTouching(FairyTree.class))
        {
            fairyTreeSound.play();
            treeTimer.mark();
            if(treeTimer.millisElapsed() < 800)
            {
                if(Levels.levelTwo == true)
                {
                    TitleScreen home = new TitleScreen();
                    Greenfoot.setWorld(home);
                }
                else
                {
                    LevelTwo levelTwoWorld = new LevelTwo();
                    Greenfoot.setWorld(levelTwoWorld);  
                }
            }
        }
    }

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
