import greenfoot.*;
import java.awt.Color;
public class MainCharacter extends Actor
{
  private int imageX = getImage().getWidth() / 1;
  private int imageY = getImage().getHeight() / 1;
  private int frame;
  Color color = Color.WHITE;
  private String direction;
  private String Level;
  private int animCount = 0;
  private int speed = 2;
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
  public void act() 
  {      
      movement();
      throwdagger();
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
      if(getWorld().getColorAt(getX(), getY() - speed).equals(color))
      {
          setLocation(getX(), getY() - speed);
          getImage().scale(imageX, imageY);
      }
    }
    else if(Greenfoot.isKeyDown("s") )
    {
      direction = "down";
      if(animCount % 10 == 0)
      {
        animateDown();
      }
      if(getWorld().getColorAt(getX(), getY() + speed).equals(color))
      {
          setLocation(getX(), getY() + speed);
          getImage().scale(imageX, imageY);
      }
    }
    else if(Greenfoot.isKeyDown("a"))
    {
      direction = "left";
      if(animCount % 10 == 0)
      {
        animateLeft();
      }
      if(getWorld().getColorAt(getX() - speed, getY()).equals(color))
      {
          setLocation(getX() - speed, getY());
          getImage().scale(imageX, imageY);
      }
    }
    else if(Greenfoot.isKeyDown("d"))
    {
      direction = "right";
      if(animCount % 10 == 0)
      {
        animateRight();
      }
      if(getWorld().getColorAt(getX() + speed, getY()).equals(color))
      {
          setLocation(getX() + speed, getY());
          getImage().scale(imageX, imageY);
      }
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
  public void throwdagger()
  {
      if(Dagger.click == true)
      {
          if(Greenfoot.isKeyDown("w"))
          {
              getWorld().addObject(new Daggerknife("up"), getX(), getY());
              Dagger.click = false;
          }
          else if(Greenfoot.isKeyDown("s"))
          {
              getWorld().addObject(new Daggerknife("down"), getX(), getY());
              Dagger.click = false;
          }
          else if(Greenfoot.isKeyDown("a"))
          {
              getWorld().addObject(new Daggerknife("left"), getX(), getY());
              Dagger.click = false;
          }
          else if(Greenfoot.isKeyDown("d"))
          {
              getWorld().addObject(new Daggerknife("right"), getX(), getY());
              Dagger.click = false;
          }
      }
  }
}