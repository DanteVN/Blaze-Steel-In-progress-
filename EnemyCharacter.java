import greenfoot.*;
public class EnemyCharacter extends Actor
{
  int imageX = getImage().getWidth() * 1;
  int imageY = getImage().getHeight() * 1;
  int frame;
  String path;
  String pathdirection;
  int direction = 1;
  int movementDirection;
  int animCount = 0;
  int speed = 1;
  int max;
  int min;
  int enemystatus = 1;
  GreenfootImage up = new GreenfootImage("lancer_13.png");
  GreenfootImage up1 = new GreenfootImage("lancer_14.png");
  GreenfootImage up2 = new GreenfootImage("lancer_16.png");
  GreenfootImage upattack1 = new GreenfootImage("lancer_14u.png");
  GreenfootImage upattack2 = new GreenfootImage("lancer_16u.png");
  GreenfootImage down = new GreenfootImage("lancer_1.png");
  GreenfootImage down1 = new GreenfootImage("lancer_2.png");
  GreenfootImage down2 = new GreenfootImage("lancer_4.png");
  GreenfootImage downattack1 = new GreenfootImage("lancer_2u.png");
  GreenfootImage downattack2 = new GreenfootImage("lancer_4u.png");
  GreenfootImage left = new GreenfootImage("lancer_5.png");
  GreenfootImage left1 = new GreenfootImage("lancer_6.png");
  GreenfootImage left2 = new GreenfootImage("lancer_8.png");
  GreenfootImage leftattack = new GreenfootImage("lancer_8s.png");
  GreenfootImage right = new GreenfootImage("lancer_9.png");
  GreenfootImage right1 = new GreenfootImage("lancer_10.png");
  GreenfootImage right2 = new GreenfootImage("lancer_12.png");
  GreenfootImage rightattack = new GreenfootImage("lancer_12s.png");
  GreenfootImage dead = new GreenfootImage("lancer_dead.png");
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
    slashed();
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
  public void Die()
  {
    if(Life==0)
    {
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
    Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
    if(mainCharacter!=null && enemystatus == 1)
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
      frame++;
    }
    else
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
  }
  public void animateDown()
  {
    Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
    if(mainCharacter!=null && enemystatus == 1)
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
      frame++;
    }
    else
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
  }
  public void animateLeft()
  {
    Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
    if(mainCharacter!=null && enemystatus == 1)
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
      frame++;
    }
    else
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
  }
  public void animateRight()
  {
    Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
    if(mainCharacter!=null && enemystatus == 1)
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
      frame++;
    }
    else
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
  }
  public void slashed()
  {
    Actor mainCharacter = getOneIntersectingObject(MainCharacter.class);
    if ((mainCharacter!=null) && (MainCharacter.attack == true))
    {
      World world = getWorld();
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
      enemydead();
      Greenfoot.playSound("swordslash.wav");
      MainCharacter.attack = false;
    }
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
      enemydead();
    }
  }
  public void enemydead()
  {
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