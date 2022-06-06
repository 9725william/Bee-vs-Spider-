import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * Write a description of class fondo here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class fondo extends World
{
    /**
     * Constructor for objects of class fondo.
     * 
     */
    public fondo()
    {    
        // Create a new world with 600x400 cells with a cell size of 1x1 pixels.
        super(600, 400, 1);
        prepare();
    }
    
    /**
     * Prepare the world for the start of the program.
     * That is: create the initial objects and add them to the world.
     */

    private void prepare()
    {
        addObject(new Abeja(),150,100);
        addObject(new Araña(),50,90);

        Fresa fresa = new Fresa();
        addObject(fresa,436,151);
        Fresa fresa2 = new Fresa();
        addObject(fresa2,93,314);
        Fresa fresa3 = new Fresa();
        addObject(fresa3,370,289);
        Fresa fresa4 = new Fresa();
        addObject(fresa4,298,74);
    }
        
    }
 
