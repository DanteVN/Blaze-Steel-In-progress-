import greenfoot.*;
public class Level1Other extends Actor
{
    public void act() 
    {
        if(Greenfoot.isKeyDown("p"))
        {
            Greenfoot.setWorld(new Paused());
        }
    }    
}
