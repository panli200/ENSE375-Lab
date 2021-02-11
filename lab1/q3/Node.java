/*
 * This is Node class file. There are the two pointers in a Node: previous and next.
 * Adding a new Node before or after a Node.
 */


/**
 *
 * @author lipan
 */
public class Node {
    public Node previous,next;
    public int value;
    
    //Node constructor 
    Node(int value) {   
        this.value = value;
    }
    
    //Add a new Node in the next position
    public void joinNext( Node next){
        this.next = next;  
        next.previous = this;
    }
    
    //Add a new Node in the previous position
    public void joinPrevious ( Node previous){
        this.previous = previous;
        previous.next = this;
    }
    
    //Move the next Node and set it to be null
    public void removeNext(){                    
        this.next = null;       
    }
    
    //Move the previous and set it to be null
    public void removePrevious(){
        this.previous = null;     
    }
    
    //Get the next Node
    Node getNext(){
        return this.next;
    }
    
    //Get the previous Node
    Node getPrevious(){
        return this.previous;      
    } 
    
    //Get the value of the current Node
    int getValue(){
        return this.value;
    }
}
