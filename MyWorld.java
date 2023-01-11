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
        addObject(fairy,95,340);

        GameTIle gameTIle = new GameTIle();
        addObject(gameTIle,760,420);

        GameTIle gameTIle2 = new GameTIle();
        addObject(gameTIle2,685,420);

        GameTIle gameTIle3 = new GameTIle();
        addObject(gameTIle3,604,420);

        GameTIle gameTIle4 = new GameTIle();
        addObject(gameTIle4,527,420);

        GameTIle gameTIle5 = new GameTIle();
        addObject(gameTIle5,448,420);

        GameTIle gameTIle6 = new GameTIle();
        addObject(gameTIle6,369,420);

        GameTIle gameTIle7 = new GameTIle();
        addObject(gameTIle7,289,420);

        GameTIle gameTIle8 = new GameTIle();
        addObject(gameTIle8,211,420);

        GameTIle gameTIle9 = new GameTIle();
        addObject(gameTIle9,131,420);

        GameTIle gameTIle10 = new GameTIle();
        addObject(gameTIle10,51,420);

        FairyTree fairyTree = new FairyTree();
        addObject(fairyTree,700,310);
        
        BackButton backButton = new BackButton();
        addObject(backButton,39,27);
    }
}
