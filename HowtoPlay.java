import greenfoot.*;
public class HowtoPlay extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
            Greenfoot.setWorld(new HintsandTips());
        }
    }
    public HowtoPlay()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/10, image.getHeight()/10);
        setImage(image);
    }
}