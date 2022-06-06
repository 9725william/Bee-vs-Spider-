import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class Bug here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class Bug extends Actor
{
    /**
     * Act - do whatever the Bug wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    public void act()
    {
        // Add your action code here.
    }
    public void turnAtEdge()
    {
        //se convertio en público  deseamos que las subclases utilicen este método.Es nulo porque no devuelve un valor.
        if(isAtEdge()){
            turn(100);
        }
    }
    
    
}
