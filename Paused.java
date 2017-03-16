import greenfoot.*;
public class Paused extends World
{
    public Paused()
    {    
        super(900, 500, 1);
        addObject(new RestartButton(), 450, 250);
        addObject(new MainMenuButton(), 450, 400);
    }
}