import greenfoot.*;
import java.awt.Color;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class LifeCounter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class LifeCounter extends Actor
{
    /**
     * Act - do whatever the LifeCounter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Life : "+EnemyCharacter.Life, 24, Color.RED, Color.BLACK));
    }    
}
