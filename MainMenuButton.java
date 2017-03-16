import greenfoot.*;
public class MainMenuButton extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public MainMenuButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
}