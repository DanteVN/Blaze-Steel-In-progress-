import greenfoot.*;
public class TipsandHints extends World
{
  public TipsandHints()
  {    
    super(900, 500, 1);
    addObject(new ResumeButton(), 855, 35);
    addObject(new PreviousButton(), 440, 440);
  }
}