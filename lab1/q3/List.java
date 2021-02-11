/*
 * Double Linked List class, name as List class. The List has both head and tail Nodes.
 * In Double Linked List class,each Node has two pointers. 

 */


/**
 *
 * @author lipan
 */
public class List {
    //A list has a head Node and a tail Node
    Node head;
    Node tail ;
    
    /*Adding a new Node as a head of the List*/
    public void prepend (int input){          
        Node element = new Node (input);//element as a new Node with the value of input
        //If there is no Node in the list, then the head and tail are this Node
        if(head == null){
            head = element;
            tail = element;
        }else{
            //Add a new Node to the beginning of the List*/
            head.joinPrevious(element);       
            head = element; 
        }
    }
    
    /*Adding a new Node as a tail of the List*/
    public void  append (int input){
        Node element = new Node (input);//element as a new Node with the value of input
        //If there is no Node in the list, then the head and tail are this Node 
        if(head == null){
            head = element;
            tail = element;
        }else{ 
            //Add a new Node to the end of the List*/
            tail.joinNext(element);
            tail = element;
        }      
    }
    
    /*Delete the first Node in the List*/
    public int popFront () {
        Node element = head;
        //Change the head Node to the second Node
        head = head.next;
        head.removePrevious();
        //Get the delete Node value
        return element.value;
    }
    
    /*Delete the first Node in the List*/
    public int popBack () {
        Node element = tail;
        //Change the tail Node to the last second Node
        tail = tail.previous;
        tail.removeNext();
        //Get the delete Node value     
        return element.value;
    }
    
    /*Print the List forward*/
    public void printForward (){    
        //Starts the print List from the head
        Node element = head;
        while(element != null ){
            System.out.println(element.value);
            element = element.getNext();
        }
    }
    
    /*Print the List backward*/
    public void printReverse (){
        //Starts the print List from the tail
        Node element = tail;
        while(element != null ){
            System.out.println(element.value);
            element = element.getPrevious();
        }
    }
    
}
