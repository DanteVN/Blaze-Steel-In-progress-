import greenfoot.*;
public class RestartButton extends Actor
{
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
          Greenfoot.playSound("selection.wav");
          if((getWorld() instanceof Level1))
          {
              Greenfoot.setWorld(new Level1());
          }
          else if((getWorld() instanceof Level2))
          {
              Greenfoot.setWorld(new Level2());
          }
          else if((getWorld() instanceof Level3))
          {
              Greenfoot.setWorld(new Level3());
          }
        }
    }
    public RestartButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
}