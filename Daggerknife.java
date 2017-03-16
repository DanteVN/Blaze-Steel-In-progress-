import greenfoot.*;
public class Daggerknife extends Actor
{
    Color color = Color.WHITE;
    public GreenfootImage daggerup = new GreenfootImage("daggerup.png");
    public GreenfootImage daggerdown = new GreenfootImage("daggerdown.png");
    public GreenfootImage daggerleft = new GreenfootImage("daggerleft.png");
    public GreenfootImage daggerright = new GreenfootImage("daggerright.png");
    int daggerspeed = 3;
    String rotate;
    public Daggerknife(String direction)
    {
        rotate = direction;
        if (direction.equals("up"))
        {
            setImage(daggerup);
        }
        else if (direction.equals("down"))
        {
            setImage(daggerdown);
        }
        else if (direction.equals("left"))
        {
            setImage(daggerleft);
        }
        else if (direction.equals("right"))
        {
            setImage(daggerright);
        }
    }
    public void act() 
    {
        movingdagger();
    }
    public void movingdagger()
    {
        if(rotate.equals("up"))
        {
            if(getWorld().getColorAt(getX(), getY() - daggerspeed).equals(color))
            {
                setLocation(getX(), getY() - daggerspeed);
            }
        }
        if(rotate.equals("down"))
        {
            if(getWorld().getColorAt(getX(), getY() + daggerspeed).equals(color))
            {
                setLocation(getX(), getY() + daggerspeed);
            }
        }
        if(rotate.equals("left"))
        {
            if(getWorld().getColorAt(getX() - daggerspeed, getY()).equals(color))
            {
                setLocation(getX() - daggerspeed, getY());
            }
        }
        if(rotate.equals("right"))
        {
            if(getWorld().getColorAt(getX() + daggerspeed, getY()).equals(color))
            {
                setLocation(getX() + daggerspeed, getY());
            }
        }
    }
}