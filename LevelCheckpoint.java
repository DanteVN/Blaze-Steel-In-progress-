import greenfoot.*;
public class LevelCheckpoint extends Actor
{
    public void act() 
    {
        Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
        if (mainCharacter!=null)
        {
            Greenfoot.setWorld(new LevelFinished());
        }
    }    
}