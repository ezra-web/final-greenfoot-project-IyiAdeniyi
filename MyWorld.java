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
        setPaintOrder(FairyTree.class, IceFairy.class);

    }
    
       /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */
    private void prepare()
    {
        Fairy fairy = new Fairy();
        addObject(fairy,95,340);

        FairyTree fairyTree = new FairyTree();
        addObject(fairyTree,710,307);

        BackButton backButton = new BackButton();
        addObject(backButton,39,27);

        GameTile gameTile = new GameTile();
        addObject(gameTile,44,419);

        GameTile gameTile2 = new GameTile();
        addObject(gameTile2,121,419);

        GameTile gameTile3 = new GameTile();
        addObject(gameTile3,198,419);

        GameTile gameTile4 = new GameTile();
        addObject(gameTile4,276,419);

        GameTile gameTile5 = new GameTile();
        addObject(gameTile5,355,419);

        GameTile gameTile6 = new GameTile();
        addObject(gameTile6,435,419);

        GameTile gameTile7 = new GameTile();
        addObject(gameTile7,513,419);

        GameTile gameTile8 = new GameTile();
        addObject(gameTile8,592,419);

        GameTile gameTile9 = new GameTile();
        addObject(gameTile9,671,419);

        GameTile gameTile10 = new GameTile();
        addObject(gameTile10,749,419);

        IceFairy icefairy = new IceFairy();
        addObject(icefairy, 710 ,372);

        LevelOneLabel levelOneLabel = new LevelOneLabel();
        addObject(levelOneLabel,400,25);
    }
}