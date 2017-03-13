import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class SelectLevel here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class SelectLevel extends World
{

    /**
     * Constructor for objects of class SelectLevel.
     * 
     */
    public SelectLevel()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(544, 416, 1);
        addObject(new Level1Button(), 270, 150);
        addObject(new Level2Button(), 270, 270);
        addObject(new Level3Button(), 270, 390);
        addObject(new ResumeButton(), 500, 50);
    }
}
