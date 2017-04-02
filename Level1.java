import greenfoot.*;
public class Level1 extends World
{
  Scoreboard scoreboard = new Scoreboard();
  
  public Level1()
  {    
    super(1084, 578, 1);
    addObject(new Level1Other(), 544, 289);
    addObject(new Dagger(), 1038, 532);
    addObject(new Sword(), 1038, 440);
    addObject(new EnemyCharacter(80, 450, "Vertical"), 190, 155);
    addObject(new EnemyCharacter(300, 600, "Horizontal"), 430, 490);
    addObject(new MainCharacter(), 830, 530);
    addObject(new LevelCheckpoint(), 225, 15);
    addObject(new RestartButton(), 60, 70);
    addObject(new MainMenuButton(), 979, 60);
    addObject(new Timer(), 980, 10);
    addObject(scoreboard, 60, 10);
    addObject(new LifeCounter(),30,565);
    EnemyCharacter.Life = 3;
    EnemyCharacter.scoreaf = 0;
  }
  public Scoreboard getScore()
  {
    return scoreboard;
  }
}