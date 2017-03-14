import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class TipsandHints here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class TipsandHints extends World
{
    /**
     * Constructor for objects of class TipsandHints.
     * 
     */
    public TipsandHints()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(900, 500, 1);
        addObject(new ResumeButton(), 860, 35);
    }
}
