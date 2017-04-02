import greenfoot.*;
public class MainCharacter extends Actor
{
  int imageX = getImage().getWidth() / 1;
  int imageY = getImage().getHeight() / 1;
  int frame;
  Color color = Color.WHITE;
  String direction;
  String Level;
  int animCount = 0;
  int speed = 2;
  GreenfootImage up = new GreenfootImage("aluxes_13.png");
  GreenfootImage up1 = new GreenfootImage("aluxes_14.png");
  GreenfootImage up2 = new GreenfootImage("aluxes_16.png");
  GreenfootImage upattack1 = new GreenfootImage("aluxes_14u.png");
  GreenfootImage upattack2 = new GreenfootImage("aluxes_16u.png");
  GreenfootImage down = new GreenfootImage("aluxes_1.png");
  GreenfootImage down1 = new GreenfootImage("aluxes_2.png");
  GreenfootImage down2 = new GreenfootImage("aluxes_4.png");
  GreenfootImage downattack1 = new GreenfootImage("aluxes_2u.png");
  GreenfootImage downattack2 = new GreenfootImage("aluxes_4u.png");
  GreenfootImage left = new GreenfootImage("aluxes_5.png");
  GreenfootImage left1 = new GreenfootImage("aluxes_6.png");
  GreenfootImage left2 = new GreenfootImage("aluxes_8.png");
  GreenfootImage leftattack = new GreenfootImage("aluxes_8s.png");
  GreenfootImage right = new GreenfootImage("aluxes_9.png");
  GreenfootImage right1 = new GreenfootImage("aluxes_10.png");
  GreenfootImage right2 = new GreenfootImage("aluxes_12.png");
  GreenfootImage rightattack = new GreenfootImage("aluxes_12s.png");
  public void act() 
  {      
    movement();
    throwdagger();
    swordattack();
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
    else if (frame == 2)
    {
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
      if(Greenfoot.isKeyDown("up"))
      {
        getWorld().addObject(new Daggerknife("up"), getX(), getY());
        Dagger.click = false;
      }
      else if(Greenfoot.isKeyDown("down"))
      {
        getWorld().addObject(new Daggerknife("down"), getX(), getY());
        Dagger.click = false;
      }
      else if(Greenfoot.isKeyDown("left"))
      {
        getWorld().addObject(new Daggerknife("left"), getX(), getY());
        Dagger.click = false;
      }
      else if(Greenfoot.isKeyDown("right"))
      {
        getWorld().addObject(new Daggerknife("right"), getX(), getY());
        Dagger.click = false;
      }
    }
  }
  public void swordattack()
  {
    if(Sword.click == true)
    {
      if(Greenfoot.isKeyDown("w"))
      {
        if (frame == 1)
        {
          setImage(upattack1);
          getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
          setImage(upattack2);
          getImage().scale(imageX, imageY);
          frame = 0;
        }
        Sword.click = false;
      }
      else if(Greenfoot.isKeyDown("s"))
      {
        if (frame == 1)
        {
          setImage(downattack1);
          getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
          setImage(downattack2);
          getImage().scale(imageX, imageY);
          frame = 0;
        }
        Sword.click = false;
      }
      else if(Greenfoot.isKeyDown("a"))
      {
        if (frame == 1)
        {
          setImage(leftattack);
          getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
          setImage(leftattack);
          getImage().scale(imageX, imageY);
          frame = 0;
        }
        Sword.click = false;
      }
      else if(Greenfoot.isKeyDown("d"))
      {
        if (frame == 1)
        {
          setImage(rightattack);
          getImage().scale(imageX, imageY);
        }
        else if (frame == 2)
        {
          setImage(rightattack);
          getImage().scale(imageX, imageY);
          frame = 0;
        }
        Sword.click = false;
      }
    }
  }
}