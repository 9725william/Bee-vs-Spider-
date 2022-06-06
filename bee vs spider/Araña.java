import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Araña here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Araña extends Bug
{
    /**
     * Act - do whatever the Araña wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
{
    turnAtEdge();
    move(1);
    
    // el metodo Greenfoot.getRandomNumber permite mover al objeto de forma ramdom
    if(Greenfoot.getRandomNumber(100)<20)
    {
        turn (Greenfoot.getRandomNumber(90)-45);
    }
    //
    //el metodo isAtEdge permite que objeto cambie de rumbo si coliciona con el mundo
    
    { 
        move(1);
        
       if(isAtEdge())
       {
           turn(180);
       }
    }
    //
    //el metodo get y sus deribadas sintaxis permite calcular las cordenadas del objeto 
      if((getX() > getWorld().getWidth()/2) || (getY() < getWorld().getHeight()/2))
    {
        move(2);
    }
    turnAtEdge();
}
}
