/*
 * The DoublyLinkedList Testing. We can create a List by adding new nodes to the front and back either ways.
 * Removing nodes from the front and back then print out its values. 
 * Printing the list both forwards and in reverse after moving modes.
 * The testing main funtion is following the testing code of the assignment.
 */


/**
 *
 * @author lipan
 */
public class Main {
     public static void main(String[] args) {
        // Test code copied from the assignment instruction
        List myList = new List();
        myList.append(3);
        myList.append(4);
        myList.append(5);
        myList.prepend(2);
        myList.prepend(1);
        System.out.println("Print the list forward:");
        myList.printForward();
        System.out.println();
        System.out.println("Print the list backward:");
        myList.printReverse();
        System.out.println();
        System.out.println("Remove and print the first element:");
        System.out.println(myList.popFront());
        System.out.println("Remove and print the last element:");
        System.out.println(myList.popBack());
        System.out.println();
        System.out.println("Print the list forward:");
        myList.printForward();
        System.out.println();
        System.out.println("Print the list backward:");
        myList.printReverse(); 
    }
    
}
