import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class NextLevelButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class NextLevelButton extends Actor
{
    /**
     * Act - do whatever the NextLevelButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here. 
    }
    public NextLevelButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/4, image.getHeight()/4);
        setImage(image);
    }
}
