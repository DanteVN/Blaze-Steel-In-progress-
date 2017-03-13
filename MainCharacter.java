import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MainCharacter here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainCharacter extends Actor
{
    private int imageX = getImage().getWidth() * 1;
    private int imageY = getImage().getHeight() * 1;
    private int frame;
    private String direction;
    private int animCount = 0;
    private int speed = 2;
    public int upSpeed = 2;
    private int downSpeed = 2;
    private int leftSpeed = 2;
    private int rightSpeed = 2;
    private GreenfootImage up = new GreenfootImage("aluxes_13.png");
    private GreenfootImage up1 = new GreenfootImage("aluxes_14.png");
    private GreenfootImage up2 = new GreenfootImage("aluxes_16.png");
    private GreenfootImage down = new GreenfootImage("aluxes_1.png");
    private GreenfootImage down1 = new GreenfootImage("aluxes_2.png");
    private GreenfootImage down2 = new GreenfootImage("aluxes_4.png");
    private GreenfootImage left = new GreenfootImage("aluxes_5.png");
    private GreenfootImage left1 = new GreenfootImage("aluxes_6.png");
    private GreenfootImage left2 = new GreenfootImage("aluxes_8.png");
    private GreenfootImage right = new GreenfootImage("aluxes_9.png");
    private GreenfootImage right1 = new GreenfootImage("aluxes_10.png");
    private GreenfootImage right2 = new GreenfootImage("aluxes_12.png");
    private GreenfootImage attackup = new GreenfootImage("hero_14.png");
    private GreenfootImage attackdown = new GreenfootImage("hero_12.png");
    private GreenfootImage attackleft = new GreenfootImage("hero_5.png");
    private GreenfootImage attackright = new GreenfootImage("hero_9.png");
    /**
     * Act - do whatever the MainCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        movement();
    }
    //public boolean checkPlatform()
    {
        //int spriteWidth = getImage().getWidth();
        //int xDistance = (int)(spriteWidth/2);
        
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
