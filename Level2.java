import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level2 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level2 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    /**
     * Constructor for objects of class Level2.
     * 
     */
    public Level2()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1091, 585, 1);
        addObject(new MainCharacter(), 720, 550);
        addObject(new InfrontofLevel2(), 545, 293);
        /*addObject(new EnemyCharacter(), 480, 100);
        addObject(new EnemyCharacter(), 780, 70);
        addObject(new EnemyCharacter(), 375, 535);
        addObject(new EnemyCharacter(), 725, 380);*/
        prepare();
        attackoptions();
    }
    public Scoreboard getScore()
    {
        return scoreboard;
    }
    public void prepare()
    {
        addObject(scoreboard, 40, 10);
    }
    public void attackoptions()
    {
        addObject(new Sword(), 1046, 445);
        addObject(new Dagger(), 1046, 538);
    }
}
