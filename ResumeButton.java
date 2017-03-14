import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)
/**
 * Write a description of class ResumeButton here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class ResumeButton extends Actor
{
    /**
     * Act - do whatever the ResumeButton wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() 
    {
        // Add your action code here.
    }
    public ResumeButton()
    {    
        GreenfootImage image = getImage();
        image.scale(image.getWidth()/8, image.getHeight()/8);
        setImage(image);
    }
}
