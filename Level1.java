import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Level1 here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Level1 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    /**
     * Constructor for objects of class Level1.
     * 
     */
    public Level1()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(1084, 578, 1);
        addObject(new MainCharacter(), 830, 530);
        /*addObject(new EnemyCharacter(), 440, 40);
        addObject(new EnemyCharacter(), 190, 155);
        addObject(new EnemyCharacter(), 430, 490);*/
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
        addObject(new Sword(), 1038, 439);
        addObject(new Dagger(), 1038, 532);
    }
}