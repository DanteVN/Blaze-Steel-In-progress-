import greenfoot.*;
public class Level3 extends World
{
    Scoreboard scoreboard = new Scoreboard();
    public Level3()
    {    
        super(1003, 577, 1);
        addObject(new Level3Other(), 501, 288);
        addObject(new Dagger(), 958, 530);
        addObject(new EnemyCharacter(115, 190, "Vertical"), 65, 115);
        addObject(new EnemyCharacter(195, 320, "Vertical"), 985, 195);
        addObject(new EnemyCharacter(520, 750, "Horizontal"), 750, 190);
        addObject(new EnemyCharacter(265, 380, "Horizontal"), 265, 250);
        addObject(new EnemyCharacter(250, 550, "Horizontal"), 490, 445);
        addObject(new MainCharacter(), 40, 555);
        addObject(new LevelCheckpoint(), 685, 15);
        addObject(new RestartButton(), 60, 70);
        addObject(new MainMenuButton(), 900, 60);
        addObject(new Timer(), 900, 10);
        addObject(scoreboard, 60, 10);
    }
    public Scoreboard getScore()
    {
        return scoreboard;
    }
}