/*
 * The application for creating different creatures for a tactical role playing game.
 * All creatures list as following table:
 *
 *  Class  	Creature Type   Attack Type	Movement Type
 *  Knight	Humanoid        Physical           Walk
 *  Cleric	Humanoid        Magical            Walk
 *  Skeleton	Undead          Physical           Walk
 *  Ghost	Undead          Magical	          Teleport
 *  Birdbeing	Humanoid        Physical            Fly
 *  Lizardbeing	Humanoid    	Physical           Walk
 *  Fairie	Familiar    	Magical             Fly
 *  Gremlin	Familiar        Physical            Fly
 *  Dragon	Monster         Physical            Fly
 *  Cyclops	Monster         Magical             Walk
 *
 */

/**
 *
 * @author lipan
 */
public class Main {
    /*Main funtion is for testing different creatures*/
    public static void main(String[] args) {
        //Create a Knight, show the Creature, Attack and Movement Types
        Creature knight = new Knight();
        knight.type();
        knight.attack();
        knight.move();

        //Create a Cleric, show the Creature, Attack and Movement Types
        Creature cleric = new Cleric();
        cleric.type();
        cleric.attack();
        cleric.move();
        
        //Create a Skeleton, show the Creature, Attack and Movement Types
        Creature skeleton = new Skeleton();
        skeleton.type();
        skeleton.attack();
        skeleton.move();

        //Create a Ghost, show the Creature, Attack and Movement Types
        Creature ghost = new Ghost();
        ghost.type();
        ghost.attack();
        ghost.move();
        
        //Create a Birdbeing, show the Creature, Attack and Movement Types
        Creature birdbeing = new Birdbeing();
        birdbeing.type();
        birdbeing.attack();
        birdbeing.move();

        //Create a Lizardbeing, show the Creature, Attack and Movement Types
        Creature lizardbeing = new Lizardbeing();
        lizardbeing.type();
        lizardbeing.attack();
        lizardbeing.move();
    
        //Create a Fairie, show the Creature, Attack and Movement Types
        Creature fairie = new Fairie();
        fairie.type();
        fairie.attack();
        fairie.move();
        
        //Create a Gremlin, show the Creature, Attack and Movement Types
        Creature gremlin = new Gremlin();
        gremlin.type();
        gremlin.attack();
        gremlin.move();
        
        //Create a Gragon, show the Creature, Attack and Movement Types
        Creature dragon = new Dragon();
        dragon.type();
        dragon.attack();
        dragon.move();
        
        //Create a Cyclops, show the Creature, Attack and Movement Types
        Creature cyclops = new Cyclops();
        cyclops.type();
        cyclops.attack();
        cyclops.move(); 
    }

}
