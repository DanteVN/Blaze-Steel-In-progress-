import greenfoot.*;
public class Level2 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    public Level2()
    {    
        super(1091, 585, 1);
        addObject(new Level2Other(), 545, 292);
        addObject(new Dagger(), 1046, 538);
        addObject(new EnemyCharacter(90, 450, "Vertical"), 480, 100);
        addObject(new EnemyCharacter(50, 190, "Vertical"), 780, 70);
        addObject(new EnemyCharacter(510, 900, "Horizontal"), 725, 380);
        addObject(new EnemyCharacter(270, 375, "Horizontal"), 375, 535);
        addObject(new MainCharacter(), 720, 550);
        addObject(new LevelCheckpoint(), 815, 15);
        addObject(new RestartButton(), 60, 70);
        addObject(new MainMenuButton(), 986, 60);
        addObject(new Timer(), 982, 10);
        addObject(scoreboard, 60, 10);
    }
    public Scoreboard getScore()
    {
        return scoreboard;
    }
}