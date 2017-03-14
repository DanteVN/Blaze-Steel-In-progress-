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
        super(1003, 577, 1);
        addObject(new MainCharacter(), 40, 545);
        addObject(new InfrontofLevel3(), 502, 288);
        addObject(new EnemyCharacter(65, 115, "Horizontal"), 65, 115);
        /*addObject(new EnemyCharacter(265, 250, "Horizontal"), 265, 250);
        addObject(new EnemyCharacter(490, 445, "Horizontal"), 490, 445);
        addObject(new EnemyCharacter(750, 190, "Horizontal"), 750, 190);
        addObject(new EnemyCharacter(985, 195, "Horizontal"), 985, 195);*/
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
        addObject(new Sword(), 958, 437);
        addObject(new Dagger(), 958, 530);
    }
}
