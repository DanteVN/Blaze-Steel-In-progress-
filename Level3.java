import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Level3 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level3 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    /**
     * Constructor for objects of class Level3.
     * 
     */
    public Level3()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1119, 1357, 1);
        prepare();
    }
    public Scoreboard getScore()
    {
        return scoreboard;
    }
    public void prepare()
    {
        addObject(scoreboard, 100, 40);
    }
}
