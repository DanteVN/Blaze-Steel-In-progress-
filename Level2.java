import greenfoot.*;
public class Level2 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    private String Level = "Level2";
    public Level2()
    {    
        super(1091, 585, 1);
        addObject(new Level2Other(), 545, 292);
        addObject(new MainCharacter("Level2"), 720, 550);
        addObject(new EnemyCharacter(90, 300, "Vertical"), 480, 100);
        addObject(new EnemyCharacter(50, 130, "Vertical"), 780, 70);
        addObject(new EnemyCharacter(700, 800, "Horizontal"), 725, 380);
        addObject(new EnemyCharacter(300, 375, "Horizontal"), 375, 535);
        addObject(new LevelCheckpoint(), 815, 15);
        addObject(new Timer(), 990, 10);
        prepare();
        attackoptions();
    }
    public Scoreboard getScore()
    {
        return scoreboard;
    }
    public void prepare()
    {
        addObject(scoreboard, 40, 10);
    }
    public void attackoptions()
    {
        addObject(new Dagger(), 1046, 538);
    }
}