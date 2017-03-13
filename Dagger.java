import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class Dagger here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Dagger extends Actor
{
    public GreenfootImage daggerup = new GreenfootImage("daggerup.png");
    public GreenfootImage daggerdown = new GreenfootImage("daggerdown.png");
    public GreenfootImage daggerleft = new GreenfootImage("daggerleft.png");
    public GreenfootImage daggerright = new GreenfootImage("daggerright.png");
    /**
     * Act - do whatever the Dagger wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        throwDagger();
    }
    public Dagger()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
    public void throwDagger()
    {
        //move(10);
        Actor enemyCharacter = getOneIntersectingObject(EnemyCharacter.class);
        if(enemyCharacter!=null)
        {
            World world = getWorld();
            world.removeObject(enemyCharacter);
            Level3 level3 = (Level3)world;
            Scoreboard scoreboard = level3.getScore();
            scoreboard.addScore();
        }
        //else if(hitTheEdge()!=null)
        {
            
        }
    }
}
