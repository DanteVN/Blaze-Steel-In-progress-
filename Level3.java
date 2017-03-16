import greenfoot.*;
public class Level3 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    private String Level = "Level3";
    public Level3()
    {    
        super(1003, 577, 1);
        addObject(new Level3Other(), 501, 288);
        addObject(new MainCharacter("Level3"), 40, 555);
        addObject(new EnemyCharacter(115, 170, "Vertical"), 65, 115);
        addObject(new EnemyCharacter(195, 300, "Vertical"), 985, 195);
        addObject(new EnemyCharacter(520, 750, "Horizontal"), 750, 190);
        addObject(new EnemyCharacter(265, 380, "Horizontal"), 265, 250);
        addObject(new EnemyCharacter(350, 550, "Horizontal"), 490, 445);
        addObject(new LevelCheckpoint(), 685, 15);
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
        addObject(new Dagger(), 958, 530);
    }
}