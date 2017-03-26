import greenfoot.*;
import java.awt.Color;
public class Timer extends Actor
{
    private int time = 10800;
    public void act() 
    {
        if(time % 60 == 0)
        {
            int t = time / 60;
            setImage(new GreenfootImage("Time : "+t+" Seconds", 24, Color.RED, Color.BLACK));
             
        }
        if (time >= 0)
        {
            time--;
            if(time == -1) 
            {
                Greenfoot.playSound("LosingGaming.wav");
                Greenfoot.setWorld(new GameOver());
            }
        }
    }
}