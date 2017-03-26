import greenfoot.*;
import java.awt.Color;
public class Scoreboard extends Actor
{
    int score=0;
    public void act() 
    {
        setImage(new GreenfootImage("Score : "+score, 24, Color.RED, Color.BLACK));
    }
    public void addScore()
    {
        score+=100;
    }
}