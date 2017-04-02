import greenfoot.*;
public class Level1Button extends Actor
{
  public void act() 
  {
    if(Greenfoot.mouseClicked(this))
    {
      Greenfoot.playSound("selection.wav");
      Greenfoot.setWorld(new Level1());
    }
  }    
}