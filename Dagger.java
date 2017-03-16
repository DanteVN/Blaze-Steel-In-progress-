import greenfoot.*;
public class Dagger extends Actor
{
    public GreenfootImage daggerup = new GreenfootImage("daggerup.png");
    public GreenfootImage daggerdown = new GreenfootImage("daggerdown.png");
    public GreenfootImage daggerleft = new GreenfootImage("daggerleft.png");
    public GreenfootImage daggerright = new GreenfootImage("daggerright.png");
    public void act() 
    {
        if(Greenfoot.mouseClicked(this))
        {
            Greenfoot.playSound("selection.wav");
        }
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
        /*Actor enemyCharacter = getOneIntersectingObject(EnemyCharacter.class);
        if(enemyCharacter!=null)
        {
            World world = getWorld();
            world.removeObject(enemyCharacter);
            Level1 level1 = (Level1)world;
            Scoreboard scoreboard = level1.getScore();
            scoreboard.addScore();
        }*/
        //else if(hitTheEdge()!=null)
        {
            
        }
    }
}