import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Fresa here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Fresa extends Bug
{
    /**
     * Act - do whatever the Fresa wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act() {
        turnAtEdge();
        
        move(1);
        
        if(Greenfoot.getRandomNumber(100)<20)
    {
        turn (Greenfoot.getRandomNumber(90)-45);
    }
    turnAtEdge();
    }

}
