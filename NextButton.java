import greenfoot.*;
public class NextButton extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
            Greenfoot.setWorld(new TipsandHints());
        }
    }
    public NextButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/8, image.getHeight()/8);
        setImage(image);
    }
}