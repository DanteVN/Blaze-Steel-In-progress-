import greenfoot.*;
public class PreviousButton extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
            Greenfoot.setWorld(new HintsandTips());
        }
    }
    public PreviousButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/2, image.getHeight()/2);
        setImage(image);
    }
}