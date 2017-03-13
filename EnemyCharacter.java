import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class EnemyCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class EnemyCharacter extends Actor
{
    private int imageX = getImage().getWidth() * 1;
    private int imageY = getImage().getHeight() * 1;
    private int frame;
    private String direction;
    private int animCount = 0;
    private int speed = 2;
    public int upSpeed = 2;
    private GreenfootImage left = new GreenfootImage("lancer_5.png");
    private GreenfootImage left1 = new GreenfootImage("lancer_6.png");
    private GreenfootImage left2 = new GreenfootImage("lancer_8.png");
    private GreenfootImage right = new GreenfootImage("lancer_9.png");
    private GreenfootImage right1 = new GreenfootImage("lancer_10.png");
    private GreenfootImage right2 = new GreenfootImage("lancer_12.png");
    private GreenfootImage down = new GreenfootImage("lancer_1.png");
    private GreenfootImage down1 = new GreenfootImage("lancer_2.png");
    private GreenfootImage down2 = new GreenfootImage("lancer_4.png");
    private GreenfootImage up = new GreenfootImage("lancer_13.png");
    private GreenfootImage up1 = new GreenfootImage("lancer_14.png");
    private GreenfootImage up2 = new GreenfootImage("lancer_16.png");
    /**
     * Act - do whatever the EnemyCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }
    public void movement()
    {
        if(Greenfoot.isKeyDown("w"))
        {
            direction = "up";
            if(animCount % 10 == 0)
            {
                animateUp();
            }
            setLocation(getX(), getY() - upSpeed);
            getImage().scale(imageX, imageY);
        }
        else if(Greenfoot.isKeyDown("s"))
        {
            direction = "down";
            if(animCount % 10 == 0)
            {
                animateDown();
            }
            setLocation(getX(), getY() + speed);
            getImage().scale(imageX, imageY);
        }
        else if(Greenfoot.isKeyDown("a"))
        {
            direction = "left";
            if(animCount % 10 == 0)
            {
                animateLeft();
            }
            setLocation(getX() - speed, getY());
            getImage().scale(imageX, imageY);
        }
        else if(Greenfoot.isKeyDown("d"))
        {
            direction = "right";
            if(animCount % 10 == 0)
            {
                animateRight();
            }
            setLocation(getX() + speed, getY());
            getImage().scale(imageX, imageY);
        }
        else
        {
            if(direction == "up")
            {
                setImage(up);
                getImage().scale(imageX, imageY);
            }
            else if(direction == "down")
            {
                setImage(down);
                getImage().scale(imageX, imageY);
            }
            else if(direction == "left")
            {
                setImage(left);
                getImage().scale(imageX, imageY);
            }
            else if(direction == "right")
            {
                setImage(right);
                getImage().scale(imageX, imageY);
            }
        }
        animCount++;
    }
    public void animateUp()
    {
        if (frame == 1)
        {
            setImage(up1);
            getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
            setImage(up2);
            getImage().scale(imageX, imageY);
            frame = 0;
        }
        frame++;
    }
    public void animateDown()
    {
        if (frame == 1)
        {
            setImage(down1);
            getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
            setImage(down2);
            getImage().scale(imageX, imageY);
            frame = 0;
        }
        frame++;
    }
    public void animateLeft()
    {
        if (frame == 1)
        {
            setImage(left1);
            getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
            setImage(left2);
            getImage().scale(imageX, imageY);
            frame = 0;
        }
        frame++;
    }
    public void animateRight()
    {
        if (frame == 1)
        {
            setImage(right1);
            getImage().scale(imageX, imageY);
        }
        else if (frame == 2){
            setImage(right2);
            getImage().scale(imageX, imageY);
            frame = 0;
        }
        frame++;
    }
}
