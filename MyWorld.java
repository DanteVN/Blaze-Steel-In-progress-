import greenfoot.*;

public class MyWorld extends World
{
    public MyWorld()
    {    
        super(544, 416, 1);
        addObject(new StartButton(), 270, 290);
        addObject(new HowtoPlay(), 500, 35);
    }
}