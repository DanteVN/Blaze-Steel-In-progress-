import greenfoot.*;
import java.awt.Color;
  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class ScoreAf here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ScoreAf extends Actor
{
    /**
     * Act - do whatever the ScoreAf wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+EnemyCharacter.scoreaf, 30, Color.RED, Color.BLACK));
    }    
}
