import greenfoot.*;
public class LevelCheckpoint extends Actor
{
    public void act() 
    {
        Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
        if (mainCharacter!=null)
        {
            Greenfoot.playSound("Yay!.wav");
            Greenfoot.setWorld(new LevelFinished());
        }
    }    
}