import greenfoot.*;
public class ResumeButton extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
            Greenfoot.setWorld(new MyWorld());
        }
    }
    public ResumeButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/8, image.getHeight()/8);
        setImage(image);
    }
}