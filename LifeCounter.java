import greenfoot.*;
public class LifeCounter extends Actor
{
    public void act() 
    {
        setImage(new GreenfootImage("Life : "+EnemyCharacter.Life, 24, Color.RED, Color.BLACK));
    }    
}