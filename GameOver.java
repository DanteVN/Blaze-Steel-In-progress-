import greenfoot.*;
public class GameOver extends World
{
    public GameOver()
    {    
        super(544, 416, 1);
        addObject(new RestartButton(), 270, 80);
        addObject(new MainMenuButton(), 270, 320);
    }
}