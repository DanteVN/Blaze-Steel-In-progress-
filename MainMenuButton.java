import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class MainMenuButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class MainMenuButton extends Actor
{
    /**
     * Act - do whatever the MainMenuButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public MainMenuButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth(), image.getHeight());
        setImage(image);
    }
}
