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
    private String path;
    private String pathdirection;
    private int direction = 1;
    private int movementDirection;
    private int animCount = 0;
    private int speed = 1;
    public int upSpeed = 1;
    private int max;
    private int min;
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
    private GreenfootImage dead = new GreenfootImage("lancer_dead.png");
    
    /**
     * Act - do whatever the EnemyCharacter wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public EnemyCharacter(int min, int max, String dir)
    {
        this.min = min;
        this.max = max;
        pathdirection = dir;
    }
    public void act() 
    {
        movement();
    }
    public void movement()
    {
        if(pathdirection.equals("Horizontal"))
        {
            if((getX() <= max) && (direction == 1))
            {
                path = "right";
                if(animCount % 10 == 0)
                {
                    animateRight();
                }
                setLocation(getX() + speed, getY());
                getImage().scale(imageX, imageY);
            }
            else if((getX() >= max) && (direction == 1))
            {
                direction = -1;
                path = "left";
                if(animCount % 10 == 0)
                {
                    animateLeft();
                }
                setLocation(getX() - speed, getY());
                getImage().scale(imageX, imageY);
            }
            else if((getX() >= min) && (direction == -1))
            {
                path = "left";
                if(animCount % 10 == 0)
                {
                    animateLeft();
                }
                setLocation(getX() - speed, getY());
                getImage().scale(imageX, imageY);
            }
            else if((getX() <= min) && (direction == -1))
            {
                direction = 1;
                path = "right";
                if(animCount % 10 == 0)
                {
                    animateRight();
                }
                setLocation(getX() + speed, getY());
                getImage().scale(imageX, imageY);
            }
        }
        else if (pathdirection.equals("Vertical"))
        {
            
        }
        if(path == "up")
            {
                setImage(up);
                getImage().scale(imageX, imageY);
            }
            else if(path == "down")
            {
                setImage(down);
                getImage().scale(imageX, imageY);
            }
            else if(path == "left")
            {
                setImage(left);
                getImage().scale(imageX, imageY);
            }
            else if(path == "right")
            {
                setImage(right);
                getImage().scale(imageX, imageY);
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