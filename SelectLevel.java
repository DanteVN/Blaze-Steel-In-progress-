import greenfoot.*;
public class SelectLevel extends World
{
    public SelectLevel()
    {    
        super(544, 416, 1);
        addObject(new Level1Button(), 270, 150);
        addObject(new Level2Button(), 270, 270);
        addObject(new Level3Button(), 270, 390);
        addObject(new ResumeButton(), 500, 50);
    }
}