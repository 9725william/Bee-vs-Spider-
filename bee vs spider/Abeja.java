import greenfoot.*;  // (World, Actor, GreenfootImage, Greenfoot and MouseInfo)

/**
 * la abeja se movera por el ecenario(primeras clases)
 * 
 * @author (william andres Rodriguez Orozco) 
 * @version (1)
 */
public class Abeja extends Actor
{
    private GreenfootImage[] images = new GreenfootImage[4];
    private int currentImage;
    boolean isTurning;
    private int puntaje;
    private int vidas;
    /**
     * Act - do whatever the Abeja wants to do. This method is called whenever
     * the 'Act' or 'Run' button gets pressed in the environment.
     */
    
    public Abeja(){
        
        //(de esta forma podimos llamar los arreglos noermalmente)
        
        //images[0] = new GreenfootImage("bee1.png");
        //images[1] = new GreenfootImage("bee2.png");
        //images[2] = new GreenfootImage("bee3.png");
        //images[3] = new GreenfootImage("bee4.png");
        
        // pero con in siclo while es mas rapido con menos lineas de codigo
        int i = 0;
        while(i<4){
            images[i] = new GreenfootImage("bee"+ (i+1)+".png");
            i = i+1;
        }
        currentImage = 0;
        puntaje = 0;
        vidas = 3;
        isTurning = false;
       }  
       
    // fucnion para que una imagen aparezca de forma prederminada 
    //public Abeja(){
        //setImage(new GreenfootImage("bee2.png"));
    //}
    public void act(){
    // metodo para pedir un nombre al usario   
    //String name = Greenfoot.ask("Dale un nombre de Avatar ?");
    {   animateAbeja();
        caughtByAraña();
        handleMovement();
        turnAtEdge();
        catchFresa();
    }
    //metodo para manejar el personaje con el mause
    MouseInfo mouse = Greenfoot.getMouseInfo();
    if(mouse!=null){
        if(mouse.getButton()==1){
            setLocation(mouse.getX(),mouse.getY());
        }
    }
    move(1);
    {
    move(1);
       if(isAtEdge()){
           turn(180);
       }
    }
    
    Greenfoot.getRandomNumber(15);
        
        // aca se llama el metodo para la que la abeja traspace los pared
     move(1);
           if(atRightEdge()){
               setLocation(6,getY());
            }
            else if(atBottomEdge()){
               setLocation(getX(),6);
            }
            else if(atLeftEdge()){
               setLocation(getWorld().getWidth()-20,getY());
            }
            else if(atTopEdge()){
               setLocation(getX(),getWorld().getHeight()-20);
            }
            catchFresa();
            
           
        
    }// metodo para animar la abeja mediante dos imagenes 
    private void animateAbeja(){
        
        if (currentImage ==3)
        currentImage = 0;
        else
        currentImage++;
        setImage(images[currentImage]);
    }

    private void caughtByAraña(){
        if(isTouching(Araña.class)){
            this.setLocation(20,20);
            this.vidas--;
            if(vidas<0){
                FinJuego();
            }
        }
    }
        //metodo para terminar el juego 
    private void FinJuego(){
        Greenfoot.stop();
    }
    private boolean atRightEdge(){
        if(getX() > getWorld().getWidth()-20)
           return true;
        else
           return false;
           
        
    }
    // creacion de metodos para que la abaeja al tocar las pared siga el recorriedo
    private boolean atBottomEdge(){
        if(getY() > getWorld().getHeight()-20)
           return true;
        else
           return false;
        
    }
    private boolean atTopEdge() {
        if(getY() < 6)
           return true;
        else
           return false;
        
    }
    private boolean atLeftEdge(){
        if(getX() < 6)
           return true;
        else
           return false;
    }
    private void catchFresa()
     {
        if(isTouching(Fresa.class)){
            removeTouching(Fresa.class);
            Greenfoot.playSound("comida.wav");
            puntaje++;
            getWorld().addObject(new Fresa(),Greenfoot.getRandomNumber(getWorld().getWidth()),
            Greenfoot.getRandomNumber(getWorld().getHeight()));   
        }
    }
    private void catchFresa2(){
        Actor Fresa = getOneIntersectingObject(Fresa.class);
        if(Fresa != null){
            getWorld().removeObject(Fresa);
        }
    }
    // metodo par que la abeja gire segun la tecla oprimida por el usuario 
    private void handleMovement(){
         move(1);
         if(Greenfoot.isKeyDown("Left")){
               turn(-2);
               isTurning =true;
               setImage(images[2]);
            }
            else if(Greenfoot.isKeyDown("Right")){
               turn(2);
               isTurning =true;
               setImage(images[3]);
            }
            else if (getImage() == images[0] && !isTurning){

            }
         else{
                isTurning =false;
            }
     }
    private void turnAtEdge(){
          if(atRightEdge()){
               setLocation(6,getY());
            }
            else if(atBottomEdge()){
               setLocation(getX(),6);
            }
            else if(atLeftEdge()){
               setLocation(getWorld().getWidth()-20,getY());
            }
            else if(atTopEdge()){
               setLocation(getX(),getWorld().getHeight()-20);
            }
     }
}

