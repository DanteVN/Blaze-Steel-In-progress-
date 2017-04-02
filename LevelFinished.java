import greenfoot.*;
public class LevelFinished extends World
{
    public LevelFinished()
    {    
        super(900, 500, 1);
        addObject(new MainMenuButton(), 450, 400);
        addObject(new ScoreAf(),452,300);
        //showText("SCORE: "+EnemyCharacter.scoreaf,452,300);
    }
}