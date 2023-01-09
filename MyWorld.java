import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class MyWorld here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MyWorld extends World
{
    /**
     * Constructor for objects of class MyWorld.
     * 
     */
    public MyWorld()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(800, 450, 1);
        
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fairy fairy = new Fairy();
        addObject(fairy,95,170);

        GameTIle gameTIle = new GameTIle();
        addObject(gameTIle,598,388);
        gameTIle.setLocation(765,250);
        GameTIle gameTIle2 = new GameTIle();
        addObject(gameTIle2,685,250);
        GameTIle gameTIle3 = new GameTIle();
        addObject(gameTIle3,604,250);
        GameTIle gameTIle4 = new GameTIle();
        addObject(gameTIle4,527,250);
        GameTIle gameTIle5 = new GameTIle();
        addObject(gameTIle5,448,250);
        GameTIle gameTIle6 = new GameTIle();
        addObject(gameTIle6,369,250);
        GameTIle gameTIle7 = new GameTIle();
        addObject(gameTIle7,289,250);
        GameTIle gameTIle8 = new GameTIle();
        addObject(gameTIle8,211,250);
        GameTIle gameTIle9 = new GameTIle();
        addObject(gameTIle9,131,250);
        GameTIle gameTIle10 = new GameTIle();
        addObject(gameTIle10,51,250);
        
    }
}
