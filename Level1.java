import greenfoot.*;
public class Level1 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    public String Level = "Level1";
    public Level1()
    {    
        super(1084, 578, 1);
        addObject(new Level1Other(), 544, 289);
        addObject(new MainCharacter("Level1"), 830, 530);
        addObject(new EnemyCharacter(400, 550, "Horizontal"), 440, 40);
        addObject(new EnemyCharacter(100, 450, "Vertical"), 190, 155);
        addObject(new EnemyCharacter(300, 500, "Horizontal"), 430, 490);
        addObject(new LevelCheckpoint(), 225, 15);
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
        addObject(scoreboard, 50, 10);
    }
    public void attackoptions()
    {
        addObject(new Dagger(), 1038, 532);
    }
}