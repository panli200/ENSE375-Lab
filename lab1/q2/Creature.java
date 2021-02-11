/*
 * Creature Class 
 */

/**
 *
 * @author lipan
 */

/*Interface movement*/
interface Movement {
    //interface method move which has no body
    public void move();            
}

/*Interface attaching*/
interface Attacking{
    //Interface method attack which has no body
    public void attack();   
}

/*Abstract class implements two interfaces movement and attaching*/
abstract class Creature implements Attacking, Movement{
    
    public abstract void type(); //Abstract method
    @Override
    public abstract void attack(); //Abstract method
    @Override
    public abstract void move(); //Abstract method

}

/*Subclass Humanoid inherit from Creature */
abstract class Humanoid extends Creature {
    //Abstract method type() body for Humanoid class
    @Override
    public void type(){
        System.out.println("The " + this.getClass().getName()+" is humanoid.");
    }   
}

/*Subclass Undead inherit from Creature */
abstract class Undead extends Creature { 
    //Abstract method type() body for Undead class
    @Override
    public void type(){
        System.out.println("The " + this.getClass().getName()+" is undead.");
    }  
}

/*Subclass Familiar inherit from Creature */
abstract class Familiar extends Creature { 
    //Abstract method type() body for Familiar class
    @Override
    public void type(){
        System.out.println("The " + this.getClass().getName()+" is familiar.");
    }  
}

/*Subclass Monster inherit from Creature */
abstract class Monster extends Creature {
    //Abstract method type() body for Monster class
    @Override
    public void type(){
        System.out.println("The " + this.getClass().getName()+" is monster.");
    }  
}

/*Subclass Knight inherit from Humanoid*/
class Knight extends Humanoid{ 
    //Abstract method attack() body for Knight class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a physical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" walks.");
    }
}

/*Subclass Cleric inherit from Humanoid*/
class Cleric extends Humanoid{
    //Abstract method attack() body for Cleric class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a magical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" walks.");
    }
}

/*Subclass Lizardbeing inherit from Humanoid*/
class Lizardbeing extends Humanoid{
    //Abstract method attack() body for Lizardbeing class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a pysical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" walk.");
    }     
}
    
/*Subclass Birdbeing inherit from Humanoid*/
class Birdbeing extends Humanoid{
    //Abstract method attack() body for Birdbeing class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a pysical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" fly.");
    }     
}

/*Subclass Skeleton inherit from Undead*/
class Skeleton extends Undead{
    //Abstract method attack() body for Skeleton class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a pysical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" walk.");
    }   
}

/*Subclass Ghost inherit from Undead*/
class Ghost extends Undead{
    //Abstract method attack() body for Ghost class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a magical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" teleport.");
    }   
}

/*Subclass Fairie inherit from Familar*/
class Fairie extends Familiar{
    //Abstract method attack() body for Fairie class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a magical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" fly.");
    }   
}

/*Subclass Gremlin inherit from Familar*/
class Gremlin extends Familiar{
    //Abstract method attack() body for Gremlin class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a pysica attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" fly.");
    }   
}

/*Subclass Dragon inherit from Monster*/
class Dragon extends Monster{
    //Abstract method attack() body for Dragon class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a pysical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" fly.");
    }   
}

/*Subclass Cyclops inherit from Monster*/
class Cyclops extends Monster{
    //Abstract method attack() body for Cyclops class
    @Override
    public void attack(){
        System.out.println("The " + this.getClass().getName()+" does a magical attack.");
    }
    @Override
    public void move(){
        System.out.println("The " + this.getClass().getName()+" walk.");
    }   
}





