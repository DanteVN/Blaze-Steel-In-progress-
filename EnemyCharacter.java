import greenfoot.*;
import java.awt.Color;
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
  private int max;
  private int min;
  int enemystatus = 1;
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
  public static int Life =3;
  int delay =120;
  public static int scoreaf = 0;
  public EnemyCharacter(int min, int max, String dir)
  {
    this.min = min;
    this.max = max;
    pathdirection = dir;
    
  }
  public void act() 
  {
    movement();
    stabbed();
    delay++;
    Die();
    
    
    if(enemystatus == 1)
    {
      Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
   
      if (delay>=120&&mainCharacter!=null)
      {
          Greenfoot.playSound("swordslash.wav");
          Life--;
          delay=0;
     }
    }
  }
  public void Die(){
      if(Life==0){
          Greenfoot.setWorld(new GameOver());
          Life=3;
        }
    }
  public void movement()
  {
    if(pathdirection.equals("Vertical"))
    {
      if((getY() <= max) && (direction == 1))
      {
        path = "down";
        if(animCount % 10 == 0)
        {
          animateDown();
        }
        setLocation(getX(), getY() + speed);
        getImage().scale(imageX, imageY);
      }
      else if((getY() >= max) && (direction == 1))
      {
        direction = -1;
        path = "up";
        if(animCount % 10 == 0)
        {
          animateUp();
        }
        setLocation(getX(), getY() - speed);
        getImage().scale(imageX, imageY);
      }
      else if((getY() >= min) && (direction == -1))
      {
        path = "up";
        if(animCount % 10 == 0)
        {
          animateUp();
        }
        setLocation(getX(), getY() - speed);
        getImage().scale(imageX, imageY);
      }
      else if((getY() <= min) && (direction == -1))
      {
        direction = 1;
        path = "down";
        if(animCount % 10 == 0)
        {
          animateDown();
        }
        setLocation(getX(), getY() + speed);
        getImage().scale(imageX, imageY);
      }
    }
    else if (pathdirection.equals("Horizontal"))
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
    else
    {   
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
  public void stabbed()
  {
      Actor dagger = getOneIntersectingObject(Daggerknife.class);
      if(dagger!=null)
      {
          World world = getWorld();
          world.removeObject(dagger);
          if((getWorld() instanceof Level1) && enemystatus == 1)
          {
              Level1 level1 = (Level1)world;
              Scoreboard scoreboard = level1.getScore();
              scoreboard.addScore();
              scoreaf+=100;
          }
          if((getWorld() instanceof Level2) && enemystatus == 1)
          {
              Level2 level2 = (Level2)world;
              Scoreboard scoreboard = level2.getScore();
              scoreboard.addScore();
              scoreaf+=100;
          }
          if((getWorld() instanceof Level3) && enemystatus == 1)
          {
              Level3 level3 = (Level3)world;
              Scoreboard scoreboard = level3.getScore();
              scoreboard.addScore();
              scoreaf+=100;
          }
          Greenfoot.playSound("Knife_or_dagger_stab_.wav");
          speed = 0;
          up = dead;
          up1 = dead;
          up2 = dead;
          down = dead;
          down1 = dead;
          down2 = dead;
          left = dead;
          left1 = dead;
          left2 = dead;
          right = dead;
          right1 = dead;
          right2 = dead;
          getImage().scale(imageX, imageY);
          enemystatus = 0;
      }
  }
}