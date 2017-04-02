import greenfoot.*;
public class Sword extends Actor
{
    public static boolean click = false;
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selectdagger.wav");
            click = true;
        }
    }
    public Sword()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
}